package us.bojie.doordashlite.ui.main.restaurant;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import javax.inject.Inject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import dagger.android.support.DaggerFragment;
import us.bojie.doordashlite.R;
import us.bojie.doordashlite.viewmodel.ViewModelProviderFactory;

public class RestaurantsFragment extends DaggerFragment {
    private static final String TAG = "RestaurantsFragment";

    private RestaurantsViewModel viewModel;
    private RecyclerView recyclerView;
    private ProgressBar progressBar;
    private TextView errorTextView;

    @Inject
    ViewModelProviderFactory providerFactory;

    @Inject
    RestaurantsAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_restaurants, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        recyclerView = view.findViewById(R.id.recycler_view);
        progressBar = view.findViewById(R.id.progress_bar);
        errorTextView = view.findViewById(R.id.tv_error);
        viewModel = ViewModelProviders.of(this, providerFactory).get(RestaurantsViewModel.class);
        initRecyclerView();
        subscribeObservers();
    }

    private void subscribeObservers() {
        viewModel.observeRestaurants().removeObservers(getViewLifecycleOwner());
        viewModel.observeRestaurants().observe(getViewLifecycleOwner(), listResource -> {
            if (listResource != null) {
                switch (listResource.status) {
                    case LOADING:
                        Log.d(TAG, "onChanged: Loading...");
                        progressBar.setVisibility(View.VISIBLE);
                        break;
                    case SUCCESS:
                        Log.d(TAG, "onChanged: get restaurants....");
                        progressBar.setVisibility(View.GONE);
                        errorTextView.setVisibility(View.GONE);
                        adapter.submitList(listResource.data);
                        break;
                    case ERROR:
                        Log.d(TAG, "onChanged: Error... " + listResource.message);
                        progressBar.setVisibility(View.GONE);
                        errorTextView.setText(listResource.message);
                        errorTextView.setVisibility(View.VISIBLE);
                        break;
                }
            }
        });
    }

    private void initRecyclerView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        DividerItemDecoration itemDecoration = new DividerItemDecoration(getContext(),
                layoutManager.getOrientation());
        recyclerView.addItemDecoration(itemDecoration);
        recyclerView.setAdapter(adapter);
    }
}

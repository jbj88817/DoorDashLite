package us.bojie.doordashlite.ui.main.restaurant;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import javax.inject.Inject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import dagger.android.support.DaggerFragment;
import us.bojie.doordashlite.R;
import us.bojie.doordashlite.data.models.Restaurant;
import us.bojie.doordashlite.util.Resource;
import us.bojie.doordashlite.viewmodel.ViewModelProviderFactory;

public class RestaurantsFragment extends DaggerFragment {
    private static final String TAG = "RestaurantsFragment";

    private RestaurantsViewModel viewModel;
    private TextView textView;

    @Inject
    ViewModelProviderFactory providerFactory;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_restaurants, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        textView = view.findViewById(R.id.test_text_view);
        viewModel = ViewModelProviders.of(this, providerFactory).get(RestaurantsViewModel.class);
        subscribeObservers();
    }

    private void subscribeObservers() {
        viewModel.observeRestaurants().removeObservers(getViewLifecycleOwner());
        viewModel.observeRestaurants().observe(getViewLifecycleOwner(), new Observer<Resource<List<Restaurant>>>() {
            @Override
            public void onChanged(Resource<List<Restaurant>> listResource) {
                if (listResource != null) {
                    switch (listResource.status) {
                        case LOADING:
                            Log.d(TAG, "onChanged: Loading...");
                            break;
                        case SUCCESS:
                            Log.d(TAG, "onChanged: get restaurants....");
                            textView.setText(listResource.data.get(0).getName());
                            break;
                        case ERROR:
                            Log.d(TAG, "onChanged: Error... " + listResource.message);
                            break;
                    }
                }
            }
        });
    }
}

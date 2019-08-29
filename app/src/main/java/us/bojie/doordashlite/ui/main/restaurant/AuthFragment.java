package us.bojie.doordashlite.ui.main.restaurant;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import javax.inject.Inject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProviders;
import dagger.android.support.DaggerFragment;
import us.bojie.doordashlite.R;
import us.bojie.doordashlite.viewmodel.ViewModelProviderFactory;

public class AuthFragment extends DaggerFragment {
    private static final String TAG = "AuthFragment";

    private AuthViewModel viewModel;
    private Button loginButton;
    private ProgressBar progressBar;
    private TextView errorTextView;
    private EditText userEmailEtuserEmailEt;
    private EditText userPasswordEt;


    @Inject
    ViewModelProviderFactory providerFactory;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_auth_login, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        loginButton = view.findViewById(R.id.btn_login);
        progressBar = view.findViewById(R.id.progress_bar);
        errorTextView = view.findViewById(R.id.tv_error);
        userEmailEtuserEmailEt = view.findViewById(R.id.et_user_name);
        userPasswordEt = view.findViewById(R.id.et_pwd);
        viewModel = ViewModelProviders.of(this, providerFactory).get(AuthViewModel.class);
        loginButton.setOnClickListener(v -> {
            String email = userEmailEtuserEmailEt.getText().toString();
            String password = userPasswordEt.getText().toString();
            verifyFields();
            subscribeObservers(email, password);
        });

    }

    private void verifyFields() {

    }

    private void subscribeObservers(String email, String password) {
        viewModel.observeAuth(email, password).removeObservers(getViewLifecycleOwner());
        viewModel.observeAuth(email, password).observe(getViewLifecycleOwner(), listResource -> {
            if (listResource != null) {
                switch (listResource.status) {
                    case LOADING:
                        Log.d(TAG, "onChanged: Loading...");
                        progressBar.setVisibility(View.VISIBLE);
                        break;
                    case SUCCESS:
                        Log.d(TAG, "onChanged: get auth....");
                        progressBar.setVisibility(View.GONE);
                        errorTextView.setVisibility(View.GONE);
                        Log.d(TAG, "get auth...." + listResource.data.getToken());
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
}

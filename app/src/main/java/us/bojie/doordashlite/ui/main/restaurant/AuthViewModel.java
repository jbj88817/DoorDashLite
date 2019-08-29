package us.bojie.doordashlite.ui.main.restaurant;

import android.app.Application;

import javax.inject.Inject;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.ViewModel;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import us.bojie.doordashlite.R;
import us.bojie.doordashlite.data.models.AuthRequest;
import us.bojie.doordashlite.data.models.AuthResponse;
import us.bojie.doordashlite.data.remote.MainApi;
import us.bojie.doordashlite.util.Resource;

public class AuthViewModel extends ViewModel {

    private Application context;
    private final MainApi mainApi;
    private MediatorLiveData<Resource<AuthResponse>> authResLiveData;

    @Inject
    AuthViewModel(Application context, MainApi mainApi) {
        this.context = context;
        this.mainApi = mainApi;
    }

    LiveData<Resource<AuthResponse>> observeAuth(String userEmail, String password) {
        if (authResLiveData == null) {
            authResLiveData = new MediatorLiveData<>();
            authResLiveData.setValue(Resource.loading(null));

            AuthRequest authRequest = new AuthRequest();
            authRequest.setEmail(userEmail);
            authRequest.setPassword(password);
            final LiveData<Resource<AuthResponse>> source = LiveDataReactiveStreams.fromPublisher(
                    mainApi.getAuthToken(authRequest)
                            .onErrorReturn(throwable -> {
                                AuthResponse authResponse = new AuthResponse();
                                authResponse.setToken("-1");
                                return authResponse;
                            })
                            .map((Function<AuthResponse, Resource<AuthResponse>>) authResponse -> {
                                if (authResponse.getToken().equals("-1")) {
                                    return Resource.error(context.getString(R.string.something_went_wrong), null);
                                }
                                return Resource.success(authResponse);
                            })
                            .subscribeOn(Schedulers.io())
            );
            authResLiveData.addSource(source, listResource -> {
                authResLiveData.setValue(listResource);
                authResLiveData.removeSource(source);
            });
        }
        return authResLiveData;
    }
}

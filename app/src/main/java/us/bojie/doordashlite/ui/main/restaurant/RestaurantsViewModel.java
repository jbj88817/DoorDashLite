package us.bojie.doordashlite.ui.main.restaurant;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.ViewModel;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import us.bojie.doordashlite.R;
import us.bojie.doordashlite.data.models.Restaurant;
import us.bojie.doordashlite.data.remote.MainApi;
import us.bojie.doordashlite.util.Constants;
import us.bojie.doordashlite.util.Resource;

public class RestaurantsViewModel extends ViewModel {

    private final MainApi mainApi;
    private MediatorLiveData<Resource<List<Restaurant>>> restaurants;
    private Application context;

    @Inject
    RestaurantsViewModel(Application context, MainApi mainApi) {
        this.context = context;
        this.mainApi = mainApi;
    }

    LiveData<Resource<List<Restaurant>>> observeRestaurants() {
        if (restaurants == null) {
            restaurants = new MediatorLiveData<>();
            restaurants.setValue(Resource.loading(null));

            final LiveData<Resource<List<Restaurant>>> source = LiveDataReactiveStreams.fromPublisher(
                    mainApi.getRestaurantByLatLng(Constants.LAT, Constants.LNG)
                            .onErrorReturn(throwable -> {
                                Restaurant restaurant = new Restaurant();
                                restaurant.setId(-1);
                                List<Restaurant> restaurants = new ArrayList<>();
                                restaurants.add(restaurant);
                                return restaurants;
                            })
                            .map((Function<List<Restaurant>, Resource<List<Restaurant>>>) restaurants -> {
                                if (restaurants.size() > 0) {
                                    if (restaurants.get(0).getId() == -1) {
                                        return Resource.error(context.getString(R.string.something_went_wrong), null);
                                    }
                                }
                                return Resource.success(restaurants);
                            })
                            .subscribeOn(Schedulers.io())
            );
            restaurants.addSource(source, listResource -> {
                restaurants.setValue(listResource);
                restaurants.removeSource(source);
            });
        }
        return restaurants;
    }
}

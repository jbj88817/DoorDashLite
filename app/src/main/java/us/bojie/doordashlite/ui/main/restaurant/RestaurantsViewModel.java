package us.bojie.doordashlite.ui.main.restaurant;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import us.bojie.doordashlite.data.models.Restaurant;
import us.bojie.doordashlite.data.remote.MainApi;
import us.bojie.doordashlite.util.Constants;
import us.bojie.doordashlite.util.Resource;

public class RestaurantsViewModel extends ViewModel {

    private final MainApi mainApi;
    private MediatorLiveData<Resource<List<Restaurant>>> restaurants;

    @Inject
    public RestaurantsViewModel(MainApi mainApi) {
        this.mainApi = mainApi;
    }

    public LiveData<Resource<List<Restaurant>>> observeRestaurants() {
        if (restaurants == null) {
            restaurants = new MediatorLiveData<>();
            restaurants.setValue(Resource.loading((List<Restaurant>) null));

            final LiveData<Resource<List<Restaurant>>> source = LiveDataReactiveStreams.fromPublisher(
                    mainApi.getRestaurantByLatLng(Constants.LAT, Constants.LNG, 0, 10)
                            .onErrorReturn(new Function<Throwable, List<Restaurant>>() {
                                @Override
                                public List<Restaurant> apply(Throwable throwable) {
                                    Restaurant restaurant = new Restaurant();
                                    restaurant.setId(-1);
                                    List<Restaurant> restaurants = new ArrayList<>();
                                    restaurants.add(restaurant);
                                    return restaurants;
                                }
                            })
                            .map(new Function<List<Restaurant>, Resource<List<Restaurant>>>() {
                                @Override
                                public Resource<List<Restaurant>> apply(List<Restaurant> restaurants) {
                                    if (restaurants.size() > 0) {
                                        if (restaurants.get(0).getId() == -1) {
                                            return Resource.error("Something went wrong", null);
                                        }
                                    }
                                    return Resource.success(restaurants);
                                }
                            })
                            .subscribeOn(Schedulers.io())
            );
            restaurants.addSource(source, new Observer<Resource<List<Restaurant>>>() {
                @Override
                public void onChanged(Resource<List<Restaurant>> listResource) {
                    restaurants.setValue(listResource);
                    restaurants.removeSource(source);
                }
            });
        }
        return restaurants;
    }
}

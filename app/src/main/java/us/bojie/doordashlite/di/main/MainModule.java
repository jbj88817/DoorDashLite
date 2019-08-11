package us.bojie.doordashlite.di.main;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import us.bojie.doordashlite.data.remote.MainApi;
import us.bojie.doordashlite.ui.main.restaurant.RestaurantsAdapter;

@Module
public class MainModule {

    @MainScope
    @Provides
    static MainApi provideMainApi(Retrofit retrofit) {
        return retrofit.create(MainApi.class);
    }

    @MainScope
    @Provides
    static RestaurantsAdapter provideRestaurantsAdapter() {
        return new RestaurantsAdapter();
    }
}

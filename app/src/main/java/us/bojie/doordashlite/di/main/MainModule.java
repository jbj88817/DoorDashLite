package us.bojie.doordashlite.di.main;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import us.bojie.doordashlite.data.remote.MainApi;

@Module
public class MainModule {

    @MainScope
    @Provides
    static MainApi provideMainApi(Retrofit retrofit) {
        return retrofit.create(MainApi.class);
    }
}

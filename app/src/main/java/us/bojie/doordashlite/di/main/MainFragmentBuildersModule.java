package us.bojie.doordashlite.di.main;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import us.bojie.doordashlite.ui.main.restaurant.RestaurantsFragment;

@Module
public abstract class MainFragmentBuildersModule {

    @ContributesAndroidInjector
    abstract RestaurantsFragment contributeRestaurantsFragment();
}

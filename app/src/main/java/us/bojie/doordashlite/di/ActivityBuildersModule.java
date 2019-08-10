package us.bojie.doordashlite.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import us.bojie.doordashlite.MainActivity;
import us.bojie.doordashlite.di.main.MainFragmentBuildersModule;
import us.bojie.doordashlite.di.main.MainModule;
import us.bojie.doordashlite.di.main.MainScope;
import us.bojie.doordashlite.di.main.MainViewModelModule;

@Module
public abstract class ActivityBuildersModule {

    @MainScope
    @ContributesAndroidInjector(
            modules = {
                    MainFragmentBuildersModule.class,
                    MainViewModelModule.class,
                    MainModule.class
            }
    )
    abstract MainActivity contributeMainActivity();
}


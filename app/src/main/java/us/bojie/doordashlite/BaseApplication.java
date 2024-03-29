package us.bojie.doordashlite;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import us.bojie.doordashlite.di.DaggerAppComponent;

public class BaseApplication extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }
}

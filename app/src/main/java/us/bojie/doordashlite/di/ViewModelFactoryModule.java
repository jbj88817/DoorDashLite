package us.bojie.doordashlite.di;

import androidx.lifecycle.ViewModelProvider;
import dagger.Binds;
import dagger.Module;
import us.bojie.doordashlite.viewmodel.ViewModelProviderFactory;

@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory modelProviderFactory);
}

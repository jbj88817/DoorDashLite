package us.bojie.doordashlite.di.main;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import us.bojie.doordashlite.di.ViewModelKey;
import us.bojie.doordashlite.ui.main.restaurant.RestaurantsViewModel;

@Module
public abstract class MainViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(RestaurantsViewModel.class)
    public abstract ViewModel bindRestaurantsViewModel(RestaurantsViewModel viewModel);
}

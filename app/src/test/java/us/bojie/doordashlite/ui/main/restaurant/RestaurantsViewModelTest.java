package us.bojie.doordashlite.ui.main.restaurant;

import android.app.Application;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import io.reactivex.Flowable;
import us.bojie.doordashlite.data.models.Restaurant;
import us.bojie.doordashlite.data.remote.MainApi;
import us.bojie.doordashlite.util.Resource;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class RestaurantsViewModelTest {

    @Rule
    public InstantTaskExecutorRule instantExecutorRule = new InstantTaskExecutorRule();

    private RestaurantsViewModel viewModel;
    private List<Restaurant> restaurants;

    @Mock
    private Application context;
    @Mock
    private MainApi mainApi;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        viewModel = new RestaurantsViewModel(context, mainApi);
        Type listType = new TypeToken<ArrayList<Restaurant>>() {
        }.getType();
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("Restaurant.json");
        InputStreamReader reader = new InputStreamReader(in);
        restaurants = new Gson().fromJson(reader, listType);
    }

    @Test
    public void observeRestaurants_whenLoading() {
        Flowable<List<Restaurant>> returnedData = Flowable.just(restaurants);
        when(mainApi.getRestaurantByLatLng(any(Double.class), any(Double.class))).thenReturn(returnedData);

        viewModel.observeRestaurants().observeForever(listResource -> {
            int cnt = 0;
            if (listResource.status == Resource.Status.LOADING) {
                cnt++;
            }
            if (listResource.status == Resource.Status.SUCCESS) {
                cnt++;
            }
            if (listResource.status == Resource.Status.ERROR) {
                cnt++;
            }
            // Loading should happening first than success and error
            assertEquals(1, cnt);
        });
    }

    @Test
    public void observeRestaurants_whenSuccess() {
        Flowable<List<Restaurant>> returnedData = Flowable.just(restaurants);
        when(mainApi.getRestaurantByLatLng(any(Double.class), any(Double.class))).thenReturn(returnedData);

        viewModel.observeRestaurants().observeForever(listResource -> {
            if (listResource.status == Resource.Status.SUCCESS) {
                Resource<List<Restaurant>> returnedValue = (Resource<List<Restaurant>>) listResource.data;
                assertEquals(restaurants, returnedValue.data);
            }
        });
    }

    @Test
    public void observeRestaurants_whenError() {
        Flowable<List<Restaurant>> returnedData = Flowable.error(new Throwable());
        when(mainApi.getRestaurantByLatLng(any(Double.class), any(Double.class))).thenReturn(returnedData);

        viewModel.observeRestaurants().observeForever(listResource -> {
            if (listResource.status == Resource.Status.ERROR) {
                Resource<List<Restaurant>> returnedValue = (Resource<List<Restaurant>>) listResource.data;
                assertEquals("Something went wrong", returnedValue.message);
            }
        });
    }
}
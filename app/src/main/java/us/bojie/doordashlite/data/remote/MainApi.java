package us.bojie.doordashlite.data.remote;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;
import us.bojie.doordashlite.data.models.Restaurant;

public interface MainApi {

    @GET("/v2/restaurant")
    Flowable<List<Restaurant>> getRestaurantByLatLng
            (@Query("lat") String lat,
             @Query("lng") String lng,
             @Query("offset") int page,
             @Query("limit") int pageSize);
}

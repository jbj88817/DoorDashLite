package us.bojie.doordashlite.data.remote;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import us.bojie.doordashlite.data.models.AuthRequest;
import us.bojie.doordashlite.data.models.AuthResponse;
import us.bojie.doordashlite.data.models.Restaurant;

public interface MainApi {

    @GET("v2/restaurant")
    Flowable<List<Restaurant>> getRestaurantByLatLng
            (@Query("lat") double lat,
             @Query("lng") double lng);

    @POST("v2/auth/token/")
    Flowable<AuthResponse> getAuthToken(@Body AuthRequest request);
}

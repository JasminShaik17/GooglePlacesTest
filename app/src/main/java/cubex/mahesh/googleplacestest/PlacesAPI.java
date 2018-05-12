package cubex.mahesh.googleplacestest;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PlacesAPI {

    @GET("maps/api/place/nearbysearch/json?location=17.4377565,78.4490586&radius=500&key=AIzaSyACfO2BKu_4bpbm-7aDTnTpIMUky65-c1U")
  Call<Places> getPlaces(@Query("type") String type);
}

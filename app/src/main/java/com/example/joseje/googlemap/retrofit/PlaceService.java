package com.example.joseje.googlemap.retrofit;

import com.example.joseje.googlemap.Places;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by joseje on 10/22/16.
 */

public interface PlaceService {

    @GET("places")
    Call<Places> getPlaces();

}

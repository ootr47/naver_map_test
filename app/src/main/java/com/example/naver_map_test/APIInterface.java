package com.example.naver_map_test;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIInterface {

    @GET("/conv/conv_router")
    Call<DataModel_response> getData(@Query("latitude") double latitude, @Query("longitude") double longitude);



}

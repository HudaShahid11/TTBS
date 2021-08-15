package com.kewo.youthservices;

import java.util.List;

import retrofit.http.GET;
import retrofit2.Call;

public interface ServiceApi {
    @GET("/keys/category")
    Call<List<ServiceResponse>> getAllServices();
}

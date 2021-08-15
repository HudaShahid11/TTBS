package com.kewo.youthservices;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/**
 * Created by Belal on 11/5/2015.
 */
public interface signin_api {
    @FormUrlEncoded
    @POST("/keys/login")
    public void insertUser(
            @Field("email") String email,
            @Field("password") String password,
            Callback<Response> callback);
}

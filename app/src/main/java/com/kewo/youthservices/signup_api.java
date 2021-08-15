package com.kewo.youthservices;



import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;


public interface signup_api {
    @FormUrlEncoded
    @POST("/keys/signup")
    public void insertUser(

            @Field("username") String username,
            @Field("email") String email,
            @Field("password") String password,
            @Field("phone_number") String phone_number,
            Callback<Response> callback);

}

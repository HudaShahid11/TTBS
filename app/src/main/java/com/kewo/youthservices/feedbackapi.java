package com.kewo.youthservices;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

public interface feedbackapi {
    @FormUrlEncoded
    @POST("/keys/feedback")
    public void insertUser(
            @Field("user_id") int user_id,
            @Field("service_provider_id") String service_provider_id,
            @Field("rating") float rating,
            @Field("description") String description,
            Callback<Response> callback);
}

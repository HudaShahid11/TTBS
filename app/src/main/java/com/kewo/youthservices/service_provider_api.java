package com.kewo.youthservices;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

public interface service_provider_api {
    @FormUrlEncoded
    @POST("/keys/service_provider")
    public void insertUser(
            @Field("first_name") String first_name,
            @Field("last_name") String last_name,
            @Field("father_name") String father_name,
            @Field("email") String email,
            @Field("cnic") String cnic,
            @Field("address") String address,
            @Field("phone_number") String phone_number,
            @Field("whatsapp_number") String whatsapp_number,
            @Field("certified_by") String certified_by,
            @Field("category") String category,
            Callback<Response> callback);
}

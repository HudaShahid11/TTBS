package com.kewo.youthservices;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CourseService {
    @GET("keys/category")
    Call<List<CourseResponse>> getAllCourses();
}


package com.adacherSoft.unsplashy.network;

import com.adacherSoft.unsplashy.models.Unsplash;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by adacher on 10-07-17.
 */

public interface GetSplash {
    @GET("photos/random")
    Call<Unsplash[]> get(@Query("count") int count);

}

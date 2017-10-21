package com.adacherSoft.unsplashy.background;

import android.os.AsyncTask;
import android.util.Log;

import com.adacherSoft.unsplashy.models.Unsplash;
import com.adacherSoft.unsplashy.network.GetSplash;
import com.adacherSoft.unsplashy.network.UnsplashInterceptor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

/**
 * xc
 * Created by adacher on 10-07-17.
 */

public class GetDataSplash extends AsyncTask<Void, Void, List<Unsplash>> {

    private final GetSplash request = new UnsplashInterceptor().get();

    @Override
    protected List<Unsplash> doInBackground(Void... params) {

        Call<Unsplash[]> call = request.get(10);
        int code;
        try {
            Response<Unsplash[]> response = call.execute();
            code = response.code();
            if (200 == code && response.isSuccessful()) {
                Unsplash[] unsplashes = response.body();
                if (unsplashes != null && unsplashes.length > 0) {
                    List<Unsplash> unsplases = new ArrayList<>();
                    for (Unsplash servUnplash : unsplashes) {
                        unsplases.add(servUnplash);
                    }
                    return unsplases;
                }

            } else {
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }



}




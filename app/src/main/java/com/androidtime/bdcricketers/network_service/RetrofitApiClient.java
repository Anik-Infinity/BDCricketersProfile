package com.androidtime.bdcricketers.network_service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitApiClient {

    private static final String BASE_URL = "http://onlineappupdate.com/api/";
    private static RetrofitApiClient mInstance;
    private static Retrofit retrofit;

    private RetrofitApiClient() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized RetrofitApiClient getInstance() {
        if (mInstance == null) {
            mInstance = new RetrofitApiClient();
        }
        return mInstance;
    }

    public RetrofitInterface getApi() {
        return retrofit.create(RetrofitInterface.class);
    }
}

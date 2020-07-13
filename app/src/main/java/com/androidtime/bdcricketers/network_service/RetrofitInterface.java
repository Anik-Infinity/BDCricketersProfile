package com.androidtime.bdcricketers.network_service;

import com.androidtime.bdcricketers.model.bean.CricketerListServerResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {
    @GET("player/1/1")
    Call<CricketerListServerResponse> getCricketerList();
}

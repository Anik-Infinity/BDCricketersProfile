package com.androidtime.bdcricketers.model;

import com.androidtime.bdcricketers.model.bean.CricketerListServerResponse;
import com.androidtime.bdcricketers.Interface.CricketerListModel;
import com.androidtime.bdcricketers.network_service.ResponseCallback;
import com.androidtime.bdcricketers.network_service.RetrofitApiClient;
import com.androidtime.bdcricketers.network_service.RetrofitInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CricketerListModelImplementor implements CricketerListModel {

    private RetrofitInterface retrofitInterface;

    public CricketerListModelImplementor() {
        retrofitInterface = RetrofitApiClient.getInstance().getApi();
    }

    @Override
    public void getCricketerListFromServer(final ResponseCallback<CricketerListServerResponse> callback) {
        Call<CricketerListServerResponse> call = retrofitInterface.getCricketerList();
        call.enqueue(new Callback<CricketerListServerResponse>() {
            @Override
            public void onResponse(Call<CricketerListServerResponse> call, Response<CricketerListServerResponse> response) {
                callback.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<CricketerListServerResponse> call, Throwable t) {
                callback.onError(new Error("Something went wrong!"));
            }
        });
    }
}

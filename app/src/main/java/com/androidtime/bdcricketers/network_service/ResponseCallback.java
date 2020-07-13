package com.androidtime.bdcricketers.network_service;

public interface ResponseCallback<T> {

    void onSuccess(T data);

    void onError(Throwable th);

}

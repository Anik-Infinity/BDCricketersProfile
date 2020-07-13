package com.androidtime.bdcricketers.Interface;

import com.androidtime.bdcricketers.model.bean.CricketerListServerResponse;
import com.androidtime.bdcricketers.network_service.ResponseCallback;

public interface CricketerListModel {
    void getCricketerListFromServer(ResponseCallback<CricketerListServerResponse> callback);
}

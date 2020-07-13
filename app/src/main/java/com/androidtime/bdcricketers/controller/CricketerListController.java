package com.androidtime.bdcricketers.controller;

import com.androidtime.bdcricketers.model.bean.CricketerListServerResponse;
import com.androidtime.bdcricketers.Interface.CricketerListModel;
import com.androidtime.bdcricketers.Interface.CricketerListView;
import com.androidtime.bdcricketers.network_service.ResponseCallback;

public class CricketerListController {

    CricketerListView cricketerListView;
    CricketerListModel cricketerListModel;

    public CricketerListController(CricketerListView cricketerListView, CricketerListModel cricketerListMode) {
        this.cricketerListView = cricketerListView;
        this.cricketerListModel = cricketerListMode;
    }

    public void getCricketerList() {
        cricketerListView.startProgressLoader();
        cricketerListModel.getCricketerListFromServer(new ResponseCallback<CricketerListServerResponse>() {
            @Override
            public void onSuccess(CricketerListServerResponse data) {
                cricketerListView.showCricketerList(data);
                cricketerListView.stopProgressLoader();
            }

            @Override
            public void onError(Throwable th) {
                cricketerListView.showErrorMessage(th.getMessage());
            }
        });
    }
}

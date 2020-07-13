package com.androidtime.bdcricketers.Interface;

import com.androidtime.bdcricketers.model.bean.CricketerListServerResponse;

public interface CricketerListView extends MVCCommon, ProgressLoading {

    void showCricketerList(CricketerListServerResponse cricketerList);

    void showErrorMessage(String error);
}

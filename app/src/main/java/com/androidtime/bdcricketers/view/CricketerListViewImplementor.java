package com.androidtime.bdcricketers.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.androidtime.bdcricketers.R;
import com.androidtime.bdcricketers.controller.CricketerListController;
import com.androidtime.bdcricketers.model.CricketerListModelImplementor;
import com.androidtime.bdcricketers.model.bean.CricketerListServerResponse;
import com.androidtime.bdcricketers.Interface.CricketerListView;

public class CricketerListViewImplementor implements CricketerListView {

    private View mRootView;
    private Context context;
    private RecyclerView cricketerRecyclerView;
    private CricketerListController cricketerListController;

    public CricketerListViewImplementor(Context context, ViewGroup viewGroup) {
        mRootView = LayoutInflater.from(context).inflate(R.layout.activity_main, viewGroup);
        this.context = context;
        cricketerListController =
                new CricketerListController(CricketerListViewImplementor.this,
                        new CricketerListModelImplementor());
    }

    @Override
    public void showCricketerList(CricketerListServerResponse cricketerList) {
        CricketerListViewAdapter cricketerListViewAdapter =
                new CricketerListViewAdapter(context, cricketerList.getPlayers());
        cricketerRecyclerView.setHasFixedSize(true);
        cricketerRecyclerView.setLayoutManager(new GridLayoutManager(context, 2));
        cricketerRecyclerView.addItemDecoration(new SpacesItemDecoration(30));
        cricketerRecyclerView.setAdapter(cricketerListViewAdapter);
    }

    @Override
    public void showErrorMessage(String error) {
        Toast.makeText(context, error, Toast.LENGTH_LONG).show();
    }

    @Override
    public View getRootView() {
        return mRootView;
    }

    @Override
    public void initView() {
        cricketerRecyclerView = mRootView.findViewById(R.id.cricketer_recyclerview);
        cricketerListController.getCricketerList();
    }

    @Override
    public void startProgressLoader() {
        CustomProcessBar.showDialog(context);
    }

    @Override
    public void stopProgressLoader() {
        CustomProcessBar.disMissDialog();
    }
}

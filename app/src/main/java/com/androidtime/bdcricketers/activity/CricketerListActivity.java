package com.androidtime.bdcricketers.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.androidtime.bdcricketers.Interface.CricketerListView;
import com.androidtime.bdcricketers.view.CricketerListViewImplementor;

public class CricketerListActivity extends AppCompatActivity {

    CricketerListView cricketerListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cricketerListView = new CricketerListViewImplementor(this, null);
        setContentView(cricketerListView.getRootView());
    }

    @Override
    protected void onResume() {
        super.onResume();
        cricketerListView.initView();
    }
}

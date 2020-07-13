package com.androidtime.bdcricketers.view;

import android.app.Dialog;
import android.content.Context;

import com.androidtime.bdcricketers.R;

public class CustomProcessBar {

    private static Dialog dialog;

    public static void showDialog(Context context) {
        dialog = new Dialog(context);
        dialog.setContentView(R.layout.progressbar);
        dialog.show();
    }

    public static void disMissDialog() {
        dialog.dismiss();
    }
}

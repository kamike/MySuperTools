package com.wangtao.mysupertools.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.StringRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.wangtao.mysupertools.R;

public abstract class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        setupUiView();
        setupAllData();
    }


    public abstract void setupUiView();

    public abstract void setupAllData();

    public View setInflateView(int layoutId) {
        return LayoutInflater.from(this).inflate(layoutId, null);
    }

    public void doStartActivity(Class activity) {
        Intent intent = new Intent(this, activity);
        startActivity(intent);

    }

    public void doShowMesage(String msg, DialogInterface.OnClickListener listener) {
        if (isFinishing()) {
            return;
        }
        new AlertDialog.Builder(this).setTitle(null).setMessage(msg).setNegativeButton(R.string.comfirm, listener).show();
    }

    public void doShowMesage(@StringRes int msg, DialogInterface.OnClickListener listener) {
        if (isFinishing()) {
            return;
        }
        new AlertDialog.Builder(this).setTitle(null).setMessage(msg).setNegativeButton(R.string.comfirm, listener).show();
    }

    public void doShowToast(String msg) {

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    public void doShowToast(@StringRes final int msgRes) {
        Toast.makeText(this, msgRes, Toast.LENGTH_SHORT).show();
    }


}

package com.wangtao.mysupertools.ui;

import android.view.View;
import android.widget.GridView;

import com.wangtao.mysupertools.R;

public class MainActivity extends BaseActivity {

    private GridView gridView;

    @Override
    public void setupUiView() {
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.main_gridview);
    }

    @Override
    public void setupAllData() {

    }

    public void onclickMainMenu(View view) {
        doShowToast("1111");
    }
}

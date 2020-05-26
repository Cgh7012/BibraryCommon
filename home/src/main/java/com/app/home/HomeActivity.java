package com.app.home;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.app.common.Constance;

import androidx.appcompat.app.AppCompatActivity;


@Route(path = Constance.ACTIVITY_URL_HOME)
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
}

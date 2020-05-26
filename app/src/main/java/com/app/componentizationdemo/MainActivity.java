package com.app.componentizationdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.app.common.Constance;
import com.app.common.util.ToastUtils;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.home)
    TextView mHome;
    @BindView(R.id.project)
    TextView mProject;
    @BindView(R.id.mine)
    TextView mMine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.home, R.id.project, R.id.mine})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.home:
                ARouter.getInstance().build(Constance.ACTIVITY_URL_HOME).navigation();
                ToastUtils.show(this, "home");
                break;
            case R.id.project:
                ARouter.getInstance().build(Constance.ACTIVITY_URL_PROJECT).navigation();
                ToastUtils.show(this, "project");
                break;
            case R.id.mine:
                ARouter.getInstance().build(Constance.ACTIVITY_URL_USER).navigation();
                ToastUtils.show(this, "mine");
                break;
        }
    }
}

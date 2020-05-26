package com.app.user;

import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.app.common.Constance;
import com.app.common.util.ToastUtils;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

@Route(path = Constance.ACTIVITY_URL_USER)
public class UserActivity extends AppCompatActivity {

    @BindView(R2.id.tv_text)
    TextView mTvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        ButterKnife.bind(this);
    }

    @OnClick(R2.id.tv_text)
    public void onViewClicked() {
        ARouter.getInstance().build(Constance.ACTIVITY_URL_PROJECT).navigation();
        ToastUtils.show(this, "project");
    }
}

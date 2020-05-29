package com.app.library_common;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by Ian on 2020/5/26.
 */
public class BaseApplication extends Application {

    private boolean isDebugARouter = true;

    @Override
    public void onCreate() {
        super.onCreate();

        if (isDebugARouter) {
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        ARouter.getInstance().destroy();
    }
}

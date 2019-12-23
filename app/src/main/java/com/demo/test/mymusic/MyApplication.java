package com.demo.test.mymusic;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;


/**
 * @author Messi.Mo
 * @date 2019/12/23
 * description:
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.init(this);
    }
}

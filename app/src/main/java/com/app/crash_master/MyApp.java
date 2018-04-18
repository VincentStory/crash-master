package com.app.crash_master;

import android.app.Application;

/**
 * Created by czxyl171151 on 2018/4/18.
 */

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler.getInstance().init(this);
    }
}

package com.transsnet.postpaydemo;

import android.app.Application;
import android.content.Context;

import androidx.multidex.MultiDex;
import androidx.multidex.MultiDexApplication;

/**
 * Author:  zengfeng
 * Time  :  2020/12/28 17:48
 * Des   :
 */
public class App extends MultiDexApplication {
    public static App mApplication;

    public static void setmApplication(App mApplication) {
        App.mApplication = mApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        setmApplication(this);
    }

    public static Class getClasss() {
       return TestActivity.class;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}

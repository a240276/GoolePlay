package com.huasuan.gooleplay.base;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Process;

/**
 * Created by john on 2017/3/23.
 */

public class BaseApplication extends Application {

    private static Context mContext;
    private static int mMainThreadId;
    private static Handler mMainThreadHandler;

    public static Context getContext() {
        return mContext;
    }

    public static int getMainThreadId() {
        return mMainThreadId;
    }

    public static Handler getMainThreadHandler() {
        return mMainThreadHandler;
    }

    @Override
    public void onCreate() { //程序入口方法
        //1,上下文
        mContext = getApplicationContext();

        //2,主线程id
        mMainThreadId = Process.myTid();

        //3,主线程Handler
        mMainThreadHandler = new Handler();




        super.onCreate();
    }
}

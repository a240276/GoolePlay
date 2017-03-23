package com.huasuan.gooleplay.utils;

import android.content.Context;
import android.content.res.Resources;

import com.huasuan.gooleplay.base.BaseApplication;

/**
 * Created by john on 2017/3/23.
 */

public class UIUtils {

    /**
     * 得到上线文
     */
    public static Context getContext() {
        return BaseApplication.getContext();
    }

    /**
     * 得到Resources
     */
    public static Resources getResources() {

        return getContext().getResources();
    }

    /**
     * 得到String.xml中的字符
     */
    public static String getString(int resId) {
        return getResources().getString(resId);
    }

    /**
     * 得到String.xml中的字符数组
     */
    public static String[] getStringArr(int resId) {
        return getResources().getStringArray(resId);
    }

    /**
     * 得到COLOR.XML中的颜色值
     */
    public static int getColor(int resId) {
        return getResources().getColor(resId);
    }

    public static String getPackageName(){
        return getContext().getPackageName();
    }
}

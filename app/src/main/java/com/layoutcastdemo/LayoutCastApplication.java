package com.layoutcastdemo;

import android.app.Application;
import android.os.Debug;

import com.github.mmin18.layoutcast.LayoutCast;

/**
 * @author zijiao
 * @version 16/5/19
 * @Mark
 */
public class LayoutCastApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            LayoutCast.init(this);
        }
    }
}

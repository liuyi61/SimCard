package com.yiliu.simcard;

import android.app.Application;

public class SimCardApplication extends Application {

    private static SimCardApplication sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
    }

    public static SimCardApplication getInstance() {
        return sInstance;
    }
}

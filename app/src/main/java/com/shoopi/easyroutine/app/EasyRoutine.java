package com.shoopi.easyroutine.app;

import android.app.Application;

import androidx.appcompat.app.AppCompatDelegate;

public class EasyRoutine extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppCompatDelegate.setDefaultNightMode(new AppSharedPreferences(getApplicationContext()).getNightMode());
    }
}

package com.shoopi.easyroutine.app;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.appcompat.app.AppCompatDelegate;

import com.shoopi.easyroutine.AppConstants;

public class AppSharedPreferences {
    SharedPreferences mSharedPreferences;

    public AppSharedPreferences(Context context){
        mSharedPreferences = context.getSharedPreferences(AppConstants.SHAREDPREFERENCE, 0);
    }

    public int getNightMode() {
        return mSharedPreferences.getInt(AppConstants.NIGHT_MODE, AppCompatDelegate.getDefaultNightMode());
    }
}

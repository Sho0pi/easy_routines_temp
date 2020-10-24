package com.shoopi.easyroutine.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.miguelcatalan.materialsearchview.MaterialSearchView;
import com.shoopi.easyroutine.MainActivity;
import com.shoopi.easyroutine.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getWindow().setBackgroundDrawable(null);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Bundle bundle = ActivityOptions.makeCustomAnimation(SplashScreenActivity.this, 17432576, 17432577).toBundle();
                startActivity(new Intent(SplashScreenActivity.this, MainActivity.class), bundle);
                finish();
            }
        }, 500);


    }
}
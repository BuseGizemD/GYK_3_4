package com.example.gyk_3;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        };
        handler.postDelayed(runnable, 1500);

        /*new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainInt = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(mainInt);
                finish();
            }
        }, 1500);*/
    }
}

package com.cmple.swipe;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class splash extends AppCompatActivity{
    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.splash);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    //This method will be executed once the timer is over
                    // Start your app main activity
                    Intent i = new Intent(splash.this, MainScreen.class);
                    startActivity(i);
                    // close this activity
                    finish();
                }
            }, 1500);
        }

    }

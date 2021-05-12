package com.my.app.velney;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    ImageView applogo;

    @Override
    protected void OnCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //set timer for 1 second
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Change activity to another activity
                Intent gogetstarted = new Intent(SplashActivity,GetStartedActivity.class);
                startActivity(gogetstarted);
                finish();
            }
        }, 1000);// 1000 ms = 1 s
    }
}

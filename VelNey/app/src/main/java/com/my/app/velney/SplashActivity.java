package com.my.app.velney;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    ImageView applogo:
    @Override
    protected void OnCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    //Memberikan event ke button
        applogo.setOnClickListener(new.View.OnClickListener() {
        @Override
        public void onClikc(View v) {
            //,emiki halman lain
            Intent abc = new Intent(package context:SplashActivity.this, GetStartedActivity.class);
            startActivity(abc);
            finish();
            }
        });
    }
}

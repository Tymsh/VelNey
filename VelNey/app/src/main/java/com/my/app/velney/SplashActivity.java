package com.my.app.velney;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    ImageView applogo:
    @Override
    protected void OnCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //mendapati ID pada XML
        applogo = findViewById(R.id.applogo);

        //Memberikan event ke applogo
        applogo.setOnClickListener(new.View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //menuju halman lain
                Intent abc = new Intent(package context:SplashActivity.this, GetStartedActivity.class);
                startActivity(abc);
                finish();
            }
        });
    }
}

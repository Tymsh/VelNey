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

        //mendapati ID pada XML
        applogo = findViewById(R.id.applogo);

        //membuat timer untuk pindah activity secara otomatis
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() { //delay proses ini di jalankan
            @Override
            public void run() {
                //Melakukan sesuati setelah 2s
                //menuju halman lain
                Intent abc = new Intent(package context:SplashActivity.this, GetStartedActivity.class);
                startActivity(abc);
                finish();
            }
        }, 2000);

    }
}

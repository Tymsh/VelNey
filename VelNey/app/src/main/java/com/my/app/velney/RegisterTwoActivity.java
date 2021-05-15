package com.my.app.velney;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class RegisterTwoActivity extends AppCompatActivity {

    LinearLayout btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_two);

            btn_back = findViewById(R.id.btn_back);
            btn_back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent backtosignin = new Intent(RegisterOneActivity.this, SignInActivity.class);
                    startActivity(backtosignin);
                }
            });
    }
}

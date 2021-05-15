package com.my.app.velney;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class RegisterTwoActivity extends AppCompatActivity {

    Button btn_next;
    LinearLayout btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_two);

          btn_next = findViewById(R.id.btn_next);
          btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotosuccess = new Intent(RegisterTwoActivity.this, SuccessRegisterActivity.class);
                startActivity(gotosuccess);
            }
        });

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

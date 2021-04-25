package com.my.app.velney;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class GetStartedActivity extends AppCompatActivity {
    //variables : stirng, boolean, integer, dll
    String myEmail = "ymichelles22@gmail.com";
    Boolean condition = false;
    EditText emailAddress;
    Integer angka_1 = 50, angka_2 = 250, angka_3 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiry_get_started);

        emailAddress = findViewById(R.id.emailAddress);

        //operator aritmatik
        angka_3 = angka_1 + angka_2;
        if(angka_3 == 350) {
            //jawaban benar
            //Toast -> untuk alert / prompt
            Toast.makeText(getApplicationContext(), "Jawaban Benar", Toast.LENGTH_SHORT).show();
        }
        else {
            //jawaban salah
            //Toast -> untuk alert / prompt
            Toast.makeText(getApplicationContext(), "Salah Jumlah", Toast.LENGTH_SHORT).show();
        }

    }
}

package com.my.app.velney;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    ImageView tourist_1, tourist_2;
    TextView borobudur, monas, pagoda, pisa, sphinx, tori, ticket_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tourist_1= findViewById(R.id.tourist_1);
        tourist_2 = findViewById(R.id.tourist_2);
        borobudur = findViewById(R.id.borobudur);
        monas =  findViewById(R.id.monas);
        pagoda = findViewById(R.id.pagoda);
        pisa = findViewById(R.id.pisa);
        sphinx = findViewById(R.id.sphinx);
        tori = findViewById(R.id.tori);
        ticket_2 = findViewById(R.id.ticket_2);
    }



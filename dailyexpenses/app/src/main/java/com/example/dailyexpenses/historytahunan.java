package com.example.dailyexpenses;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class historytahunan extends AppCompatActivity {
    Toolbar backnavhisthn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historytahunan);

        backnavhisthn = findViewById(R.id.toolbar6);
        backnavhisthn.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(historytahunan.this, MainActivity.class);
                startActivity(a);
            }
        });
    }
}

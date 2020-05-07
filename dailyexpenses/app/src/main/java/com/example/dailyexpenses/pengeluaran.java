package com.example.dailyexpenses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pengeluaran extends AppCompatActivity {
    Button savedatapengeluaran;
    Toolbar backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengeluaran);

        savedatapengeluaran = (Button) findViewById(R.id.savepengeluaran4);
        savedatapengeluaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent( pengeluaran.this, historybulanan.class);
                startActivity(a);
            }
        });

        backbtn = findViewById(R.id.toolbar5);
        backbtn.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(pengeluaran.this, MainActivity.class);
                startActivity(a);
            }
        });
    }
}

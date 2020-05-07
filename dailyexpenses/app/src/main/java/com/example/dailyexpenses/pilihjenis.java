package com.example.dailyexpenses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pilihjenis extends AppCompatActivity {
    Button pemasukan;
    Button pengeluaran;
    Toolbar backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihjenis);

        pemasukan = (Button) findViewById(R.id.buttonpemasukan);
        pemasukan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(pilihjenis.this, pemasukan.class);
                startActivity(a);
            }
        });

        pengeluaran = (Button) findViewById(R.id.buttonpengeluaran);
        pengeluaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent (pilihjenis.this, pengeluaran.class);
                startActivity(b);
            }
        });

        backbtn = findViewById(R.id.toolbar);
        backbtn.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(pilihjenis.this, MainActivity.class);
                startActivity(a);
            }
        });
    }
}

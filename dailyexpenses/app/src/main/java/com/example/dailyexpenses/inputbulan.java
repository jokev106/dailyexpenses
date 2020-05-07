package com.example.dailyexpenses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class inputbulan extends AppCompatActivity {
    Button savenamabulan;
    Toolbar backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputbulan);

        savenamabulan = (Button) findViewById(R.id.saveinputbulan2);
        savenamabulan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent (inputbulan.this, pilihjenis.class);
                startActivity(a);
            }
        });

        backbtn = findViewById(R.id.toolbar2);
        backbtn.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent (inputbulan.this, MainActivity.class);
                startActivity(a);
            }
        });
    }
}

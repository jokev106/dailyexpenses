package com.example.dailyexpenses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     Button buttonnew;
     Button buttonopen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonnew = (Button) findViewById(R.id.newexpenses);
        buttonopen = (Button) findViewById(R.id.openexpenses);

       buttonnew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, inputbulan.class);
                startActivity(a);
            }
        });
        buttonopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(MainActivity.this, historytahunan.class);
                startActivity(b);
            }
        });
    }
}

package com.example.dailyexpenses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dailyexpanses.R;

public class MainActivity extends AppCompatActivity {
    private Button buttonnew;
    private Button buttonopen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonnew = (Button) findViewById(R.id.newexpenses);
        buttonopen = (Button) findViewById(R.id.openexpenses);
        buttonnew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newexpenses();
            }
        });
        buttonopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openexpenses();
            }
        });
    }
    public void newexpenses(){
        Intent intent = new Intent(this, inputbulan.class);
        startActivity(intent);
    }
    public void openexpenses (){
        Intent intent = new Intent(this, historytahun.class);
        startActivity(intent);
    }
}

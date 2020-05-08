package com.example.dailyexpenses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;

import com.example.dailyexpenses.model.array;
import com.google.android.material.textfield.TextInputLayout;

public class inputbulan extends AppCompatActivity implements TextWatcher{
    Button savenamabulan;
    Toolbar backbtn;
    TextInputLayout namaq;
    String nama;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputbulan);

        namaq = findViewById(R.id.inputnama2);
        namaq.getEditText().addTextChangedListener(this);


        savenamabulan = (Button) findViewById(R.id.saveinputbulan2);
        savenamabulan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                array.nama = nama;
                Intent a = new Intent( inputbulan.this, inputuang.class);
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

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        nama = namaq.getEditText().getText().toString().trim();
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}

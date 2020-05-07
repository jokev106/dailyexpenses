package com.example.dailyexpenses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;

import com.example.dailyexpenses.model.User;
import com.example.dailyexpenses.model.array;
import com.google.android.material.textfield.TextInputLayout;

public class pemasukan extends AppCompatActivity implements TextWatcher {
    Button savedatapemasukan;
    Toolbar backbtn;
    TextInputLayout uangq, tanggalq, catatanq;
    String uang, tanggal, catatan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemasukan);

        uangq = findViewById(R.id.inputpemasukan);
        tanggalq = findViewById(R.id.inputtanggalpemasukan);
        catatanq = findViewById(R.id.inputcatatanpemasukan);

        uangq.getEditText().addTextChangedListener(this);
        tanggalq.getEditText().addTextChangedListener(this);
        catatanq.getEditText().addTextChangedListener(this);

        savedatapemasukan = (Button) findViewById(R.id.savepemasukan);
        savedatapemasukan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User(uang, tanggal, catatan);
                Intent a = new Intent( pemasukan.this, historybulanan.class);
                array.data.add(new User(uang, tanggal, catatan));
                a.putExtra("dataUser", user);
                startActivity(a);
            }
        });

        backbtn = findViewById(R.id.toolbar3);
        backbtn.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(pemasukan.this, MainActivity.class);
                startActivity(a);
            }
        });
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        uang = uangq.getEditText().getText().toString().trim();
        tanggal = tanggalq.getEditText().getText().toString().trim();
        catatan = catatanq.getEditText().getText().toString().trim();

        if (!uang.isEmpty() && !tanggal.isEmpty() && !catatan.isEmpty()){
            savedatapemasukan.setEnabled(true);
        }else{
            savedatapemasukan.setEnabled(false);
        }
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}

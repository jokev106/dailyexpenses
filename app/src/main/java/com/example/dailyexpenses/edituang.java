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
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Iterator;


public class edituang extends AppCompatActivity implements TextWatcher {
    public static final String EXTRA_DUIT="extra";
    private User user;

    TextInputLayout uangb, tanggalb, catatanb;
    TextInputEditText uangc, tanggalc, catatanc;
    Button savedatapemasukan;
    String uang, tanggal, catatan, nama;
    Toolbar backbtn;
    String test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edituang);

        if (getIntent().getParcelableExtra(EXTRA_DUIT)!= null){
            user = getIntent().getParcelableExtra(EXTRA_DUIT);
        }

        uangb = findViewById(R.id.inputuang);
        tanggalb = findViewById(R.id.inputtanggal);
        catatanb = findViewById(R.id.inputcatatan);
        uangc = findViewById(R.id.uang);
        tanggalc = findViewById(R.id.tanggal);
        catatanc = findViewById(R.id.catatan);

        uangc.setText(user.getUang());
        tanggalc.setText(user.getTanggal());
        catatanc.setText(user.getCatatan());
        uang = user.getUang();
        tanggal = user.getTanggal();
        catatan = user.getCatatan();
        uangb.getEditText().addTextChangedListener(this);
        tanggalb.getEditText().addTextChangedListener(this);
        catatanb.getEditText().addTextChangedListener(this);
        test = user.getCatatan();
        nama = user.getNama();
        savedatapemasukan = (Button) findViewById(R.id.savebutton);
        savedatapemasukan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Iterator<User> iter = array.data.iterator();
                while (iter.hasNext()) {
                    User user = iter.next();
                    if (user.getCatatan().equals(test)) {
                        iter.remove();

                    }
                }
                User user = new User(uang, tanggal, catatan, nama);
                Intent a = new Intent( edituang.this, historybulanan.class);
                array.data.add(new User(uang, tanggal, catatan, nama));
                startActivity(a);
            }
        });

        backbtn = findViewById(R.id.toolbar3);
        backbtn.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(edituang.this, historybulanan.class);
                startActivity(a);
            }
        });
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        uang = uangb.getEditText().getText().toString().trim();
        tanggal = tanggalb.getEditText().getText().toString().trim();
        catatan = catatanb.getEditText().getText().toString().trim();

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


package com.example.dailyexpenses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dailyexpenses.adapter.Adapter;
import com.example.dailyexpenses.model.User;
import com.example.dailyexpenses.model.array;

import java.util.ArrayList;


public class historybulanan extends AppCompatActivity {
    Toolbar backnav;
    RecyclerView aRecyclerView;
    RecyclerView.LayoutManager aLayoutManager;
    RecyclerView.Adapter aAdapter;
    RecyclerView.Adapter namaAdapter;
    ArrayList<User> userArrayList;
    Button newexp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historybulanan);

        aRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        userArrayList = array.data;

        aRecyclerView.setHasFixedSize(true);
        aLayoutManager = new LinearLayoutManager(this);
        aAdapter = new Adapter(userArrayList);
        aRecyclerView.setLayoutManager(aLayoutManager);
        aRecyclerView.setAdapter(aAdapter);
        itemClickSupport.addTo(aRecyclerView).setOnItemClickListener(new itemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                Intent intent = new Intent(historybulanan.this, edituang.class);
                intent.putExtra(edituang.EXTRA_DUIT, userArrayList.get(position));
                startActivity(intent);
            }
        });

        newexp = findViewById(R.id.addnewexpenses);
        newexp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(historybulanan.this, inputbulan.class);
                startActivity(a);
            }
        });

        backnav = findViewById(R.id.toolbar4);
        backnav.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(historybulanan.this, MainActivity.class);
                startActivity(a);
            }
        });
    }
}

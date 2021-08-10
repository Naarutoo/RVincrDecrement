package com.example.rvincrdecrement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
Button mBtnIncr, mBtnDecr;
ArrayList<Model> names = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
        buildlist();
        setRecyclevew();

    }

    private void setRecyclevew() {
        Adapter adapter = new Adapter(names);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }

    private void buildlist() {
    mBtnIncr.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            names.add("saurabh sharma");


        }
    });

    mBtnDecr.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            names.remove(new Model("saurabh"));
        }
    });
    }

    private void initview() {
    recyclerView = findViewById(R.id.recycleview);
    mBtnIncr = findViewById(R.id.buttonincr);
    mBtnDecr = findViewById(R.id.buttondecr);
    }



}
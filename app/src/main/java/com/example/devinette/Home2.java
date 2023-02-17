package com.example.devinette;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Home2 extends AppCompatActivity {
    Button entrer;
    EditText nom;
    private ListView lvScore;
    private BD helper;

    private List<Gamer> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        nom = (EditText) findViewById(R.id.edit);
        entrer = findViewById(R.id.btnEntrer);
        lvScore = findViewById(R.id.lvMS);


        entrer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                helper = new BD(Home2.this);
                Intent i1 = getIntent();
                entrer.setClickable(false);
                String score = i1.getStringExtra("score");
                helper.addNewGamer(nom.getText().toString().trim(),score.trim());
                nom.setFocusable(false);
                viewAll();
            }});
        Adapter adapter = new Adapter(this, R.layout.gamer, list);
        lvScore.setAdapter(adapter);
    }
    private void viewAll() {
        list.clear();
        Cursor res = helper.getAllData();
        if (res.getCount() == 0) {
            Toast.makeText(this, "No records", Toast.LENGTH_SHORT).show();
        }
        while (res.moveToNext()) {
            list.add(new Gamer(
                    res.getString(0),
                    res.getString(1),
                    res.getString(2)));
        }
    }
    }

package com.example.devinette;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.PrecomputedTextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListActivity extends AppCompatActivity {
    RecyclerView liste;

    BD myDB;
    ArrayList<String> id, nom, score;
    CustomAdapter customAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        liste = findViewById(R.id.listN);

        myDB = new BD(ListActivity.this);
        id = new ArrayList<>();
        nom = new ArrayList<>();
        score = new ArrayList<>();
        displayData();

        customAdapter = new CustomAdapter(ListActivity.this, id, nom ,score);
        liste.setAdapter(customAdapter);
        liste.setLayoutManager(new LinearLayoutManager(ListActivity.this));


    }

    void displayData(){
        List<Gamer> gamers= myDB.getAllGamers();

        for (Gamer g: gamers) {

            id.add(g.getId());
            nom.add(g.getNomG());
            score.add(g.getScoreG());
        }
    }
}
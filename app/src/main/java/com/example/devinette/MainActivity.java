package com.example.devinette;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioG;
    RadioButton radiobnt1, radiobtn2;
    Button startG;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startG = findViewById(R.id.startGame);
        radioG = findViewById(R.id.radioG);
        radiobnt1 = findViewById(R.id.facile);
        radiobtn2 = findViewById(R.id.difficile);

        startG.setOnClickListener(new View.OnClickListener() {
            int checkedRadioId = radioG.getCheckedRadioButtonId();
            RadioButton checkedRadio = (RadioButton)findViewById(checkedRadioId);
            @Override
            public void onClick(View v) {

                if(checkedRadio.equals(radiobnt1)) {
                    Toast.makeText(getApplicationContext(),checkedRadio.getText().toString(),Toast.LENGTH_SHORT).show();
                    Intent i1 = new Intent(MainActivity.this, Deviner_nombre.class);
                    startActivity(i1);
                }  else if(checkedRadio.equals(radiobtn2) ){
                    Toast.makeText(getApplicationContext(),checkedRadio.getText().toString(),Toast.LENGTH_SHORT).show();
                   Intent i2 = new Intent(MainActivity.this, Home2.class);
                    startActivity(i2);
                }
            }
        });
    }
    }

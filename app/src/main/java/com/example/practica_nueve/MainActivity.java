package com.example.practica_nueve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initListeners();
    }

    private void initListeners() {

        ImageButton boton1= findViewById(R.id.imageButton1);
        ImageButton boton2= findViewById(R.id.imageButton2);
        ImageButton boton3= findViewById(R.id.imageButton3);
        ImageButton boton4= findViewById(R.id.imageButton4);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveSecondActivity();

            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveSecondActivity();

            }
        });
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveSecondActivity();

            }
        });
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveSecondActivity();

            }
        });

    }

    public void moveSecondActivity(){
        Intent intent= new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}
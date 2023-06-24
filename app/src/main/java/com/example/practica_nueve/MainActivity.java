package com.example.practica_nueve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    int imagen1= R.drawable.ic_launcher_foreground;
    int imagen2= R.drawable.baseline_cookie_24;
    int imagen3= R.drawable.baseline_cruelty_free_24;
    int imagen4= R.drawable.baseline_auto_graph_24;


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
                moveSecondActivity(imagen1);

            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveSecondActivity(imagen2);

            }
        });
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveSecondActivity(imagen3);

            }
        });
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveSecondActivity(imagen4);

            }
        });

    }

    public void moveSecondActivity(int imagen1){
        Intent intent= new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("clave", imagen1);
        startActivity(intent);
    }
}
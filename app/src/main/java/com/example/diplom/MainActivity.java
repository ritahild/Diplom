package com.example.diplom;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);


        setSupportActionBar(toolbar);



        getSupportActionBar().setDisplayShowHomeEnabled(true);

        getSupportActionBar().setDisplayUseLogoEnabled(true);

        Button infobutton = findViewById(R.id.info);


        infobutton.setOnClickListener(v -> {
            Intent MaIntent = new Intent(MainActivity.this, InfoActivity.class);
            startActivity(MaIntent);


        });


        Button backbutton = findViewById(R.id.back);


        backbutton.setOnClickListener(v -> {
            Intent MaIntent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(MaIntent);


        });




        Button dozabutton = findViewById(R.id.doza);


        dozabutton.setOnClickListener(v -> {
            Intent MaIntent = new Intent(MainActivity.this, DozaActivity.class);
            startActivity(MaIntent);


        });
        Button cniibutton = findViewById(R.id.cnii);


        cniibutton.setOnClickListener(v -> {
            Intent MaIntent = new Intent(MainActivity.this, ZniiActivity.class);
            startActivity(MaIntent);


        });
        Button plohadbutton = findViewById(R.id.plohad);


        plohadbutton.setOnClickListener(v -> {
            Intent MaIntent = new Intent(MainActivity.this, PlohadActivity.class);
            startActivity(MaIntent);


        });

//        Button flebbutton = findViewById(R.id.fleb);
//
//
//        flebbutton.setOnClickListener(v -> {
//            Intent MaIntent = new Intent(MainActivity.this, FlebActivity.class);
//            startActivity(MaIntent);
//
//
//        });Button combutton = findViewById(R.id.com);
//
//
//        combutton.setOnClickListener(v -> {
//            Intent MaIntent = new Intent(MainActivity.this, ComActivity.class);
//            startActivity(MaIntent);
//
//
//        });
//        Button kaliybutton = findViewById(R.id.kaliy);
//
//
//        kaliybutton.setOnClickListener(v -> {
//            Intent MaIntent = new Intent(MainActivity.this, KaliyActivity.class);
//            startActivity(MaIntent);
//
//
//        });
//        Button gasbutton = findViewById(R.id.gas);
//
//
//        gasbutton.setOnClickListener(v -> {
//            Intent MaIntent = new Intent(MainActivity.this, GasActivity.class);
//            startActivity(MaIntent);
//
//
//        });
//
//        Button basbutton = findViewById(R.id.bas);
//
//
//        basbutton.setOnClickListener(v -> {
//            Intent MaIntent = new Intent(MainActivity.this, BasActivity.class);
//            startActivity(MaIntent);
//
//
//        });








    }
}

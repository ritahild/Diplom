package com.example.diplom;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class InfoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);


        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayShowHomeEnabled(true);

        getSupportActionBar().setDisplayUseLogoEnabled(true);

        Button infobutton = findViewById(R.id.info);


        infobutton.setOnClickListener(v -> {
            Intent MaIntent = new Intent(InfoActivity.this, InfoActivity.class);
            startActivity(MaIntent);


        });


        Button backbutton = findViewById(R.id.back);


        backbutton.setOnClickListener(v -> {
            Intent MaIntent = new Intent(InfoActivity.this, MainActivity.class);
            startActivity(MaIntent);


        });


    }
}
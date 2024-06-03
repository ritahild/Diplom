package com.example.diplom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.ui.AppBarConfiguration;

public class PlohadActivity extends AppCompatActivity {


    private AppBarConfiguration appBarConfiguration;

    public EditText e1;
    TextView t1;
    Button resultTextView;
    int num1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plohad);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);


        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayShowHomeEnabled(true);

        getSupportActionBar().setDisplayUseLogoEnabled(true);

        Button infobutton = findViewById(R.id.info);


        infobutton.setOnClickListener(v -> {
            Intent MaIntent = new Intent(PlohadActivity.this, InfoActivity.class);
            startActivity(MaIntent);


        });

        Button backbutton = findViewById(R.id.back);


        backbutton.setOnClickListener(v -> {
            Intent MaIntent = new Intent(PlohadActivity.this, MainActivity.class);
            startActivity(MaIntent);


        });

        e1 = findViewById(R.id.num);

        t1 = findViewById(R.id.result);

        resultTextView = findViewById(R.id.sum);

        resultTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double var1 = Double.parseDouble(e1.getText().toString());


                double v2 = (4* var1)+7;
                double v3 = var1+90;


                double result = v2/v3;

                t1.setText("Result: " + result);
            }
        });


    }
    }
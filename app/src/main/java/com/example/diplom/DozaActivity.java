package com.example.diplom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class DozaActivity extends AppCompatActivity {


    public EditText e1, e2, e3;
     TextView t1;
     Button resultTextView;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doza);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);


        setSupportActionBar(toolbar);



        getSupportActionBar().setDisplayShowHomeEnabled(true);

        getSupportActionBar().setDisplayUseLogoEnabled(true);

        Button infobutton = findViewById(R.id.info);


        infobutton.setOnClickListener(v -> {
            Intent MaIntent = new Intent(DozaActivity.this, InfoActivity.class);
            startActivity(MaIntent);


        });

        Button backbutton = findViewById(R.id.back);


        backbutton.setOnClickListener(v -> {
            Intent MaIntent = new Intent(DozaActivity.this, MainActivity.class);
            startActivity(MaIntent);


        });

        e1 = findViewById(R.id.kg);
        e2 = findViewById(R.id.doz);
        e3 = findViewById(R.id.fo);
        t1 = findViewById(R.id.result);
        resultTextView = findViewById(R.id.res);

        resultTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double var1 = Double.parseDouble(e1.getText().toString());
                double var2 = Double.parseDouble(e2.getText().toString());
                double var3 = Double.parseDouble(e3.getText().toString());

                double result = (var1 * var2)/ var3;

                t1.setText("Result: " + result);
            }
        });




    }
    }
package com.example.diplom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class ZniiActivity extends AppCompatActivity {


    public EditText e1, e2, e3, e4, e5;
    TextView t1,t2,t3,t4,t5,t6;
    Button resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_znii);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);


        setSupportActionBar(toolbar);



        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);

        getSupportActionBar().setDisplayUseLogoEnabled(true);

        Button infobutton = findViewById(R.id.info);


        infobutton.setOnClickListener(v -> {
            Intent MaIntent = new Intent(ZniiActivity.this, InfoActivity.class);
            startActivity(MaIntent);


        });

        Button backbutton = findViewById(R.id.back);


        backbutton.setOnClickListener(v -> {
            Intent MaIntent = new Intent(ZniiActivity.this, MainActivity.class);
            startActivity(MaIntent);


        });


//


        e1 = findViewById(R.id.num1);
        e2 = findViewById(R.id.num2);
        e3 = findViewById(R.id.num3);
        e4 = findViewById(R.id.num4);
        e5 = findViewById(R.id.num5);
        t1 = findViewById(R.id.result);

//        t2 = findViewById(R.id.geg);
//        t3 = findViewById(R.id.gog);
//        t4 = findViewById(R.id.gig);
//        t5 = findViewById(R.id.gug);
//        t6 = findViewById(R.id.gag);

        resultTextView = findViewById(R.id.sum);

        resultTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double var1 = Double.parseDouble(e1.getText().toString());
                double var2 = Double.parseDouble(e2.getText().toString());
                double var3 = Double.parseDouble(e3.getText().toString());
                double var4 = Double.parseDouble(e4.getText().toString());
                double var5 = Double.parseDouble(e5.getText().toString());


                double v1 = (var1 * var2)* var3;
                double v2 = v1/ var4;





                double result = v2/ var5;



                t1.setText("Result: " + result);
            }
        });




    }




    }

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

        // assigning ID of the toolbar to a variable
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        // using toolbar as ActionBar
        setSupportActionBar(toolbar);


        // Display application icon in the toolbar
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        getSupportActionBar().setDisplayUseLogoEnabled(true);

        Button infobutton = findViewById(R.id.info);


        infobutton.setOnClickListener(v -> {
            Intent MaIntent = new Intent(MainActivity.this, InfoActivity.class);
            startActivity(MaIntent);


        });


        // assigning ID of textView2 to a variable
//        textView = (TextView) findViewById(R.id.textView2);
//
//
//        // "on click" operations to be performed
//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//
//            // incrementing the value of textView
//            public void onClick( View view ) {
//                count++;
//                textView.setText("" + count);
//            }
//        });

    }
}

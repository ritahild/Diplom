package com.example.diplom;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }
}

//public class MainActivity extends AppCompatActivity {
//
//    private EditText input1, input2, input3;
//    private TextView resultTextView;
//    private Button calculateButton;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        input1 = findViewById(R.id.input1);
//        input2 = findViewById(R.id.input2);
//        input3 = findViewById(R.id.input3);
//        resultTextView = findViewById(R.id.resultTextView);
//        calculateButton = findViewById(R.id.calculateButton);
//
//        calculateButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                double var1 = Double.parseDouble(input1.getText().toString());
//                double var2 = Double.parseDouble(input2.getText().toString());
//                double var3 = Double.parseDouble(input3.getText().toString());
//
//                double result = var1 * (var2 - var3);
//
//                resultTextView.setText("Result: " + result);
//            }
//        });
//    }
//}





//
//    public EditText e1, e2, e3;
//    TextView t1;
//    int num1, num2, num3;
//    public boolean getNumbers() {
//
//        //checkAndClear();
//        // defining the edit text 1 to e1
//        e1 = (EditText) findViewById(R.id.kg);
//
//        // defining the edit text 2 to e2
//        e2 = (EditText) findViewById(R.id.doz);
//
//        e3 = (EditText) findViewById(R.id.fo);
//
//        // defining the text view to t1
//        t1 = (TextView) findViewById(R.id.result);
//
//        // taking input from text box 1
//        String s1 = e1.getText().toString();
//
//        // taking input from text box 2
//        String s2 = e2.getText().toString();
//
//        String s3 = e3.getText().toString();
//
//
//        if(s1.equals("Please enter value 1") && s2.equals(null))
//        {
//            String result = "Please enter value 2";
//            e2.setText(result);
//            return false;
//        }
//        if(s1.equals(null) && s2.equals("Please enter value 2"))
//        {
//            String result = "Please enter value 1";
//            e1.setText(result);
//            return false;
//        }
//        if(s1.equals("Please enter value 1") || s2.equals("Please enter value 2"))
//        {
//            return false;
//        }
//
//        if((!s1.equals(null) && s2.equals(null))|| (!s1.equals("") && s2.equals("")) ){
//
//            String result = "Please enter value 2";
//
//            e2.setText(result);
//            return false;
//        }
//        if((s1.equals(null) && !s2.equals(null))|| (s1.equals("") && !s2.equals("")) ){
//            //checkAndClear();
//            String result = "Please enter value 1";
//            e1.setText(result);
//            return false;
//        }
//        if((s1.equals(null) && s2.equals(null))|| (s1.equals("") && s2.equals("")) ){
//            //checkAndClear();
//            String result1 = "Please enter value 1";
//            e1.setText(result1);
//            String result2 = "Please enter value 2";
//            e2.setText(result2);
//            return false;
//        }
//
//        else {
//            // converting string to int.
//            num1 = Integer.parseInt(s1);
//
//            // converting string to int.
//            num2 = Integer.parseInt(s2);
//
//
//        }
//
//        return true;
//    }
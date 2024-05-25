package com.example.diplom;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;

public class PlohadActivity extends AppCompatActivity {


    private AppBarConfiguration appBarConfiguration;

    public EditText e1;
    TextView t1;
    int num1;
    public boolean getNumbers() {

        //checkAndClear();
        // defining the edit text 1 to e1
        e1 = (EditText) findViewById(R.id.num);




        // defining the text view to t1
        t1 = (TextView) findViewById(R.id.result);

        // taking input from text box 1
        String s1 = e1.getText().toString();
        if(s1.equals(null))
        {
            String result = "Please enter value 2";
            e1.setText(result);
            return false;
        }
        else {
            // converting string to int.
            num1 = Integer.parseInt(s1);

            // converting string to int.



        }

        return true;
    }
    public void doSum(View v) {

        // get the input numbers
        if (getNumbers()) {
            int sum = num1 * 4 +7 ;
            int rs = num1 +90;
            int res = sum/rs;

            t1.setText(Integer.toString(res));
        }
        else
        {
            t1.setText("Error Please enter Required Values");
        }

    }
    public void clearTextNum1(View v) {

        // get the input numbers
        e1.getText().clear();
    }
}
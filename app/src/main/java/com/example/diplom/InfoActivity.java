package com.example.diplom;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class InfoActivity extends AppCompatActivity {
    ListView listView;

    // Define array adapter for ListView
    ArrayAdapter<String> adapter;

    ArrayList<String> mylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);


        listView = findViewById(R.id.listView);


        mylist = new ArrayList<>();
        mylist.add("a");
        mylist.add("b");
        mylist.add("c");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mylist);
        listView.setAdapter(adapter);
    }


}
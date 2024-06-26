package com.example.diplom;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class InfoActivity extends AppCompatActivity {

    ListView userList;
    TextView header;
    DatabaseHelper databaseHelper;
    SQLiteDatabase db;
    Cursor userCursor;
    SimpleCursorAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);



        header = findViewById(R.id.header);
        userList = findViewById(R.id.list);




        databaseHelper = new DatabaseHelper(getApplicationContext());
    }



    @Override
    public void onResume() {
        super.onResume();

        db = databaseHelper.getReadableDatabase();


        userCursor =  db.rawQuery("select * from "+ DatabaseHelper.TABLE, null);


        String[] headers = new String[] {DatabaseHelper.COLUMN_TITLE, DatabaseHelper.COLUMN_IFR};


        userAdapter = new SimpleCursorAdapter(this, android.R.layout.two_line_list_item,
                userCursor, headers, new int[]{android.R.id.text1, android.R.id.text2}, 0);
        header.setText("Найдено элементов: " +  userCursor.getCount());
        userList.setAdapter(userAdapter);
    }

    @Override
    public void onDestroy(){
        super.onDestroy();

        db.close();
        userCursor.close();
    }
}
package com.example.diplom;




import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "userstore.db";
    private static final int SCHEMA = 3;
    static final String TABLE = "users";

    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_IFR = "infrt";
    public static final String COLUMN_TITLE = "title";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, SCHEMA);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE users (" + COLUMN_ID
                + " INTEGER PRIMARY KEY AUTOINCREMENT," + COLUMN_IFR
                + " TEXT, " + COLUMN_TITLE + " TEXT);");

        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_IFR
                + ", " + COLUMN_TITLE  + ") VALUES ('Дозировка лекраст расчитывается по формуле вес животного" +
                " умноженного на дозировку лекарства и деленное на количество вещества', 'дорировка лекарств');");

        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_IFR
                + ", " + COLUMN_TITLE  + ") VALUES ('Инфузия постоянной скорости расчитывается по формуле вес животного"  +
                " умноженного на дозировку лекарства и их произведение умноженное на обьем шприца после чего это произведение делится на концентрацию вещества после чего полученное число делится на скорость введения препарата', 'инфузия постоянной скорости');");

        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_IFR
                + ", " + COLUMN_TITLE  + ") VALUES ('Площадь поверхности тела считается по формуле вес животного умножается на четыре " +
                "и к произведению прибавляется семь после чего сумма делится на вес животного прибавленное к девяноста', 'площадь поверхности тела');");

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,  int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE);
        onCreate(db);
    }
}


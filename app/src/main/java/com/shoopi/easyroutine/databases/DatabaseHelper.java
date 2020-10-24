package com.shoopi.easyroutine.databases;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper {

    private SQLiteDatabase mDatabase;

    public DatabaseHelper(SQLiteDatabase database){
        mDatabase = database;
    }
}

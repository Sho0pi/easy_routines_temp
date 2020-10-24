package com.shoopi.easyroutine.databases;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.shoopi.easyroutine.AppConstants;

public class RoutineDatabase extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "routines.db";
    private static final int CURRENT_VERSION = DatabaseVersion.VERSION_1.getValue();
    private final Context mContext;

    public RoutineDatabase(Context context) {
        super(context, DATABASE_NAME, null, CURRENT_VERSION);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(String.format("create table %s (id text, collection text, %s BLOB)", AppConstants.Database.COLLECTION_TABLE_NAME, AppConstants.Database.Headers.ICON));
    }
}

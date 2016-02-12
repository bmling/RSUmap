package com.example.rsu.myproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Ling on 11/2/2559.
 */
public class MyManage {


    // Explicit
    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;


    public MyManage(Context context) {

        //Create Database
        objMyOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = objMyOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMyOpenHelper.getReadableDatabase();


    } //Constuctor

} // Main Class

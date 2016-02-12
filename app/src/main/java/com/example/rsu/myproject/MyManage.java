package com.example.rsu.myproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Ling on 11/2/2559.
 */
public class MyManage {


    // Explicit
    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public static final String table_user = "userTABLE";
    public static final String table_major = "majorTABLE";
    public static final String column_id = "_id";
    public static final String column_User = "User";
    public static final String column_Password = "Password";
    public static final String column_Name = "Name";
    public static final String column_Category = "Category";
    public static final String column_NameMajor = "NameMajor";
    public static final String column_Web = "Web";
    public static final String column_Image = "Image";
    public static final String column_Detail = "Detail";
    public static final String column_Lat = "Lat";
    public static final String column_Lng = "Lng";


    public MyManage(Context context) {

        //Create Database
        objMyOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = objMyOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMyOpenHelper.getReadableDatabase();


    } //Constuctor

    public long addUser(String strUser,
                        String strPassword,
                        String strName) {
        ContentValues objContentValues = new ContentValues();
        objContentValues.put(column_User, strUser);
        objContentValues.put(column_Password, strPassword);
        objContentValues.put(column_Name, strName);

        return writeSqLiteDatabase.insert(table_user,null,objContentValues);
    }


} // Main Class

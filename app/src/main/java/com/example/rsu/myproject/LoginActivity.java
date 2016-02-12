package com.example.rsu.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    //explicit
    private MyManage objMyManage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //connected Database
        objMyManage = new MyManage(this);

        //Test Add Value
        //testAddValue();

    } //Main Method

    private void testAddValue() {
        objMyManage.addUser("user", "pass", "name");
        objMyManage.addMajor("Cat", "Name", "Web", "Image", "Detail", "Lat", "Lng");
    }
} // Main class

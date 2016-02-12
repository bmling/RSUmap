package com.example.rsu.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private MyManage objMyManage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imvmap = (ImageView) findViewById(R.id.imvmap);
        ImageView imvdata = (ImageView) findViewById(R.id.imvdata);

        TextView txtmap = (TextView) findViewById(R.id.txtmap);
        TextView txtdata = (TextView) findViewById(R.id.txtdata);


        //Request Database
        objMyManage = new MyManage(this);

        imvmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentmap = new Intent(MainActivity.this, IntoMap.class);
                startActivity(intentmap);


            }
        });

        txtmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMap = new Intent(MainActivity.this, IntoMap.class);
                startActivity(intentMap);
            }
        });

        imvdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentData = new Intent(MainActivity.this, Data.class);
                startActivity(intentData);
            }
        });

        txtdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentData = new Intent(MainActivity.this, Data.class);
                startActivity(intentData);
            }
        });


    }//Enn of onCreate


}// End of Main

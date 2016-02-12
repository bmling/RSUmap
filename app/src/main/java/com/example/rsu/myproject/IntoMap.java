package com.example.rsu.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.model.LatLng;

public class IntoMap extends AppCompatActivity {

    ImageView imvbuild,imvpark,imvfood,imvcafe,imvcopy, imvetc;
    TextView txtbuild,txtpark,txtfood,txtcafe,txtcopy, txtetc;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_into_map);

        imvbuild = (ImageView) findViewById(R.id.imvbuild);

        txtbuild = (TextView) findViewById(R.id.txtbuild);
        txtbuild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentListView = new Intent(IntoMap.this, ShowListView.class);
                startActivity(intentListView);
            }
        });


        imvbuild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intentListView = new Intent(IntoMap.this, ShowListView.class);
                startActivity(intentListView);


            }
        });

        imvpark = (ImageView) findViewById(R.id.imvpark);
        imvpark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLivePark = new Intent(IntoMap.this, ListViewPark.class);
                startActivity(intentLivePark);
            }
        });

        txtpark = (TextView) findViewById(R.id.txtpark);
        txtpark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLivePark = new Intent(IntoMap.this, ListViewPark.class);
                startActivity(intentLivePark);
            }
        });

        imvfood = (ImageView) findViewById(R.id.imvfood);
        imvfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentListFood = new Intent(IntoMap.this, ListViewFood.class);
                startActivity(intentListFood);
            }
        });

        txtfood = (TextView) findViewById(R.id.txtfood);
        txtfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentListFood = new Intent(IntoMap.this, ListViewFood.class);
                startActivity(intentListFood);
            }
        });

        imvcafe = (ImageView) findViewById(R.id.imvcafe);
        imvcafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentListCafe = new Intent(IntoMap.this, ListViewCafe.class);
                startActivity(intentListCafe);
            }
        });

        txtcafe = (TextView) findViewById(R.id.txtcafe);
        txtcafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentListCafe = new Intent(IntoMap.this, ListViewCafe.class);
                startActivity(intentListCafe);
            }
        });

        imvcopy = (ImageView) findViewById(R.id.imvcopy);
        imvcopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentListCopy = new Intent(IntoMap.this, ListViewCopy.class);
                startActivity(intentListCopy);
            }
        });

        txtcopy = (TextView) findViewById(R.id.txtcopy);
        txtcopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentListCopy = new Intent(IntoMap.this, ListViewCopy.class);
                startActivity(intentListCopy);
            }
        });


    }//Enn of onCreate

}// End of Main

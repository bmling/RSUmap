package com.example.rsu.myproject;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

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

        //Delete All SQLite
        deleteAllSQLite();

        //Synchronize JSON to SQLite
        synJSON();

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

    private void synJSON() {

        //Change Policy
        StrictMode.ThreadPolicy myPolicy = new StrictMode.ThreadPolicy
                .Builder().permitAll().build();
        StrictMode.setThreadPolicy(myPolicy);

        int intTABLE = 0;
        while (intTABLE <= 1) {

            //1.InputStream
            InputStream objInputStream = null;
            String[] urlStrings = new String[2];
            urlStrings[0] = "http://swiftcodingthai.com/tan/tom_get_user_ling.php";
            urlStrings[1] = "http://swiftcodingthai.com/tan/tom_get_major_ling.php";

            try {

                HttpClient objHttpClient = new DefaultHttpClient();
                HttpPost objHttpPost = new HttpPost(urlStrings[intTABLE]);
                HttpResponse objHttpResponse = objHttpClient.execute(objHttpPost);
                HttpEntity objHttpEntity = objHttpResponse.getEntity();
                objInputStream = objHttpEntity.getContent();

            } catch (Exception e) {
                Log.d("map1", "InputStream ==> " + e.toString());
            }



            //2.Create String

            String strJSON = null;
            try {

                BufferedReader objBufferedReader = new BufferedReader(new InputStreamReader(objInputStream,"UTF-8"));
                StringBuilder objStringBuilder = new StringBuilder();
                String strLine = null;
                while ((strLine = objBufferedReader.readLine()) != null) {
                    objStringBuilder.append(strLine);
                }

                objInputStream.close();
                strJSON = objStringBuilder.toString();

            } catch (Exception e) {
                Log.d("map1", "strJSON ==>" + e.toString());
            }

            //3.Update to SQLite
            try {
                JSONArray objJsonArray = new JSONArray(strJSON);
                for (int i = 0; i < objJsonArray.length(); i++) {

                    JSONObject jsonObject = objJsonArray.getJSONObject(i);
                    switch (intTABLE) {
                        case 0:

                            String strUser = jsonObject.getString(MyManage.column_User);
                            String strPassword = jsonObject.getString(MyManage.column_Password);
                            String strName = jsonObject.getString(MyManage.column_Name);

                            objMyManage.addUser(strUser, strPassword, strName);

                            break;
                        case 1:

                            String strCategory = jsonObject.getString(MyManage.column_Category);
                            String strNameMajor = jsonObject.getString(MyManage.column_NameMajor);
                            String strWeb = jsonObject.getString(MyManage.column_Web);
                            String strImage = jsonObject.getString(MyManage.column_Image);
                            String strDetail = jsonObject.getString(MyManage.column_Detail);
                            String strLat = jsonObject.getString(MyManage.column_Lat);
                            String strLng = jsonObject.getString(MyManage.column_Lng);

                            objMyManage.addMajor(strCategory, strNameMajor, strWeb, strImage, strDetail, strLat, strLng);

                            break;
                    }

                }   //for

            } catch (Exception e) {
                Log.d("map1", "Update ==>" + e.toString());
            }

            intTABLE += 1;
        }   //while

    }   //SynJSON

    private void deleteAllSQLite() {
        SQLiteDatabase objSqLiteDatabase = openOrCreateDatabase(MyOpenHelper.database_name,
                MODE_PRIVATE, null);
        objSqLiteDatabase.delete(MyManage.table_major, null, null);
        objSqLiteDatabase.delete(MyManage.table_user, null, null);
    }

    public void clickLoginMain(View view) {
        startActivity(new Intent(MainActivity.this,LoginActivity.class));
    }


}// End of Main

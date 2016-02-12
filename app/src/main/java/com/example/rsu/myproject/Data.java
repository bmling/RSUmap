package com.example.rsu.myproject;

import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.telecom.Call;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import static android.telecom.Call.*;
import static com.example.rsu.myproject.R.id.nav_science;
import static com.example.rsu.myproject.R.id.showTitle;
import static com.example.rsu.myproject.R.id.start;
import static com.example.rsu.myproject.R.id.title;
import static com.example.rsu.myproject.R.id.title_bar;
import static com.example.rsu.myproject.R.id.txtData;

public class Data extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Adapter_Data adapterdata;

    private Spinner spinner;
    private String[] array_string;
    private String[] array_website;

    private ImageView imbWeb, imbMap;
    private TextView textData;
    private ImageView imv;

    private String selected = null,latitude,longitude;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //
        spinner = (Spinner) findViewById(R.id.spinner);
        imbWeb = (ImageView) findViewById(R.id.imbWeb);
        imbMap = (ImageView) findViewById(R.id.imbMap);
        textData = (TextView) findViewById(R.id.txtData);
        imv = (ImageView) findViewById(R.id.imageView2);



        String[] Title = getResources().getStringArray(R.array.array_science_title);

        //Set Spinner
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this,
                R.layout.support_simple_spinner_dropdown_item, Title);
        myAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(myAdapter);

        final String[] details_science = getResources().getStringArray(R.array.array_science_details);
        final String[] details_engineering = getResources().getStringArray(R.array.array_engineer_details);
        final String[] details_humanities = getResources().getStringArray(R.array.array_humanities_details);
        final String[] details_business = getResources().getStringArray(R.array.array_business_details);
        final String[] details_art = getResources().getStringArray(R.array.array_art_details);
        final String[] details_etc = getResources().getStringArray(R.array.array_etc_details);

        final String[] web_science = getResources().getStringArray(R.array.array_science_website);
        final String[] web_engineering = getResources().getStringArray(R.array.array_engineer_website);
        final String[] web_humanities = getResources().getStringArray(R.array.array_humanities_website);
        final String[] web_business = getResources().getStringArray(R.array.array_business_website);
        final String[] web_art = getResources().getStringArray(R.array.array_art_website);
        final String[] web_etc = getResources().getStringArray(R.array.array_etc_website);

        textData = (TextView) findViewById(R.id.txtData);




       spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, final int position, long id) {

               // On selecting a spinner item
               String item = parent.getItemAtPosition(position).toString();

               // Showing selected spinner item
               Toast.makeText(parent.getContext(), item, Toast.LENGTH_SHORT).show();

               selected = item;


               if (selected.equals("วิทยาลัยแพทยศาสตร์")) {
                   textData.setText(details_science[position]);
                   imv.setImageResource(R.drawable.major1);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_science[0]));
                            startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.963219);
                   longitude = String.valueOf(100.585534);

                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });

               }else if (selected.equals("วิทยาลัยการแพทย์แผนตะวันออก")) {
                   textData.setText(details_science[1]);
                   imv.setImageResource(R.drawable.major2);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_science[1]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.963456);
                   longitude = String.valueOf(100.586095);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });

               }else if (selected.equals("ทันตแพทยศาสตร์")) {
                   textData.setText(details_science[2]);
                   imv.setImageResource(R.drawable.major3);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_science[2]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.967308);
                   longitude = String.valueOf(100.585849);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               }else if (selected.equals("เภสัชศาสตร์")) {
                   textData.setText(details_science[3]);
                   imv.setImageResource(R.drawable.major4);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_science[3]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.963456);
                   longitude = String.valueOf(100.586095);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               }else if (selected.equals("พยาบาลศาสตร์")) {
                   textData.setText(details_science[4]);
                   imv.setImageResource(R.drawable.major5);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_science[4]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.963219);
                   longitude = String.valueOf(100.585534);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               }else if (selected.equals("เทคนิคการแพทย์")) {
                   textData.setText(details_science[5]);
                   imv.setImageResource(R.drawable.major6);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_science[5]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.963024);
                   longitude = String.valueOf(100.585209);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               }else if (selected.equals("กายภาพบำบัด")) {
                   textData.setText(details_science[6]);
                   imv.setImageResource(R.drawable.major7);
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_science[6]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.963456);
                   longitude = String.valueOf(100.586095);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               }else if (selected.equals("ทัศนมาตรศาสตร์")) {
                   textData.setText(details_science[7]);
                   imv.setImageResource(R.drawable.major8);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_science[7]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.967308);
                   longitude = String.valueOf(100.585849);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               }else if (selected.equals("รังสีเทคนิค")) {
                   textData.setText(details_science[8]);
                   imv.setImageResource(R.drawable.major9);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_science[8]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                  imbMap.setVisibility(View.VISIBLE);

               }else if (selected.equals("วิทยาศาสตร์")) {
                   textData.setText(details_science[9]);
                   imv.setImageResource(R.drawable.major10);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_science[9]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.963219);
                   longitude = String.valueOf(100.585534);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               }else if (selected.equals("วิทยาลัยวิศวกรรมศาสตร์")) {
                   textData.setText(details_engineering[position]);
                   imv.setImageResource(R.drawable.major11);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_engineering[0]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.964504);
                   longitude = String.valueOf(100.585575);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               }else if (selected.equals("วิทยาลัยเทคโนโลยีสารสนเทศและการสื่อสาร")) {
                   textData.setText(details_engineering[1]);
                   imv.setImageResource(R.drawable.major12);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_engineering[1]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.966493);
                   longitude = String.valueOf(100.586494);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               }else if (selected.equals("คณะนวัตกรรมเกษตร")) {
                   textData.setText(details_engineering[2]);
                   imv.setImageResource(R.drawable.major13);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_engineering[2]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.964504);
                   longitude = String.valueOf(100.585575);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               }else if (selected.equals("คณะเทคโนโลยีชีวภาพ")) {
                   textData.setText(details_engineering[3]);
                   imv.setImageResource(R.drawable.major14);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_engineering[3]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.964504);
                   longitude = String.valueOf(100.585575);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               }else if (selected.equals("คณะเทคโนโลยีอาหาร")) {
                   textData.setText(details_engineering[4]);
                   imv.setImageResource(R.drawable.major15);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_engineering[4]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.964504);
                   longitude = String.valueOf(100.585575);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               }else if (selected.equals("สถาบันการบิน")) {
                   textData.setText(details_engineering[5]);
                   imv.setImageResource(R.drawable.major16);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_engineering[5]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.966493);
                   longitude = String.valueOf(100.586494);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               }else if (selected.equals("วิทยาลัยนิเทศศาสตร์")) {
                   textData.setText(details_humanities[position]);
                   imv.setImageResource(R.drawable.major17);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_humanities[0]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.968318);
                   longitude = String.valueOf(100.585156);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               } else if (selected.equals("ศิลปศาสตร์")) {
                   textData.setText(details_humanities[1]);
                   imv.setImageResource(R.drawable.major18);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_humanities[1]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.963350);
                   longitude = String.valueOf(100.586822);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               } else if (selected.equals("นิติศาสตร์")) {
                   textData.setText(details_humanities[2]);
                   imv.setImageResource(R.drawable.major19);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_humanities[2]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.963350);
                   longitude = String.valueOf(100.586822);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               } else if (selected.equals("วิทยาลัยนวัตกรรมสังคม")) {
                   textData.setText(details_humanities[3]);
                   imv.setImageResource(R.drawable.major20);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_humanities[3]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.963350);
                   longitude = String.valueOf(100.586822);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               }else if (selected.equals("รัฐประศาสนศาสตร์")) {
                   textData.setText(details_humanities[4]);
                   imv.setImageResource(R.drawable.major21);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_humanities[4]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.963684);
                   longitude = String.valueOf(100.587991);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               }else if (selected.equals("สถาบันการทูตและการต่างประเทศ")) {
                   textData.setText(details_humanities[5]);
                   imv.setImageResource(R.drawable.major22);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_humanities[5]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.966493);
                   longitude = String.valueOf(100.586494);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               }else if (selected.equals("คณะศึกษาศาสตร์")) {
                   textData.setText(details_humanities[6]);
                   imv.setImageResource(R.drawable.major23);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_humanities[6]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.963350);
                   longitude = String.valueOf(100.586822);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               }else if (selected.equals("สถาบันภาษาอังกฤษ")) {
                   textData.setText(details_humanities[7]);
                   imv.setImageResource(R.drawable.major24);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_humanities[7]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.966493);
                   longitude = String.valueOf(100.586494);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               }else if (selected.equals("สถาบันอาชญาวิทยาและการบริหารงานยุติธรรม")) {
                   textData.setText(details_humanities[8]);
                   imv.setImageResource(R.drawable.major25);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_humanities[8]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.965273);
                   longitude = String.valueOf(100.586958);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               }else if (selected.equals("วิทยาลัยการท่องเที่ยวและการบริการ")) {
                   textData.setText(details_business[position]);
                   imv.setImageResource(R.drawable.major26);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_business[0]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.966493);
                   longitude = String.valueOf(100.586494);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               }else if (selected.equals("คณะบริหารธุรกิจ")) {
                   textData.setText(details_business[1]);
                   imv.setImageResource(R.drawable.major27);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_business[2]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.963684);
                   longitude = String.valueOf(100.587991);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               }else if (selected.equals("คณะบัญชี")) {
                   textData.setText(details_business[2]);
                   imv.setImageResource(R.drawable.major28);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_business[3]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.963684);
                   longitude = String.valueOf(100.587991);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               }else if (selected.equals("คณะเศรษฐศาสตร์")) {
                   textData.setText(details_business[3]);
                   imv.setImageResource(R.drawable.major29);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_business[4]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.963684);
                   longitude = String.valueOf(100.587991);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               }else if (selected.equals("วิทยาลัยดนตรี")) {
                   textData.setText(details_art[position]);
                   imv.setImageResource(R.drawable.major30);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_art[0]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.966433);
                   longitude = String.valueOf(100.585949);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               }else if (selected.equals("สถาปัตยกรรมศาสตร์")) {
                   textData.setText(details_art[1]);
                   imv.setImageResource(R.drawable.major31);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_art[1]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.965000);
                   longitude = String.valueOf(100.584734);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               }else if (selected.equals("ศิลปะและการออกแบบ")) {
                   textData.setText(details_art[2]);
                   imv.setImageResource(R.drawable.major32);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_art[2]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.965000);
                   longitude = String.valueOf(100.584734);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               }else if (selected.equals("ดิจิทัลอาร์ต")) {
                   textData.setText(details_art[3]);
                   imv.setImageResource(R.drawable.major33);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_art[3]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.965170);
                   longitude = String.valueOf(100.585344);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               }else if (selected.equals("บัณฑิตวิทยาลัย")) {
                   textData.setText(details_etc[position]);
                   imv.setImageResource(R.drawable.major34);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_etc[0]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.966493);
                   longitude = String.valueOf(100.586494);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               }else if (selected.equals("วิทยาลัยนานาชาติ")) {
                   textData.setText(details_etc[1]);
                   imv.setImageResource(R.drawable.major35);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_etc[1]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.966493);
                   longitude = String.valueOf(100.586494);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               }else if (selected.equals("วิทยาลัยนานาชาติจีน")) {
                   textData.setText(details_etc[2]);
                   imv.setImageResource(R.drawable.major36);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_etc[2]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.966493);
                   longitude = String.valueOf(100.586494);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               }else if (selected.equals("RSU CYBER UNIVERSITY")) {
                   textData.setText(details_etc[3]);
                   imv.setImageResource(R.drawable.major37);
                   //web
                   imbWeb.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(web_etc[3]));
                           startActivity(intentWeb);
                       }
                   });
                   //map
                   latitude = String.valueOf(13.964504);
                   longitude = String.valueOf(100.585575);
                   imbMap.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
                           startActivity(intentMap);
                       }
                   });
               }


           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {
               textData.setText(details_science[0]);
               imv.setImageResource(R.drawable.musichall_long);
           }
       });


        //Get Name ActionBar
        /*final String Title = getIntent().getStringExtra("intentTitle");
        android.app.ActionBar ab = getActionBar();
        ab.setTitle(Title);
*/

    }//End of onCreate



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.data, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


         if (id == nav_science) {
            // Handle the science action



            String[] Title = getResources().getStringArray(R.array.array_science_title);

            //Set Spinner
            ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this,
                    R.layout.support_simple_spinner_dropdown_item, Title);
             myAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
            spinner.setAdapter(myAdapter);


            //Set ImageView
            imv.setImageResource(R.drawable.major1);

            //Set Name ActionBar
             //String title = getString(R.string.science);
             //android.app.ActionBar ab = getActionBar();
             //ab.setTitle(title);

        } else if (id == R.id.nav_engineering) {



            String[] title = getResources().getStringArray(R.array.array_engineer_title);

            ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this,
                    R.layout.support_simple_spinner_dropdown_item, title);
            myAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
            spinner.setAdapter(myAdapter);

            imv.setImageResource(R.drawable.major11);

        } else if (id == R.id.nav_humanities) {

            String[] title_Art = getResources().getStringArray(R.array.array_humanities_title);

            ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this,
                    R.layout.support_simple_spinner_dropdown_item, title_Art);
            myAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
            spinner.setAdapter(myAdapter);

            imv.setImageResource(R.drawable.major17);


        } else if (id == R.id.nav_business) {

             String[] title_engineering = getResources().getStringArray(R.array.array_business_title);

             ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this,
                     R.layout.support_simple_spinner_dropdown_item, title_engineering);
             myAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
             spinner.setAdapter(myAdapter);


             imv.setImageResource(R.drawable.major26);

        } else if (id == R.id.nav_art) {

             String[] title_economy = getResources().getStringArray(R.array.array_art_title);

             ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this,
                     R.layout.support_simple_spinner_dropdown_item, title_economy);
             myAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
             spinner.setAdapter(myAdapter);


             imv.setImageResource(R.drawable.major30);

        } else if (id == R.id.nav_international) {

             String[] title_etc = getResources().getStringArray(R.array.array_etc_title);

             ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this,
                     R.layout.support_simple_spinner_dropdown_item, title_etc);
             myAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
             spinner.setAdapter(myAdapter);

             imv.setImageResource(R.drawable.major34);

         }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }




}

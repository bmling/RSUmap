package com.example.rsu.myproject;

import android.content.Intent;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ShowListView extends AppCompatActivity {

    private CustomAdapter adapterListViewData;
    private ArrayList<ListView_DataShow> listData = new ArrayList<ListView_DataShow>();
    private ListView listViewData;
    Intent intentToMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_list_view);



        final int[] array_res = getImageArray(R.array.my_image_array, R.drawable.logorsu);
        final String[] array_string = getStringArray(R.array.my_string_array);
        String[] array_title = getStringArray(R.array.my_title_array);

        /*ListView listView = (ListView) findViewById(R.id.listView2);
        listView.setAdapter(new CustomAdapter(getApplicationContext()
                , android.R.id.text1, array_string, array_res));*/

        listViewData = (ListView) findViewById(R.id.listViewData);

        //listData = new ArrayList<ListView_DataShow>();
        adapterListViewData = new CustomAdapter(getApplicationContext(),array_res,array_string,array_title);
        listViewData.setAdapter(adapterListViewData);

        //listData.add(new ListView_DataShow(array_res, array_string));

        //----Click  ListView----//
        listViewData.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                intentToMap = new Intent(ShowListView.this, MapsActivity.class);

                if (position == 0) {
                    //1
                    intentToMap.putExtra("CenterLat", 13.965273);
                    intentToMap.putExtra("CenterLng", 100.586958);
                } else if (position == 1) {
                    //2
                    intentToMap.putExtra("CenterLat", 13.963684);
                    intentToMap.putExtra("CenterLng", 100.587991);
                } else if (position == 2) {
                    //3
                    intentToMap.putExtra("CenterLat", 13.963350);
                    intentToMap.putExtra("CenterLng", 100.586822);
                } else if (position == 3){
                    //4
                    intentToMap.putExtra("CenterLat", 13.963219);
                    intentToMap.putExtra("CenterLng", 100.585534);
                }else if (position == 4) {
                    //4/1
                    intentToMap.putExtra("CenterLat", 13.963456);
                    intentToMap.putExtra("CenterLng", 100.586095);
                }
                else if (position == 5) {
                    //4/2
                    intentToMap.putExtra("CenterLat", 13.963024);
                    intentToMap.putExtra("CenterLng", 100.585209);
                }else if (position == 6) {
                    //5
                    intentToMap.putExtra("CenterLat", 13.964504);
                    intentToMap.putExtra("CenterLng", 100.585575);
                }else if (position == 7) {
                    //6
                    intentToMap.putExtra("CenterLat", 13.964377);
                    intentToMap.putExtra("CenterLng", 100.586513);
                }
                else if (position == 8) {
                    //7
                    intentToMap.putExtra("CenterLat", 13.965669);
                    intentToMap.putExtra("CenterLng", 100.586197);
                }
                else if (position == 9) {
                    //8
                    intentToMap.putExtra("CenterLat", 13.965000);
                    intentToMap.putExtra("CenterLng", 100.584734);
                }
                else if (position == 10) {
                    //9
                    intentToMap.putExtra("CenterLat", 13.966080);
                    intentToMap.putExtra("CenterLng", 100.585048);
                }
                else if (position == 11) {
                    //10
                    intentToMap.putExtra("CenterLat", 13.966433);
                    intentToMap.putExtra("CenterLng", 100.585949);
                }
                else if (position == 12) {
                    //11
                    intentToMap.putExtra("CenterLat", 13.966493);
                    intentToMap.putExtra("CenterLng", 100.586494);
                }
                else if (position == 13) {
                    //12
                    intentToMap.putExtra("CenterLat", 13.967308);
                    intentToMap.putExtra("CenterLng", 100.585849);
                }
                else if (position == 14) {
                    //12/1
                    intentToMap.putExtra("CenterLat", 13.966824);
                    intentToMap.putExtra("CenterLng", 100.585768);
                }
                else if (position == 15) {
                    //14
                    intentToMap.putExtra("CenterLat", 13.968712);
                    intentToMap.putExtra("CenterLng", 100.587185);
                }else if (position == 16) {
                    //15
                    intentToMap.putExtra("CenterLat", 13.968318);
                    intentToMap.putExtra("CenterLng", 100.585156);
                }else if (position == 17) {
                    //16
                    intentToMap.putExtra("CenterLat", 13.965719);
                    intentToMap.putExtra("CenterLng", 100.583994);
                }else if (position == 18) {
                    //17
                    intentToMap.putExtra("CenterLat", 13.969008);
                    intentToMap.putExtra("CenterLng", 100.583862);
                }else if (position == 19) {
                    //18
                    intentToMap.putExtra("CenterLat", 13.968433);
                    intentToMap.putExtra("CenterLng", 100.583621);
                }else if (position == 20) {
                    //Patana
                    intentToMap.putExtra("CenterLat", 13.965170);
                    intentToMap.putExtra("CenterLng", 100.585344);
                }


                intentToMap.putExtra("LatBuild1", 13.965273);
                intentToMap.putExtra("LngBuild1", 100.586958);
                intentToMap.putExtra("LatBuild2", 13.963684);
                intentToMap.putExtra("LngBuild2", 100.587991);
                intentToMap.putExtra("LatBuild3", 13.963350);
                intentToMap.putExtra("LngBuild3", 100.586822);
                intentToMap.putExtra("LatBuild4", 13.963219);
                intentToMap.putExtra("LngBuild4", 100.585534);
                intentToMap.putExtra("LatBuild4/1", 13.963456);
                intentToMap.putExtra("LngBuild4/1", 100.586095);
                intentToMap.putExtra("LatBuild4/2", 13.963024);
                intentToMap.putExtra("LngBuild4/2", 100.585209);
                intentToMap.putExtra("LatBuild5", 13.964504);
                intentToMap.putExtra("LngBuild5", 100.585575);
                intentToMap.putExtra("LatBuild6", 13.964377);
                intentToMap.putExtra("LngBuild6", 100.586513);
                intentToMap.putExtra("LatBuild7", 13.965669);
                intentToMap.putExtra("LngBuild7", 100.586197);
                intentToMap.putExtra("LatBuild8", 13.965000);
                intentToMap.putExtra("LngBuild8", 100.584734);
                intentToMap.putExtra("LatBuild9", 13.966080);
                intentToMap.putExtra("LngBuild9", 100.585048);
                intentToMap.putExtra("LatBuild10", 13.966433);
                intentToMap.putExtra("LngBuild10", 100.585949);
                intentToMap.putExtra("LatBuild11", 13.966493);
                intentToMap.putExtra("LngBuild11", 100.586494);
                intentToMap.putExtra("LatBuild12", 13.967308);
                intentToMap.putExtra("LngBuild12", 100.585849);
                intentToMap.putExtra("LatBuild12/1", 13.966824);
                intentToMap.putExtra("LngBuild12/1", 100.585768);
                intentToMap.putExtra("LatBuild13", 13.966935);
                intentToMap.putExtra("LngBuild13", 100.584832);
                intentToMap.putExtra("LatBuild14", 13.968712);
                intentToMap.putExtra("LngBuild14", 100.587185);
                intentToMap.putExtra("LatBuild15", 13.968318);
                intentToMap.putExtra("LngBuild15", 100.585156);
                intentToMap.putExtra("LatBuild16", 13.965719);
                intentToMap.putExtra("LngBuild16", 100.583994);
                intentToMap.putExtra("LatMusicHall", 13.969008);
                intentToMap.putExtra("LngMusicHall", 100.583862);
                intentToMap.putExtra("LatGuan", 13.968433);
                intentToMap.putExtra("LngGuan", 100.583621);
                intentToMap.putExtra("LatBPatana", 13.965170);
                intentToMap.putExtra("LngBPatana", 100.585344);


                startActivity(intentToMap);
            }
        });

    }

    private int[] getImageArray(int resId, int defResId) {

        TypedArray my_image_array = getResources().obtainTypedArray(resId);
        int[] array_res = new int[my_image_array.length()];
        for (int i = 0; i < array_res.length; i++)
            array_res[i] = my_image_array.getResourceId(i, defResId);
        my_image_array.recycle();
        return array_res;
    }

    private String[] getStringArray(int resId) {

        TypedArray my_string_array = getResources().obtainTypedArray(resId);
        String[] array_string = new String[my_string_array.length()];
        for (int i = 0; i < array_string.length; i++)
            array_string[i] = my_string_array.getString(i);
        my_string_array.recycle();
        return array_string;
    }



}//End of onCreate

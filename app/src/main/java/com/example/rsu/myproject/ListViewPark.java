package com.example.rsu.myproject;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by BBMling on 28/11/2558.
 */
public class ListViewPark extends AppCompatActivity {

    private CustomerAdapterFood adapterListViewData;
    private ArrayList<ListView_DataShow> listData = new ArrayList<ListView_DataShow>();
    private ListView listViewData;
    Intent intentToMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_list_view);



        final int[] array_res = getImageArray(R.array.my_image_array_park, R.drawable.logorsu);
        final String[] array_string = getStringArray(R.array.my_string_array_park);

        listViewData = (ListView) findViewById(R.id.listViewData);

        adapterListViewData = new CustomerAdapterFood(getApplicationContext(),array_res,array_string);
        listViewData.setAdapter(adapterListViewData);
        adapterListViewData.notifyDataSetChanged();


        //----Click  ListView----//
        listViewData.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                intentToMap = new Intent(ListViewPark.this, MapsActivity.class);

                Log.d("RSU", "ListViewPark = " + id + "ListViewItem" + position);

                if (position == 0) {
                    intentToMap.putExtra("CenterLat", 13.969063);
                    intentToMap.putExtra("CenterLng", 100.584797);
                } else if (position == 1) {
                    intentToMap.putExtra("CenterLat", 13.967325);
                    intentToMap.putExtra("CenterLng", 100.583241);
                } else {
                    intentToMap.putExtra("CenterLat", 13.967528);
                    intentToMap.putExtra("CenterLng", 100.584807);
                }

                intentToMap.putExtra("LatPark1", 13.969063);
                intentToMap.putExtra("LngPark1", 100.584797);
                intentToMap.putExtra("LatPark2", 13.967325);
                intentToMap.putExtra("LngPark2", 100.583241);
                intentToMap.putExtra("LatPark3", 13.967528);
                intentToMap.putExtra("LngPark3", 100.584807);


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


}

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
public class ListViewFood extends AppCompatActivity {

    private CustomerAdapterFood adapterListViewData;
    private ArrayList<ListView_DataShow> listData = new ArrayList<ListView_DataShow>();
    private ListView listViewData;
    Intent intentToMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_list_view);

        final int[] array_res = getImageArray(R.array.my_image_array_food, R.drawable.logorsu);
        final String[] array_string = getStringArray(R.array.my_string_array_food);

        listViewData = (ListView) findViewById(R.id.listViewData);

        adapterListViewData = new CustomerAdapterFood(getApplicationContext(),array_res,array_string);
        listViewData.setAdapter(adapterListViewData);
        adapterListViewData.notifyDataSetChanged();

        listViewData.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                intentToMap = new Intent(ListViewFood.this, MapsActivity.class);

                if (position == 0) {
                    intentToMap.putExtra("CenterLat", 13.966070);
                    intentToMap.putExtra("CenterLng", 100.584919);
                } else {
                    intentToMap.putExtra("CenterLat", 13.966115);
                    intentToMap.putExtra("CenterLng", 100.585993);
                }
                intentToMap.putExtra("LatFood1", 13.966070);
                intentToMap.putExtra("LngFood1", 100.584919);
                intentToMap.putExtra("LatFood2", 13.966115);
                intentToMap.putExtra("LngFood2", 100.585993);

                Log.d("RSU", "ListViewPosition = " + position);

                startActivity(intentToMap);


            }
        });

    }//End of onCreate



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

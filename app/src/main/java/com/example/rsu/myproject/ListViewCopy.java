package com.example.rsu.myproject;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by BBMling on 9/12/2558.
 */
public class ListViewCopy extends AppCompatActivity {


    private CustomerAdapterFood adapterListViewData;
    private ArrayList<ListView_DataShow> listData = new ArrayList<ListView_DataShow>();
    private ListView listViewData;
    Intent intentToMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_list_view);


        final int[] array_res = getImageArray(R.array.my_image_array_copy, R.drawable.logorsu);
        final String[] array_string = getStringArray(R.array.my_string_array_copy);

        listViewData = (ListView) findViewById(R.id.listViewData);

        adapterListViewData = new CustomerAdapterFood(getApplicationContext(),array_res,array_string);
        listViewData.setAdapter(adapterListViewData);
        adapterListViewData.notifyDataSetChanged();

        listViewData.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                intentToMap = new Intent(ListViewCopy.this, MapsActivity.class);

                if (position == 0) {
                    intentToMap.putExtra("CenterLat", 13.963350);
                    intentToMap.putExtra("CenterLng", 100.586822);
                } else if (position == 1){
                    intentToMap.putExtra("CenterLat", 13.963219);
                    intentToMap.putExtra("CenterLng", 100.585534);
                } else if (position == 2){
                    intentToMap.putExtra("CenterLat", 13.964504);
                    intentToMap.putExtra("CenterLng", 100.585575);
                }else if (position == 3){
                    intentToMap.putExtra("CenterLat", 13.965518);
                    intentToMap.putExtra("CenterLng", 100.586190);
                }
                else {
                    intentToMap.putExtra("CenterLat", 13.966080);
                    intentToMap.putExtra("CenterLng", 100.585048);
                }


                intentToMap.putExtra("LatCopy1", 13.963350);
                intentToMap.putExtra("LngCopy1", 100.586822);
                intentToMap.putExtra("LatCopy2", 13.963219);
                intentToMap.putExtra("LngCopy2", 100.585534);
                intentToMap.putExtra("LatCopy3", 13.964504);
                intentToMap.putExtra("LngCopy3", 100.585575);
                intentToMap.putExtra("LatCopy4", 13.965518);
                intentToMap.putExtra("LngCopy4", 100.586190);
                intentToMap.putExtra("LatCopy5", 13.966080);
                intentToMap.putExtra("LngCopy5", 100.585048);

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

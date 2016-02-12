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
 * Created by BBMling on 11/12/2558.
 */
public class ListViewCafe extends AppCompatActivity {

    private CustomerAdapterFood adapterListViewData;
    private ArrayList<ListView_DataShow> listData = new ArrayList<ListView_DataShow>();
    private ListView listViewData;
    Intent intentToMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_list_view);

        final int[] array_res = getImageArray(R.array.my_image_array_cafe, R.drawable.logorsu);
        final String[] array_string = getStringArray(R.array.my_string_array_cafe);

        listViewData = (ListView) findViewById(R.id.listViewData);

        adapterListViewData = new CustomerAdapterFood(getApplicationContext(),array_res,array_string);
        listViewData.setAdapter(adapterListViewData);
        adapterListViewData.notifyDataSetChanged();

        listViewData.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                intentToMap = new Intent(ListViewCafe.this, MapsActivity.class);

                if (position == 0) {
                    //1
                    intentToMap.putExtra("CenterLat", 13.965234);
                    intentToMap.putExtra("CenterLng", 100.586932);
                } else if (position == 1){
                    //2
                    intentToMap.putExtra("CenterLat", 13.963684);
                    intentToMap.putExtra("CenterLng", 100.587991);
                } else if (position == 2){
                    //3
                    intentToMap.putExtra("CenterLat", 13.963350);
                    intentToMap.putExtra("CenterLng", 100.586822);
                } else if (position == 3) {
                    //4
                    intentToMap.putExtra("CenterLat", 13.963219);
                    intentToMap.putExtra("CenterLng", 100.585534);
                }else if (position == 4){
                    //7
                    intentToMap.putExtra("CenterLat", 13.965518);
                    intentToMap.putExtra("CenterLng", 100.586190);
                }
                else if (position == 5){
                    //8
                    intentToMap.putExtra("CenterLat", 13.965000);
                    intentToMap.putExtra("CenterLng", 100.584734);
                }
                else if (position == 6){
                    //9
                    intentToMap.putExtra("CenterLat", 13.966080);
                    intentToMap.putExtra("CenterLng", 100.585048);
                }
                else if (position == 7){
                    //11
                    intentToMap.putExtra("CenterLat", 13.966493);
                    intentToMap.putExtra("CenterLng", 100.586494);
                } else if (position == 8){
                    //12/1
                    intentToMap.putExtra("CenterLat", 13.966824);
                    intentToMap.putExtra("CenterLng", 100.585768);
                }
                else {
                    //15
                    intentToMap.putExtra("CenterLat", 13.968318);
                    intentToMap.putExtra("CenterLng", 100.585156);
                }

                intentToMap.putExtra("LatCafe1", 13.965234);
                intentToMap.putExtra("LngCafe1", 100.586932);
                intentToMap.putExtra("LatCafe2", 13.963684);
                intentToMap.putExtra("LngCafe2", 100.587991);
                intentToMap.putExtra("LatCafe3", 100.586822);
                intentToMap.putExtra("LngCafe3", 100.585575);
                intentToMap.putExtra("LatCafe4", 13.963219);
                intentToMap.putExtra("LngCafe4", 100.585534);
                intentToMap.putExtra("LatCafe5", 13.965518);//7
                intentToMap.putExtra("LngCafe5", 100.586190);//7
                intentToMap.putExtra("LatCafe6", 13.965000);//8
                intentToMap.putExtra("LngCafe6", 100.584734);//8
                intentToMap.putExtra("LatCafe7", 13.966080);//9
                intentToMap.putExtra("LngCafe7", 100.585048);//9
                intentToMap.putExtra("LatCafe8", 13.966493);//11
                intentToMap.putExtra("LngCafe8", 100.586494);//11
                intentToMap.putExtra("LatCafe9", 13.966824);//12/1
                intentToMap.putExtra("LngCafe9", 100.585768);//12/1
                intentToMap.putExtra("LatCafe10", 13.968318);//15
                intentToMap.putExtra("LngCafe10", 100.585156);//15

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

package com.example.rsu.myproject;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/**
 * Created by BBMling on 12/12/2558.
 */
public class Adapter_Data extends BaseAdapter {

    LayoutInflater inflater;
    Context context;
    int[] resId;
    String[] strName;
    //ImageView imageView;
    //String[] strDescription;
    String[] strWebsite;
    //String[] strLat;
    //String[] strLng;

    public Adapter_Data(Context context /*,int[] resId*/, String[] strName /*,String[] strWebsite*/) {
        this.inflater = LayoutInflater.from(context);
        this.context = context;
        this.resId = resId;
        this.strName = strName;
        this.strWebsite = strWebsite;

    }


    @Override

    public int getCount() {
        return strName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        /*imageView = null;
        if (convertView == null)
            convertView = inflater.inflate(R.layout.listview, parent, false);


        imageView = (ImageView) convertView.findViewById(R.id.imageView2);
        imageView.setBackgroundResource(resId[position]);*/

        Spinner spinner = (Spinner) convertView.findViewById(R.id.spinner);




        return convertView;
    }
}

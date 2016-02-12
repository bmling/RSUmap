package com.example.rsu.myproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by BBMling on 27/11/2558.
 */
public class CustomAdapter extends BaseAdapter {

    LayoutInflater INFLATER;
    Context context;
    //private ArrayList<ListView_DataShow> listData = new ArrayList<ListView_DataShow>();
    String[] strName;
    String[] titleName;
    int[] resId;


    public CustomAdapter(Context context/*, ArrayList<ListView_DataShow> listData*/, int[] resId, String[] strName,String[] titleName) {
        this.context = context;
        this.INFLATER = LayoutInflater.from(context);
        //this.listData = listData;
        this.strName = strName;
        this.titleName = titleName;
        this.resId = resId;
        //INFLATER = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
    public View getView(int position, View view, ViewGroup parent) {


        ImageView imageView = null;
        if (view == null)//{
            view = INFLATER.inflate(R.layout.listview_row, null);


        imageView = (ImageView) view.findViewById(R.id.imvlong);
        imageView.setBackgroundResource(resId[position]);

        TextView textViewTitle = (TextView) view.findViewById(R.id.titlelong);
        textViewTitle.setText(titleName[position]);

        TextView textView = (TextView) view.findViewById(R.id.txtlong);
        textView.setText(strName[position]);

        return view;
    }


}

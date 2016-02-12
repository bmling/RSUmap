package com.example.rsu.myproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by BBMling on 28/11/2558.
 */
public class CustomerAdapterFood extends BaseAdapter {

    LayoutInflater inflater;
    Context context;
    String[] strName;
    int[] resId;
    ImageView imageView;

    public CustomerAdapterFood(Context context, int[] resId, String[] strName) {
        this.context = context;
        this.strName = strName;
        this.resId = resId;
        this.inflater = LayoutInflater.from(context);
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
    public View getView(int position, View convertView, ViewGroup parent) {


        imageView = null;
        if (convertView == null)
            convertView = inflater.inflate(R.layout.listview, parent, false);


        imageView = (ImageView) convertView.findViewById(R.id.imvlongf);
        imageView.setBackgroundResource(resId[position]);


        TextView textView = (TextView) convertView.findViewById(R.id.txtlongf);
        textView.setText(strName[position]);

        return convertView;

    }
}

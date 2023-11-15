package com.example.interface_graphiquep1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ClassAdapter extends BaseAdapter {
    ArrayList data ;
    Context context;
    public ClassAdapter(ArrayList data , Context context){
        this.data = data;
        this.context = context;
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1,null);
            TextView tv = convertView.findViewById(android.R.id.text1);
            String txt=getItem(position).toString();
            tv.setText(txt);
        }
        return convertView;
    }
}

package com.example.sumeyyegorgulu.newsapp;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

import static android.view.LayoutInflater.from;

/**
 * Created by sumeyye.gorgulu on 6/16/2017.
 */



public class NewListAdapter extends BaseAdapter {

    ArrayList<News> newsList;
    Context context;

    public NewListAdapter(ArrayList<News> newsList, Context context) {
        this.newsList = newsList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return newsList.size();
    }

    @Override
    public Object getItem(int position) {
        return newsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater=from(context);
        convertView=layoutInflater.inflate(R.layout.activity_new_list_item,null);

        ImageView imgNew= (ImageView) convertView.findViewById(R.id.newImg);
        TextView text= (TextView) convertView.findViewById(R.id.newLink);

        imgNew.setImageResource(newsList.get(position).getNewImg());
        text.setText(newsList.get(position).getNewName());

        text.setMovementMethod(LinkMovementMethod.getInstance());

        return convertView;
    }
}

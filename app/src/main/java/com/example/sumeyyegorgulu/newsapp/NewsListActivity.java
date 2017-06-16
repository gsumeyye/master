package com.example.sumeyyegorgulu.newsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_list);

        News haberturk=new News(R.string.haberturk_link,R.mipmap.haberturk);
        News hurriyet=new News(R.string.hurriyet_link,R.mipmap.hurriyet);
        News cnn=new News(R.string.cnn_link,R.mipmap.cnn);
        News milliyet=new News(R.string.milliyet_link,R.mipmap.milliyet);

        final ArrayList<News> newList =new ArrayList<>();
        newList.add(haberturk);
        newList.add(hurriyet);
        newList.add(cnn);
        newList.add(milliyet);

        NewListAdapter listAdapter= new NewListAdapter(newList,NewsListActivity.this);
        final ListView listView=(ListView)findViewById(R.id.listView);
        listView.setAdapter(listAdapter);

    }
}

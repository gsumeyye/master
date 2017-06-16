package com.example.sumeyyegorgulu.newsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button loginOk;
    EditText loginName,loginPwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginOk= (Button) findViewById(R.id.okLogin);
        loginName= (EditText) findViewById(R.id.nameLogin);
        loginPwd= (EditText) findViewById(R.id.pwdLogin);

        loginOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(loginName!=null && loginPwd!=null && loginName.getText().toString().equals("A") &&  loginPwd.getText().toString().equals("A")){
                    Intent intent =new Intent(MainActivity.this,NewsListActivity.class);
                    startActivity(intent);
                }

            }
        });

    }
}

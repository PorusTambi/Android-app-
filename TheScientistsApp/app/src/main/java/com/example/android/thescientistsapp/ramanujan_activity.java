package com.example.android.thescientistsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ramanujan_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ramanujan_layout);
    }


    public void a17(View view)
    {
        Intent i=new Intent(this,common.class);
        i.putExtra("btn", 17);
        startActivity(i);
    }


    public void a18(View view)
    {
        Intent i=new Intent(this,common.class);
        i.putExtra("btn",18);
        startActivity(i);
    }

    public void a19(View view)
    {
        Intent i=new Intent(this,common.class);
        i.putExtra("btn", 19);
        startActivity(i);
    }

    public void a20(View view)
    {
        Intent i=new Intent(this,common.class);
        i.putExtra("btn", 20);
        startActivity(i);
    }
}

package com.example.android.thescientistsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class schrodinger_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schrodinger_layout);
    }


    public void a9(View view)
    {
        Intent i=new Intent(this,common.class);
        i.putExtra("btn", 9);
        startActivity(i);
    }


    public void a10(View view)
    {
        Intent i=new Intent(this,common.class);
        i.putExtra("btn",10);
        startActivity(i);
    }

    public void a11(View view)
    {
        Intent i=new Intent(this,common.class);
        i.putExtra("btn", 11);
        startActivity(i);
    }

    public void a12(View view)
    {
        Intent i=new Intent(this,common.class);
        i.putExtra("btn", 12);
        startActivity(i);
    }


}

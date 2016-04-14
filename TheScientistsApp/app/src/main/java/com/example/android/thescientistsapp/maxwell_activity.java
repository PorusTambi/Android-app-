package com.example.android.thescientistsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class maxwell_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maxwell_layout);
    }

    public void a13(View view)
    {
        Intent i=new Intent(this,common.class);
        i.putExtra("btn", 13);
        startActivity(i);
    }


    public void a14(View view)
    {
        Intent i=new Intent(this,common.class);
        i.putExtra("btn",14);
        startActivity(i);
    }

    public void a15(View view)
    {
        Intent i=new Intent(this,common.class);
        i.putExtra("btn", 15);
        startActivity(i);
    }

    public void a16(View view)
    {
        Intent i=new Intent(this,common.class);
        i.putExtra("btn", 16);
        startActivity(i);
    }
}

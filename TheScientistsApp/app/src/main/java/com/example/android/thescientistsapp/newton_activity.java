package com.example.android.thescientistsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class newton_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newton_layout);

    }

    public void a5(View view)
    {
        Intent i=new Intent(this,common.class);
        i.putExtra("btn", 5);
        startActivity(i);
    }


    public void a6(View view)
    {
        Intent i=new Intent(this,common.class);
        i.putExtra("btn",6);
        startActivity(i);
    }

    public void a7(View view)
    {
        Intent i=new Intent(this,common.class);
        i.putExtra("btn", 7);
        startActivity(i);
    }

    public void a8(View view)
    {
        Intent i=new Intent(this,common.class);
        i.putExtra("btn", 8);
        startActivity(i);
    }

}

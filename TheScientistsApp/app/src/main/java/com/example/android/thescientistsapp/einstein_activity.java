package com.example.android.thescientistsapp;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class einstein_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

            setContentView(R.layout.einstein_layout);




    }

    public void a1(View view)
    {
        Intent i=new Intent(this,common.class);
        i.putExtra("btn", 1);
        startActivity(i);
    }


    public void a2(View view)
    {
        Intent i=new Intent(this,common.class);
        i.putExtra("btn",2);
        startActivity(i);
    }

    public void a3(View view)
    {
        Intent i=new Intent(this,common.class);
        i.putExtra("btn", 3);
        startActivity(i);
    }

    public void a4(View view)
    {
        Intent i=new Intent(this,common.class);
        i.putExtra("btn", 4);
        startActivity(i);
    }


}

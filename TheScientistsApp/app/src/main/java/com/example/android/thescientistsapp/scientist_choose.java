package com.example.android.thescientistsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class scientist_choose extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientist_choose);
    }

    public void einstein(View view){


        Intent intent_einstein=new Intent(this,einstein_activity.class);
        startActivity(intent_einstein);
    }


    public void newton(View view){


        Intent intent_newton=new Intent(this,newton_activity.class);
        startActivity(intent_newton);
    }

    public void schrodinger(View view){


        Intent intent_schrodinger=new Intent(this,schrodinger_activity.class);
        startActivity(intent_schrodinger);
    }

    public void maxwell(View view){


        Intent intent_maxwell=new Intent(this,maxwell_activity.class);
        startActivity(intent_maxwell);
    }


    public void ramanujan(View view){


        Intent intent_ramanujan=new Intent(this,ramanujan_activity.class);
        startActivity(intent_ramanujan);
    }




}

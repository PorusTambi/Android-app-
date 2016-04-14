package com.example.android.thescientistsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

public class common extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int check_variable = getIntent().getIntExtra("btn", 0);

        setContentView(R.layout.common);

        ScrollView a1 = (ScrollView) findViewById(R.id.a1);
        ScrollView a2 = (ScrollView) findViewById(R.id.a2);
        ScrollView a3 = (ScrollView) findViewById(R.id.a3);
        ScrollView a4 = (ScrollView) findViewById(R.id.a4);
        ScrollView a5 = (ScrollView) findViewById(R.id.a5);
        ScrollView a6 = (ScrollView) findViewById(R.id.a6);
        ScrollView a7 = (ScrollView) findViewById(R.id.a7);
        ScrollView a8 = (ScrollView) findViewById(R.id.a8);
        ScrollView a9 = (ScrollView) findViewById(R.id.a9);
        ScrollView a10 = (ScrollView) findViewById(R.id.a10);
        ScrollView a11 = (ScrollView) findViewById(R.id.a11);
        ScrollView a12 = (ScrollView) findViewById(R.id.a12);
        ScrollView a13 = (ScrollView) findViewById(R.id.a13);
        ScrollView a14 = (ScrollView) findViewById(R.id.a14);
        ScrollView a15 = (ScrollView) findViewById(R.id.a15);
        ScrollView a16 = (ScrollView) findViewById(R.id.a16);
        ScrollView a17 = (ScrollView) findViewById(R.id.a17);
        ScrollView a18 = (ScrollView) findViewById(R.id.a18);
        ScrollView a19 = (ScrollView) findViewById(R.id.a19);
        ScrollView a20 = (ScrollView) findViewById(R.id.a20);

        if (check_variable == 1) {

            a2.setVisibility(View.INVISIBLE);
            a3.setVisibility(View.INVISIBLE);
            a4.setVisibility(View.INVISIBLE);
            a5.setVisibility(View.INVISIBLE);
            a6.setVisibility(View.INVISIBLE);
            a7.setVisibility(View.INVISIBLE);
            a8.setVisibility(View.INVISIBLE);
            a9.setVisibility(View.INVISIBLE);
            a10.setVisibility(View.INVISIBLE);
            a11.setVisibility(View.INVISIBLE);
            a12.setVisibility(View.INVISIBLE);
            a13.setVisibility(View.INVISIBLE);
            a14.setVisibility(View.INVISIBLE);
            a15.setVisibility(View.INVISIBLE);
            a16.setVisibility(View.INVISIBLE);
            a17.setVisibility(View.INVISIBLE);
            a18.setVisibility(View.INVISIBLE);
            a19.setVisibility(View.INVISIBLE);
            a20.setVisibility(View.INVISIBLE);

        }


       else if (check_variable == 2) {

            a1.setVisibility(View.INVISIBLE);
            a3.setVisibility(View.INVISIBLE);
            a4.setVisibility(View.INVISIBLE);
            a5.setVisibility(View.INVISIBLE);
            a6.setVisibility(View.INVISIBLE);
            a7.setVisibility(View.INVISIBLE);
            a8.setVisibility(View.INVISIBLE);
            a9.setVisibility(View.INVISIBLE);
            a10.setVisibility(View.INVISIBLE);
            a11.setVisibility(View.INVISIBLE);
            a12.setVisibility(View.INVISIBLE);
            a13.setVisibility(View.INVISIBLE);
            a14.setVisibility(View.INVISIBLE);
            a15.setVisibility(View.INVISIBLE);
            a16.setVisibility(View.INVISIBLE);
            a17.setVisibility(View.INVISIBLE);
            a18.setVisibility(View.INVISIBLE);
            a19.setVisibility(View.INVISIBLE);
            a20.setVisibility(View.INVISIBLE);


        }

        else  if (check_variable == 3) {

            a1.setVisibility(View.INVISIBLE);
            a2.setVisibility(View.INVISIBLE);
            a4.setVisibility(View.INVISIBLE);
            a5.setVisibility(View.INVISIBLE);
            a6.setVisibility(View.INVISIBLE);
            a7.setVisibility(View.INVISIBLE);
            a8.setVisibility(View.INVISIBLE);
            a9.setVisibility(View.INVISIBLE);
            a10.setVisibility(View.INVISIBLE);
            a11.setVisibility(View.INVISIBLE);
            a12.setVisibility(View.INVISIBLE);
            a13.setVisibility(View.INVISIBLE);
            a14.setVisibility(View.INVISIBLE);
            a15.setVisibility(View.INVISIBLE);
            a16.setVisibility(View.INVISIBLE);
            a17.setVisibility(View.INVISIBLE);
            a18.setVisibility(View.INVISIBLE);
            a19.setVisibility(View.INVISIBLE);
            a20.setVisibility(View.INVISIBLE);


        }

        else if (check_variable == 4) {

            a1.setVisibility(View.INVISIBLE);
            a2.setVisibility(View.INVISIBLE);
            a3.setVisibility(View.INVISIBLE);
            a5.setVisibility(View.INVISIBLE);
            a6.setVisibility(View.INVISIBLE);
            a7.setVisibility(View.INVISIBLE);
            a8.setVisibility(View.INVISIBLE);
            a9.setVisibility(View.INVISIBLE);
            a10.setVisibility(View.INVISIBLE);
            a11.setVisibility(View.INVISIBLE);
            a12.setVisibility(View.INVISIBLE);
            a13.setVisibility(View.INVISIBLE);
            a14.setVisibility(View.INVISIBLE);
            a15.setVisibility(View.INVISIBLE);
            a16.setVisibility(View.INVISIBLE);
            a17.setVisibility(View.INVISIBLE);
            a18.setVisibility(View.INVISIBLE);
            a19.setVisibility(View.INVISIBLE);
            a20.setVisibility(View.INVISIBLE);


        }

        else if (check_variable == 5) {

            a1.setVisibility(View.INVISIBLE);
            a2.setVisibility(View.INVISIBLE);
            a3.setVisibility(View.INVISIBLE);
            a4.setVisibility(View.INVISIBLE);
            a6.setVisibility(View.INVISIBLE);
            a7.setVisibility(View.INVISIBLE);
            a8.setVisibility(View.INVISIBLE);
            a9.setVisibility(View.INVISIBLE);
            a10.setVisibility(View.INVISIBLE);
            a11.setVisibility(View.INVISIBLE);
            a12.setVisibility(View.INVISIBLE);
            a13.setVisibility(View.INVISIBLE);
            a14.setVisibility(View.INVISIBLE);
            a15.setVisibility(View.INVISIBLE);
            a16.setVisibility(View.INVISIBLE);
            a17.setVisibility(View.INVISIBLE);
            a18.setVisibility(View.INVISIBLE);
            a19.setVisibility(View.INVISIBLE);
            a20.setVisibility(View.INVISIBLE);


        }

        else if (check_variable == 6) {

            a2.setVisibility(View.INVISIBLE);
            a3.setVisibility(View.INVISIBLE);
            a4.setVisibility(View.INVISIBLE);
            a5.setVisibility(View.INVISIBLE);
            a1.setVisibility(View.INVISIBLE);
            a7.setVisibility(View.INVISIBLE);
            a8.setVisibility(View.INVISIBLE);
            a9.setVisibility(View.INVISIBLE);
            a10.setVisibility(View.INVISIBLE);
            a11.setVisibility(View.INVISIBLE);
            a12.setVisibility(View.INVISIBLE);
            a13.setVisibility(View.INVISIBLE);
            a14.setVisibility(View.INVISIBLE);
            a15.setVisibility(View.INVISIBLE);
            a16.setVisibility(View.INVISIBLE);
            a17.setVisibility(View.INVISIBLE);
            a18.setVisibility(View.INVISIBLE);
            a19.setVisibility(View.INVISIBLE);
            a20.setVisibility(View.INVISIBLE);


        }

        else if (check_variable == 7) {

            a2.setVisibility(View.INVISIBLE);
            a3.setVisibility(View.INVISIBLE);
            a4.setVisibility(View.INVISIBLE);
            a5.setVisibility(View.INVISIBLE);
            a6.setVisibility(View.INVISIBLE);
            a1.setVisibility(View.INVISIBLE);
            a8.setVisibility(View.INVISIBLE);
            a9.setVisibility(View.INVISIBLE);
            a10.setVisibility(View.INVISIBLE);
            a11.setVisibility(View.INVISIBLE);
            a12.setVisibility(View.INVISIBLE);
            a13.setVisibility(View.INVISIBLE);
            a14.setVisibility(View.INVISIBLE);
            a15.setVisibility(View.INVISIBLE);
            a16.setVisibility(View.INVISIBLE);
            a17.setVisibility(View.INVISIBLE);
            a18.setVisibility(View.INVISIBLE);
            a19.setVisibility(View.INVISIBLE);
            a20.setVisibility(View.INVISIBLE);


        }

        else if (check_variable == 8) {

            a2.setVisibility(View.INVISIBLE);
            a3.setVisibility(View.INVISIBLE);
            a4.setVisibility(View.INVISIBLE);
            a5.setVisibility(View.INVISIBLE);
            a6.setVisibility(View.INVISIBLE);
            a7.setVisibility(View.INVISIBLE);
            a1.setVisibility(View.INVISIBLE);
            a9.setVisibility(View.INVISIBLE);
            a10.setVisibility(View.INVISIBLE);
            a11.setVisibility(View.INVISIBLE);
            a12.setVisibility(View.INVISIBLE);
            a13.setVisibility(View.INVISIBLE);
            a14.setVisibility(View.INVISIBLE);
            a15.setVisibility(View.INVISIBLE);
            a16.setVisibility(View.INVISIBLE);
            a17.setVisibility(View.INVISIBLE);
            a18.setVisibility(View.INVISIBLE);
            a19.setVisibility(View.INVISIBLE);
            a20.setVisibility(View.INVISIBLE);


        }

        else if (check_variable == 9) {

            a2.setVisibility(View.INVISIBLE);
            a3.setVisibility(View.INVISIBLE);
            a4.setVisibility(View.INVISIBLE);
            a5.setVisibility(View.INVISIBLE);
            a6.setVisibility(View.INVISIBLE);
            a7.setVisibility(View.INVISIBLE);
            a8.setVisibility(View.INVISIBLE);
            a1.setVisibility(View.INVISIBLE);
            a10.setVisibility(View.INVISIBLE);
            a11.setVisibility(View.INVISIBLE);
            a12.setVisibility(View.INVISIBLE);
            a13.setVisibility(View.INVISIBLE);
            a14.setVisibility(View.INVISIBLE);
            a15.setVisibility(View.INVISIBLE);
            a16.setVisibility(View.INVISIBLE);
            a17.setVisibility(View.INVISIBLE);
            a18.setVisibility(View.INVISIBLE);
            a19.setVisibility(View.INVISIBLE);
            a20.setVisibility(View.INVISIBLE);


        }

        else if (check_variable == 10) {

            a2.setVisibility(View.INVISIBLE);
            a3.setVisibility(View.INVISIBLE);
            a4.setVisibility(View.INVISIBLE);
            a5.setVisibility(View.INVISIBLE);
            a6.setVisibility(View.INVISIBLE);
            a7.setVisibility(View.INVISIBLE);
            a8.setVisibility(View.INVISIBLE);
            a9.setVisibility(View.INVISIBLE);
            a1.setVisibility(View.INVISIBLE);
            a11.setVisibility(View.INVISIBLE);
            a12.setVisibility(View.INVISIBLE);
            a13.setVisibility(View.INVISIBLE);
            a14.setVisibility(View.INVISIBLE);
            a15.setVisibility(View.INVISIBLE);
            a16.setVisibility(View.INVISIBLE);
            a17.setVisibility(View.INVISIBLE);
            a18.setVisibility(View.INVISIBLE);
            a19.setVisibility(View.INVISIBLE);
            a20.setVisibility(View.INVISIBLE);


        }

        else if (check_variable == 11) {

            a2.setVisibility(View.INVISIBLE);
            a3.setVisibility(View.INVISIBLE);
            a4.setVisibility(View.INVISIBLE);
            a5.setVisibility(View.INVISIBLE);
            a6.setVisibility(View.INVISIBLE);
            a7.setVisibility(View.INVISIBLE);
            a8.setVisibility(View.INVISIBLE);
            a9.setVisibility(View.INVISIBLE);
            a10.setVisibility(View.INVISIBLE);
            a1.setVisibility(View.INVISIBLE);
            a12.setVisibility(View.INVISIBLE);
            a13.setVisibility(View.INVISIBLE);
            a14.setVisibility(View.INVISIBLE);
            a15.setVisibility(View.INVISIBLE);
            a16.setVisibility(View.INVISIBLE);
            a17.setVisibility(View.INVISIBLE);
            a18.setVisibility(View.INVISIBLE);
            a19.setVisibility(View.INVISIBLE);
            a20.setVisibility(View.INVISIBLE);


        }

        else if (check_variable == 12) {

            a2.setVisibility(View.INVISIBLE);
            a3.setVisibility(View.INVISIBLE);
            a4.setVisibility(View.INVISIBLE);
            a5.setVisibility(View.INVISIBLE);
            a6.setVisibility(View.INVISIBLE);
            a7.setVisibility(View.INVISIBLE);
            a8.setVisibility(View.INVISIBLE);
            a9.setVisibility(View.INVISIBLE);
            a10.setVisibility(View.INVISIBLE);
            a11.setVisibility(View.INVISIBLE);
            a1.setVisibility(View.INVISIBLE);
            a13.setVisibility(View.INVISIBLE);
            a14.setVisibility(View.INVISIBLE);
            a15.setVisibility(View.INVISIBLE);
            a16.setVisibility(View.INVISIBLE);
            a17.setVisibility(View.INVISIBLE);
            a18.setVisibility(View.INVISIBLE);
            a19.setVisibility(View.INVISIBLE);
            a20.setVisibility(View.INVISIBLE);


        }

        else if (check_variable == 13) {

            a2.setVisibility(View.INVISIBLE);
            a3.setVisibility(View.INVISIBLE);
            a4.setVisibility(View.INVISIBLE);
            a5.setVisibility(View.INVISIBLE);
            a6.setVisibility(View.INVISIBLE);
            a7.setVisibility(View.INVISIBLE);
            a8.setVisibility(View.INVISIBLE);
            a9.setVisibility(View.INVISIBLE);
            a10.setVisibility(View.INVISIBLE);
            a11.setVisibility(View.INVISIBLE);
            a12.setVisibility(View.INVISIBLE);
            a1.setVisibility(View.INVISIBLE);
            a14.setVisibility(View.INVISIBLE);
            a15.setVisibility(View.INVISIBLE);
            a16.setVisibility(View.INVISIBLE);
            a17.setVisibility(View.INVISIBLE);
            a18.setVisibility(View.INVISIBLE);
            a19.setVisibility(View.INVISIBLE);
            a20.setVisibility(View.INVISIBLE);


        }

        else if (check_variable == 14) {

            a2.setVisibility(View.INVISIBLE);
            a3.setVisibility(View.INVISIBLE);
            a4.setVisibility(View.INVISIBLE);
            a5.setVisibility(View.INVISIBLE);
            a6.setVisibility(View.INVISIBLE);
            a7.setVisibility(View.INVISIBLE);
            a8.setVisibility(View.INVISIBLE);
            a9.setVisibility(View.INVISIBLE);
            a10.setVisibility(View.INVISIBLE);
            a11.setVisibility(View.INVISIBLE);
            a12.setVisibility(View.INVISIBLE);
            a13.setVisibility(View.INVISIBLE);
            a1.setVisibility(View.INVISIBLE);
            a15.setVisibility(View.INVISIBLE);
            a16.setVisibility(View.INVISIBLE);
            a17.setVisibility(View.INVISIBLE);
            a18.setVisibility(View.INVISIBLE);
            a19.setVisibility(View.INVISIBLE);
            a20.setVisibility(View.INVISIBLE);


        }

        else if (check_variable == 15) {

            a2.setVisibility(View.INVISIBLE);
            a3.setVisibility(View.INVISIBLE);
            a4.setVisibility(View.INVISIBLE);
            a5.setVisibility(View.INVISIBLE);
            a6.setVisibility(View.INVISIBLE);
            a7.setVisibility(View.INVISIBLE);
            a8.setVisibility(View.INVISIBLE);
            a9.setVisibility(View.INVISIBLE);
            a10.setVisibility(View.INVISIBLE);
            a11.setVisibility(View.INVISIBLE);
            a12.setVisibility(View.INVISIBLE);
            a13.setVisibility(View.INVISIBLE);
            a14.setVisibility(View.INVISIBLE);
            a1.setVisibility(View.INVISIBLE);
            a16.setVisibility(View.INVISIBLE);
            a17.setVisibility(View.INVISIBLE);
            a18.setVisibility(View.INVISIBLE);
            a19.setVisibility(View.INVISIBLE);
            a20.setVisibility(View.INVISIBLE);


        }

        else if (check_variable == 16) {

            a2.setVisibility(View.INVISIBLE);
            a3.setVisibility(View.INVISIBLE);
            a4.setVisibility(View.INVISIBLE);
            a5.setVisibility(View.INVISIBLE);
            a6.setVisibility(View.INVISIBLE);
            a7.setVisibility(View.INVISIBLE);
            a8.setVisibility(View.INVISIBLE);
            a9.setVisibility(View.INVISIBLE);
            a10.setVisibility(View.INVISIBLE);
            a11.setVisibility(View.INVISIBLE);
            a12.setVisibility(View.INVISIBLE);
            a13.setVisibility(View.INVISIBLE);
            a14.setVisibility(View.INVISIBLE);
            a15.setVisibility(View.INVISIBLE);
            a1.setVisibility(View.INVISIBLE);
            a17.setVisibility(View.INVISIBLE);
            a18.setVisibility(View.INVISIBLE);
            a19.setVisibility(View.INVISIBLE);
            a20.setVisibility(View.INVISIBLE);


        }

        else if (check_variable == 17) {

            a2.setVisibility(View.INVISIBLE);
            a3.setVisibility(View.INVISIBLE);
            a4.setVisibility(View.INVISIBLE);
            a5.setVisibility(View.INVISIBLE);
            a6.setVisibility(View.INVISIBLE);
            a7.setVisibility(View.INVISIBLE);
            a8.setVisibility(View.INVISIBLE);
            a9.setVisibility(View.INVISIBLE);
            a10.setVisibility(View.INVISIBLE);
            a11.setVisibility(View.INVISIBLE);
            a12.setVisibility(View.INVISIBLE);
            a13.setVisibility(View.INVISIBLE);
            a14.setVisibility(View.INVISIBLE);
            a15.setVisibility(View.INVISIBLE);
            a16.setVisibility(View.INVISIBLE);
            a1.setVisibility(View.INVISIBLE);
            a18.setVisibility(View.INVISIBLE);
            a19.setVisibility(View.INVISIBLE);
            a20.setVisibility(View.INVISIBLE);


        }

        else if (check_variable == 18) {

            a2.setVisibility(View.INVISIBLE);
            a3.setVisibility(View.INVISIBLE);
            a4.setVisibility(View.INVISIBLE);
            a5.setVisibility(View.INVISIBLE);
            a6.setVisibility(View.INVISIBLE);
            a7.setVisibility(View.INVISIBLE);
            a8.setVisibility(View.INVISIBLE);
            a9.setVisibility(View.INVISIBLE);
            a10.setVisibility(View.INVISIBLE);
            a11.setVisibility(View.INVISIBLE);
            a12.setVisibility(View.INVISIBLE);
            a13.setVisibility(View.INVISIBLE);
            a14.setVisibility(View.INVISIBLE);
            a15.setVisibility(View.INVISIBLE);
            a16.setVisibility(View.INVISIBLE);
            a17.setVisibility(View.INVISIBLE);
            a1.setVisibility(View.INVISIBLE);
            a19.setVisibility(View.INVISIBLE);
            a20.setVisibility(View.INVISIBLE);


        }

        else if (check_variable == 19) {

            a2.setVisibility(View.INVISIBLE);
            a3.setVisibility(View.INVISIBLE);
            a4.setVisibility(View.INVISIBLE);
            a5.setVisibility(View.INVISIBLE);
            a6.setVisibility(View.INVISIBLE);
            a7.setVisibility(View.INVISIBLE);
            a8.setVisibility(View.INVISIBLE);
            a9.setVisibility(View.INVISIBLE);
            a10.setVisibility(View.INVISIBLE);
            a11.setVisibility(View.INVISIBLE);
            a12.setVisibility(View.INVISIBLE);
            a13.setVisibility(View.INVISIBLE);
            a14.setVisibility(View.INVISIBLE);
            a15.setVisibility(View.INVISIBLE);
            a16.setVisibility(View.INVISIBLE);
            a17.setVisibility(View.INVISIBLE);
            a18.setVisibility(View.INVISIBLE);
            a1.setVisibility(View.INVISIBLE);
            a20.setVisibility(View.INVISIBLE);


        }

        else if (check_variable == 20) {

            a2.setVisibility(View.INVISIBLE);
            a3.setVisibility(View.INVISIBLE);
            a4.setVisibility(View.INVISIBLE);
            a5.setVisibility(View.INVISIBLE);
            a6.setVisibility(View.INVISIBLE);
            a7.setVisibility(View.INVISIBLE);
            a8.setVisibility(View.INVISIBLE);
            a9.setVisibility(View.INVISIBLE);
            a10.setVisibility(View.INVISIBLE);
            a11.setVisibility(View.INVISIBLE);
            a12.setVisibility(View.INVISIBLE);
            a13.setVisibility(View.INVISIBLE);
            a14.setVisibility(View.INVISIBLE);
            a15.setVisibility(View.INVISIBLE);
            a16.setVisibility(View.INVISIBLE);
            a17.setVisibility(View.INVISIBLE);
            a18.setVisibility(View.INVISIBLE);
            a19.setVisibility(View.INVISIBLE);
            a1.setVisibility(View.INVISIBLE);


        }


    }


}


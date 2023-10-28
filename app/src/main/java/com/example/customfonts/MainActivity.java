package com.example.customfonts;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView t1,t11;
EditText t00,t0;
TextView b2,b3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (TextView) findViewById(R.id.t1);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/CURLZ___.TTF");
        t1.setTypeface(typeface);

        t11 = (TextView) findViewById(R.id.t11);
        Typeface typeface11 = Typeface.createFromAsset(getAssets(), "fonts/CURLZ___.TTF");
        t11.setTypeface(typeface11);

        t0 = (EditText) findViewById(R.id.t0);
        Typeface typeface00 = Typeface.createFromAsset(getAssets(), "fonts/CURLZ___.TTF");
        t0.setTypeface(typeface);

        t00 = (EditText) findViewById(R.id.t00);
        Typeface typeface0 = Typeface.createFromAsset(getAssets(), "fonts/CURLZ___.TTF");
        t00.setTypeface(typeface);

        b2 = (TextView) findViewById(R.id.b2);
        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "fonts/ALGER.TTF");
        b2.setTypeface(typeface1);

        b3 = (TextView) findViewById(R.id.b3);
        Typeface typeface3 = Typeface.createFromAsset(getAssets(), "fonts/ALGER.TTF");
        b3.setTypeface(typeface3);


    }
}
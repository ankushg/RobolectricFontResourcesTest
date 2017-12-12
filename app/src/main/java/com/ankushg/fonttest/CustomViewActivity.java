package com.ankushg.fonttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Basic Activity which attempts to use a custom View, which sets its Typeface via a font resource
 * in the view's constructor
 */
public class CustomViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_customview);
    }
}

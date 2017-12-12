package com.ankushg.fonttest;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

/**
 * Created by ankushg on 12/12/17.
 */

public class CustomButton extends AppCompatButton {
    public CustomButton(Context context) {
        super(context);
        initializeFont(context, null);
    }

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        initializeFont(context, attrs);
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initializeFont(context, attrs);
    }

    private void initializeFont(Context context, AttributeSet attrs) {
        Typeface typeface = ResourcesCompat.getFont(context, R.font.vt323_regular);
        setTypeface(typeface);
    }
}

package com.nk.flexboxlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * https://android-developers.googleblog.com/2017/02/build-flexible-layouts-with.html - official documentation
 * https://github.com/google/flexbox-layout - library
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
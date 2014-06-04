package com.epy0n0ff.groovy.android.app.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.epy0n0ff.groovy.android.app.R;

public class SubActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sub);

        TextView textView = (TextView) findViewById(R.id.hello_text_view);
        textView.setText("Hello, java world!");
    }
}
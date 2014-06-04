package com.epy0n0ff.groovy.android.app.activity

import android.app.Activity
import android.os.Bundle
import com.epy0n0ff.groovy.android.app.R

class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        def textView = findViewById(R.id.hello_text_view)
        textView.setText("Hello! groovy world!")

    }
}

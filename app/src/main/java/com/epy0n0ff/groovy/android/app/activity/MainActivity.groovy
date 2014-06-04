package com.epy0n0ff.groovy.android.app.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.epy0n0ff.groovy.android.app.R

class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        def textView = findViewById(R.id.hello_text_view)
        textView.setText("Hello! groovy world!")

        def button = findViewById(R.id.next_button)
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SubActivity.class))
            }
        })
    }
}


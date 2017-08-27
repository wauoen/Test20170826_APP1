package com.test.test20170826_app1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Activity5 extends AppCompatActivity {

    private final String TAG = "Activity5";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {

        TextView title = (TextView) findViewById(R.id.title);
        title.setText(TAG);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(Activity1.this, Activity2.class);
                Intent intent = new Intent(Activity5.this, Activity1.class);
                startActivity(intent);
            }
        });
    }
}

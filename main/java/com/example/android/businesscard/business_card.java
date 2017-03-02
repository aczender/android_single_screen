package com.example.android.businesscard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class business_card extends AppCompatActivity {

    Button h;
    Button m;
    Button p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_card);

        h = (Button) findViewById(R.id.coffee_history);
        h.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Under construction", Toast.LENGTH_SHORT).show();
            }
        });
        m = (Button) findViewById(R.id.coffee_menu);
        m.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Under construction", Toast.LENGTH_SHORT).show();
            }
        });
        p = (Button) findViewById(R.id.coffee_pictures);
        p.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Under construction", Toast.LENGTH_SHORT).show();
            }
        });
    }

}



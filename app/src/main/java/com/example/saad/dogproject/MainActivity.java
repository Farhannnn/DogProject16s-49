package com.example.saad.dogproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout lay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lay=findViewById(R.id.layout);
        lay.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view==lay)
        {
            Intent intent=new Intent(MainActivity.this,ViewPagerActivity.class);
            startActivity(intent);
        }
    }
}

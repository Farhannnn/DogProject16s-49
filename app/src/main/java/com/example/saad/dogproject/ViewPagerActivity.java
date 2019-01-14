package com.example.saad.dogproject;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViewPagerActivity extends AppCompatActivity implements View.OnClickListener {
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;
    TabLayout tabLayout;
    Button train;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        initViews();
        train=findViewById(R.id.training);
        setAdapters();
        tabLayout.setupWithViewPager(viewPager);
    }
    private void initViews() {
        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);
    }
    private void setAdapters() {
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);
    }

    @Override
    public void onClick(View view) {
        if(view==train){
            Intent intent=new Intent(getApplicationContext(),ShowSteps.class);
            startActivity(intent);
        }
    }
}

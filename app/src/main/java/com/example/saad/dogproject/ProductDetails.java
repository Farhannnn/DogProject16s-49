package com.example.saad.dogproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductDetails extends AppCompatActivity {
    TextView t,t1;
    ImageView IvImg;
    String step,desp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        t=findViewById(R.id.tvProductName1);
        t1=findViewById(R.id.tvProductPrice1);
        IvImg=findViewById(R.id.IvLogo1);



        try
        {
            Intent intent=getIntent();
            if(intent!=null)
            {
                Bundle bundle=getIntent().getExtras();
                step=bundle.getString("productprice");
                desp=bundle.getString("productname");


                t.setText("Dog Training Step : "+desp);
                t1.setText("Description : "+step);
            }
        }catch (Exception ex)
        {
            ex.getMessage();
        }
    }
}

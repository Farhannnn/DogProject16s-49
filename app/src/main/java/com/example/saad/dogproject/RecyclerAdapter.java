package com.example.saad.dogproject;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    private List<RecyclerModel> recyclerModels;
    CardView cd;
    static String Desp;
    private static Context context;

    public RecyclerAdapter(Context context, List<RecyclerModel> list)
    {
        this.context = context;
        this.recyclerModels = list;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_layout, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position)
    {
        RecyclerModel model=recyclerModels.get(position);

        if(model!=null)
        {
            holder.tvProductName.setText(model.getProductName());
            Desp=model.getProductPrice();

        }



    }

    @Override
    public int getItemCount()
    {
        return recyclerModels.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView tvProductName, tvProductPrice;
        public MyViewHolder(View itemView)
        {
            super(itemView);
            itemView.setOnClickListener(this);
            tvProductName = itemView.findViewById(R.id.tv_productname);
            tvProductPrice = itemView.findViewById(R.id.tv_prductprice);

        }

        @Override
        public void onClick(View view)
        {
            Intent intent=new Intent(context,ProductDetails.class);
            Bundle bundle=new Bundle();
            bundle.putString("productname",tvProductName.getText().toString());
            bundle.putString("productprice",Desp);

            intent.putExtras(bundle);

            context.startActivity(intent);
        }
    }
}

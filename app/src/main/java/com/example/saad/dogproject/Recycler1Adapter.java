package com.example.saad.dogproject;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class Recycler1Adapter extends RecyclerView.Adapter<Recycler1Adapter.MyViewHolder1> {
    private List<Recycler1Model> recycler1Models;
    CardView cd;
    static String Desp;
    private static Context context;

    public Recycler1Adapter(Context context, List<Recycler1Model> list)
    {
        this.context = context;
        this.recycler1Models = list;
    }
    @Override
    public MyViewHolder1 onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item2_layout, parent,false);
        return new MyViewHolder1(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder1 holder, int position)
    {
        Recycler1Model model=recycler1Models.get(position);

        if(model!=null)
        {
            holder.tvProductName.setText(model.getDogName());
            Desp=model.getDogDesp();

        }



    }

    @Override
    public int getItemCount()
    {
        return recycler1Models.size();
    }
    public static class MyViewHolder1 extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView tvProductName, tvProductPrice;
        public MyViewHolder1(View itemView)
        {
            super(itemView);
            itemView.setOnClickListener(this);
            tvProductName = itemView.findViewById(R.id.tv_productname);
            tvProductPrice = itemView.findViewById(R.id.tv_prductprice);

        }

        @Override
        public void onClick(View view)
        {
            Intent intent=new Intent(context,DogBreed.class);
            Bundle bundle=new Bundle();
            bundle.putString("productname",tvProductName.getText().toString());
            bundle.putString("productprice",Desp);

            intent.putExtras(bundle);

            context.startActivity(intent);
        }
    }
}

package com.example.saadna.moviearena;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class Adapterrechomeonenewsone extends RecyclerView.Adapter<Adapterrechomeonenewsone.MyViewHolder>{



private List<String> txt1,txt2;
 private List<String> url;
    public class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageButton imageButton;
        public TextView t1, t2;
        public Context c;
        public MyViewHolder(View view) {
            super(view);
            imageButton = (ImageButton)view.findViewById(R.id.imghomenewsone);
            t1 = (TextView)view.findViewById(R.id.cardhomenewsone);
            t2 = (TextView)view.findViewById(R.id.cardhomenewsonetwo);

        }
    }
    public Adapterrechomeonenewsone(List<String> url, List<String> txt1, List<String> txt2) {

        this.url= url;
        this.txt1= txt1;
        this.txt2= txt2;
    }


    @Override
    public Adapterrechomeonenewsone.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardforreconenewsone, parent, false);
        return new Adapterrechomeonenewsone.MyViewHolder(itemView);

    }


    @Override
    public void onBindViewHolder(Adapterrechomeonenewsone.MyViewHolder holder, final int position) {

        holder.t1.setText(txt1.get(position));
        holder.t2.setText(txt2.get(position));
        Picasso.with(holder.imageButton.getContext()).load(url.get(position)).placeholder(R.drawable.back).fit().into(holder.imageButton);

    }

    @Override
    public  int getItemCount() {

        return url.size();
    }
}

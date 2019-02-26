package com.example.saadna.moviearena;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class Adapterreclistthr extends RecyclerView.Adapter<Adapterreclistthr.MyViewHolder>{


    private List<String> url;
private List<String> txt1;
    private List<String> txt2;
    public class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView t1,t2;
        public MyViewHolder(View view) {
            super(view);
            imageView = (ImageView) view.findViewById(R.id.imagelistthr);
            t1 = (TextView)view.findViewById(R.id.textlistthrone);
            t2 = (TextView)view.findViewById(R.id.textlistthrtwo);


        }
    }
    public Adapterreclistthr(List<String> url , List <String> txt1 , List<String> txt2) {

        this.url= url;
        this.txt1=txt1;
        this.txt2= txt2;
    }


    @Override
    public Adapterreclistthr.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardforlistthr, parent, false);
        return new Adapterreclistthr.MyViewHolder(itemView);

    }


    @Override
    public void onBindViewHolder(Adapterreclistthr.MyViewHolder holder, final int position) {
        holder.t1.setText(txt1.get(position));
        holder.t2.setText(txt2.get(position));
        Picasso.with(holder.imageView.getContext()).load(url.get(position)).placeholder(R.drawable.back).fit().into(holder.imageView);




    }

    @Override
    public int getItemCount() {

        return url.size();
    }
}

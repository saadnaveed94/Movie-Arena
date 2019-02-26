package com.example.saadna.moviearena;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class Adapterreccelebone extends RecyclerView.Adapter<Adapterreccelebone.MyViewHolder>{


    private List<String> url;
private List<String> txt1;
    private List<String> txt2;
   public class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView t1,t2;
        public RatingBar ratingBar;
        public MyViewHolder(View view) {
            super(view);
            imageView = (ImageView) view.findViewById(R.id.imagelistaction);
            t1 = (TextView)view.findViewById(R.id.textlistactionone);
            t2 = (TextView)view.findViewById(R.id.textcelebonetwo);

ratingBar= (RatingBar)view.findViewById(R.id.rat);
        }
    }
    public Adapterreccelebone(List<String> url , List <String> txt1 , List<String> txt2) {

        this.url = url;
        this.txt1 = txt1;
        this.txt2 = txt2;

    }


    @Override
    public Adapterreccelebone.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardforcelebone, parent, false);
        return new Adapterreccelebone.MyViewHolder(itemView);

    }


    @Override
    public void onBindViewHolder(Adapterreccelebone.MyViewHolder holder, final int position) {
        holder.t1.setText(txt1.get(position));
        holder.t2.setText(txt2.get(position));
        Picasso.with(holder.imageView.getContext()).load(url.get(position)).placeholder(R.drawable.back).fit().into(holder.imageView);

        if (position==0) {
            holder.ratingBar.setRating(4.5f);
        }
    else if (position==1){
            holder.ratingBar.setRating(4.5f);
        }
        else if (position==2){
            holder.ratingBar.setRating(4.5f);
        }
        else if (position==3){
            holder.ratingBar.setRating(4.5f);
        }
        else if (position==4){
            holder.ratingBar.setRating(4.5f);
        } else if (position==5){
            holder.ratingBar.setRating(4.5f);
        }
        else if (position==6){
            holder.ratingBar.setRating(4.5f);
        }
        else if (position==7){
            holder.ratingBar.setRating(4.5f);
        }
        else if (position==8){
            holder.ratingBar.setRating(4.0f);
        }
        else if (position==9){
            holder.ratingBar.setRating(4.0f);
        }
        else if (position==10){
            holder.ratingBar.setRating(4.0f);
        }
        else if (position==11){
            holder.ratingBar.setRating(4.0f);
        }
        else if (position==12){
            holder.ratingBar.setRating(4.0f);
        }
        else if (position==13){
            holder.ratingBar.setRating(4.0f);
        }
        else if (position==14){
            holder.ratingBar.setRating(3.5f);
        }
        else if (position==15){
            holder.ratingBar.setRating(3.5f);
        }
        else if (position==16){
            holder.ratingBar.setRating(3.5f);
        }
        else if (position==17){
            holder.ratingBar.setRating(3.5f);
        }
        else if (position==18){
            holder.ratingBar.setRating(3.5f);
        }
        else if (position==19){
            holder.ratingBar.setRating(3.5f);
        }


    }

    @Override
    public int getItemCount() {

        return url.size();
    }
}

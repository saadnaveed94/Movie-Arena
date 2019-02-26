package com.example.saadna.moviearena;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class Adaptercelebnews extends RecyclerView.Adapter<Adaptercelebnews.MyViewHolder>{


    private List<String> url;
private List<String> txt1,txt2;
    public class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageButton imageButton;
        public TextView t1,t2;
        public MyViewHolder(View view) {
            super(view);
            imageButton = (ImageButton)view.findViewById(R.id.imgcelebnews);
            t1 = (TextView)view.findViewById(R.id.txtcelebnews);
            t2 = (TextView)view.findViewById(R.id.textcelebnewstwo);


        }
    }
    public Adaptercelebnews(List<String> url , List <String> txt1, List<String> txt2 ) {

        this.url= url;
        this.txt1=txt1;
        this.txt2= txt2;
    }


    @Override
    public Adaptercelebnews.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardforcelebnews, parent, false);
        return new Adaptercelebnews.MyViewHolder(itemView);

    }


    @Override
    public void onBindViewHolder(Adaptercelebnews.MyViewHolder holder, final int position) {
        holder.t1.setText(txt1.get(position));
        holder.t2.setText(txt2.get(position));

        Picasso.with(holder.imageButton.getContext()).load(url.get(position)).placeholder(R.drawable.back).fit().into(holder.imageButton);





    }

    @Override
    public int getItemCount() {

        return url.size();
    }
}

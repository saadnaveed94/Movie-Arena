package com.example.saadna.moviearena;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class Adapterrectvone extends RecyclerView.Adapter<Adapterrectvone.MyViewHolder>{


    private List<String> txt1,txt2;
    private List<String> url,vid;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageButton imageButton;
        public TextView t1, t2;
        public Context c;
        public MyViewHolder(View view) {
            super(view);
            imageButton = (ImageButton)view.findViewById(R.id.imgtvoneback);
            t1 = (TextView)view.findViewById(R.id.texttvoneone);
            t2= (TextView)view.findViewById(R.id.texttvonetwo);
        }
    }
    public Adapterrectvone(List<String> url, List<String> txt1, List<String> txt2 ,List<String> vid) {


        this.url= url;
        this.txt1= txt1;
        this.txt2= txt2;
this.vid = vid;
    }


    @Override
    public Adapterrectvone.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardfortvone, parent, false);
        return new Adapterrectvone.MyViewHolder(itemView);

    }


    @Override
    public void onBindViewHolder(Adapterrectvone.MyViewHolder holder, final int position) {

        holder.t1.setText(txt1.get(position));
        holder.t2.setText(txt2.get(position));
        Picasso.with(holder.imageButton.getContext()).load(url.get(position)).placeholder(R.drawable.back).fit().into(holder.imageButton);


        holder.imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position==0){
                    Intent intent = new Intent(v.getContext(),Videoviewactivityone.class);
                    intent.putExtra("Url",vid.get(0));
                    intent.putExtra("name",txt1.get(0));
                    v.getContext().startActivity(intent);

                }
                else if (position ==1){
                    Intent intent = new Intent(v.getContext(),Videoviewactivityone.class);
                    intent.putExtra("Url",vid.get(1));
                    intent.putExtra("name",txt1.get(1));

                    v.getContext().startActivity(intent);
                }
                else if (position ==2){
                    Intent intent = new Intent(v.getContext(),Videoviewactivityone.class);
                    intent.putExtra("Url",vid.get(2));
                    intent.putExtra("name",txt1.get(2));

                    v.getContext().startActivity(intent);
                }
                else if (position ==3){
                    Intent intent = new Intent(v.getContext(),Videoviewactivityone.class);
                    intent.putExtra("Url",vid.get(3));
                    intent.putExtra("name",txt1.get(3));

                    v.getContext().startActivity(intent);
                }
                else if (position ==4){
                    Intent intent = new Intent(v.getContext(),Videoviewactivityone.class);
                    intent.putExtra("Url",vid.get(4));
                    intent.putExtra("name",txt1.get(4));

                    v.getContext().startActivity(intent);
                }

            }
        });

    }

    @Override
    public int getItemCount() {

        return url.size();
    }
}

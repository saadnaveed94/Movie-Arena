package com.example.saadna.moviearena;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class Adapterrectvtwo extends RecyclerView.Adapter<Adapterrectvtwo.MyViewHolder>{


    private List<String> url;
private List<String> txt1,vid;
    public class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageButton imageButton;
        public TextView t1;
        public MyViewHolder(View view) {
            super(view);
            imageButton = (ImageButton)view.findViewById(R.id.imgtvrectwo);
            t1 = (TextView)view.findViewById(R.id.txttvrectwo);


        }
    }
    public Adapterrectvtwo(List<String> url , List <String> txt1,List<String> vid ) {

        this.url= url;
        this.txt1=txt1;
        this.vid= vid;
    }


    @Override
    public Adapterrectvtwo.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardforrectvtwo, parent, false);
        return new Adapterrectvtwo.MyViewHolder(itemView);

    }


    @Override
    public void onBindViewHolder(Adapterrectvtwo.MyViewHolder holder, final int position) {
        holder.t1.setText(txt1.get(position));
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
                else if (position ==5){
                    Intent intent = new Intent(v.getContext(),Videoviewactivityone.class);
                    intent.putExtra("Url",vid.get(5));
                    intent.putExtra("name",txt1.get(5));

                    v.getContext().startActivity(intent);
                }

                else if (position ==6){
                    Intent intent = new Intent(v.getContext(),Videoviewactivityone.class);
                    intent.putExtra("Url",vid.get(6));
                    intent.putExtra("name",txt1.get(6));

                    v.getContext().startActivity(intent);
                }

                else if (position ==7){
                    Intent intent = new Intent(v.getContext(),Videoviewactivityone.class);
                    intent.putExtra("Url",vid.get(7));
                    intent.putExtra("name",txt1.get(7));

                    v.getContext().startActivity(intent);
                }

                else if (position ==8){
                    Intent intent = new Intent(v.getContext(),Videoviewactivityone.class);
                    intent.putExtra("Url",vid.get(8));
                    intent.putExtra("name",txt1.get(8));

                    v.getContext().startActivity(intent);
                }

                else if (position ==9){
                    Intent intent = new Intent(v.getContext(),Videoviewactivityone.class);
                    intent.putExtra("Url",vid.get(9));
                    intent.putExtra("name",txt1.get(9));

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

package com.example.saadna.moviearena;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

public class Adapterrectvfive extends RecyclerView.Adapter<Adapterrectvfive.MyViewHolder>{


    private List<Integer> url;
private List<String> txt;
    public class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageButton imageButton;
        public TextView t1;
        public MyViewHolder(View view) {
            super(view);
            imageButton = (ImageButton)view.findViewById(R.id.imgtvrecfive);
            t1 = (TextView)view.findViewById(R.id.txttvrecfive);


        }
    }
    public Adapterrectvfive(List<Integer> url , List <String> txt ) {

        this.url= url;
        this.txt=txt;

    }


    @Override
    public Adapterrectvfive.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardforrectvfive, parent, false);
        return new Adapterrectvfive.MyViewHolder(itemView);

    }


    @Override
    public void onBindViewHolder(Adapterrectvfive.MyViewHolder holder, final int position) {
        holder.t1.setText(txt.get(position));

        holder.imageButton.setImageResource(url.get(position));



        holder.imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0) {
                    Intent intent = new Intent(v.getContext(), ListActiontv.class);

                    v.getContext().startActivity(intent);

                } else if (position == 1) {
                    Intent intent = new Intent(v.getContext(), ListAdvtv.class);

                    v.getContext().startActivity(intent);

                } else if (position == 2) {
                    Intent intent = new Intent(v.getContext(), Listbiotv.class);

                    v.getContext().startActivity(intent);

                } else if (position == 3) {
                    Intent intent = new Intent(v.getContext(), ListCometv.class);

                    v.getContext().startActivity(intent);

                } else if (position == 4) {
                    Intent intent = new Intent(v.getContext(), ListCrimetv.class);

                    v.getContext().startActivity(intent);

                } else if (position == 5) {
                    Intent intent = new Intent(v.getContext(), ListDramatv.class);

                    v.getContext().startActivity(intent);

                } else if (position == 6) {
                    Intent intent = new Intent(v.getContext(), ListFamilytv.class);

                    v.getContext().startActivity(intent);

                } else if (position == 7) {
                    Intent intent = new Intent(v.getContext(), ListHorrortv.class);

                    v.getContext().startActivity(intent);

                } else if (position == 8) {
                    Intent intent = new Intent(v.getContext(), ListRomtv.class);

                    v.getContext().startActivity(intent);

                } else if (position == 9) {
                    Intent intent = new Intent(v.getContext(), ListScitv.class);

                    v.getContext().startActivity(intent);

                } else if (position == 10) {
                    Intent intent = new Intent(v.getContext(), Listthrtv.class);

                    v.getContext().startActivity(intent);

                } else if (position == 11) {
                    Intent intent = new Intent(v.getContext(), Listwartv.class);

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

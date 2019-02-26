package com.example.saadna.moviearena;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

public class Adapterrecmoviefive extends RecyclerView.Adapter<Adapterrecmoviefive.MyViewHolder>{


    private List<Integer> url;
private List<String> txt;
    public class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageButton imageButton;
        public TextView t1;
        public MyViewHolder(View view) {
            super(view);
            imageButton = (ImageButton)view.findViewById(R.id.imgmovierecfive);
            t1 = (TextView)view.findViewById(R.id.txtmovierecfive);


        }
    }
    public Adapterrecmoviefive(List<Integer> url , List <String> txt ) {

        this.url= url;
        this.txt=txt;

    }


    @Override
    public Adapterrecmoviefive.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardforrecmoviefive, parent, false);
        return new Adapterrecmoviefive.MyViewHolder(itemView);

    }


    @Override
    public void onBindViewHolder(Adapterrecmoviefive.MyViewHolder holder, final int position) {
        holder.t1.setText(txt.get(position));

        holder.imageButton.setImageResource(url.get(position));


        holder.imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0) {
                    Intent intent = new Intent(v.getContext(), ListAction.class);

                    v.getContext().startActivity(intent);

                } else if (position == 1) {
                    Intent intent = new Intent(v.getContext(), ListAdv.class);

                    v.getContext().startActivity(intent);

                } else if (position == 2) {
                    Intent intent = new Intent(v.getContext(), Listbio.class);

                    v.getContext().startActivity(intent);

                } else if (position == 3) {
                    Intent intent = new Intent(v.getContext(), ListCome.class);

                    v.getContext().startActivity(intent);

                } else if (position == 4) {
                    Intent intent = new Intent(v.getContext(), ListCrime.class);

                    v.getContext().startActivity(intent);

                } else if (position == 5) {
                    Intent intent = new Intent(v.getContext(), ListDrama.class);

                    v.getContext().startActivity(intent);

                } else if (position == 6) {
                    Intent intent = new Intent(v.getContext(), ListFamily.class);

                    v.getContext().startActivity(intent);

                } else if (position == 7) {
                    Intent intent = new Intent(v.getContext(), ListHorror.class);

                    v.getContext().startActivity(intent);

                } else if (position == 8) {
                    Intent intent = new Intent(v.getContext(), ListRom.class);

                    v.getContext().startActivity(intent);

                } else if (position == 9) {
                    Intent intent = new Intent(v.getContext(), ListSci.class);

                    v.getContext().startActivity(intent);

                } else if (position == 10) {
                    Intent intent = new Intent(v.getContext(), Listthr.class);

                    v.getContext().startActivity(intent);

                } else if (position == 11) {
                    Intent intent = new Intent(v.getContext(), Listwar.class);

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

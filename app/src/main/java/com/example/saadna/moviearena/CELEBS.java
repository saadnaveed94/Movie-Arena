package com.example.saadna.moviearena;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


public class CELEBS extends Fragment {
protected RecyclerView recyclerViewone, recyclerViewnews;
protected List<Float> a;
    protected Adapterreccelebone adapterreccelebone;
    protected Adaptercelebnews adaptercelebnews;
    public FirebaseDatabase database;
    public DatabaseReference refone;
    protected String url1rec1,url2rec1,url3rec1,url4rec1,url5rec1,url6rec1,url7rec1,url8rec1,url9rec1,url10rec1,url11rec1,url12rec1,url13rec1,url14rec1,url15rec1,url16rec1,url17rec1,url18rec1,url19rec1,url20rec1;
    protected String txt1rec1,txt2rec1,txt3rec1,txt4rec1,txt5rec1,txt6rec1,txt7rec1,txt8rec1,txt9rec1,txt10rec1,txt11rec1,txt12rec1,txt13rec1,txt14rec1,txt15rec1,txt16rec1,txt17rec1,txt18rec1,txt19rec1,txt20rec1;
    protected String txt21rec1,txt22rec1,txt23rec1,txt24rec1,txt25rec1,txt26rec1,txt27rec1,txt28rec1,txt29rec1,txt210rec1,txt211rec1,txt212rec1,txt213rec1,txt214rec1,txt215rec1,txt216rec1,txt217rec1,txt218rec1,txt219rec1,txt220rec1;

    protected List<String> arrurlrec1,arrtxt1rec1,arrtxt2rec1;
    protected List<String> arrurlrecnews,arrtxt1recnews,arrtxt2recnews;
    protected String url1news, url2news, txt11news, txt12news, txt21news, txt22news;
    public CELEBS() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_celeb,container,false);
        recyclerViewone = (RecyclerView)view.findViewById(R.id.celeblist);
        recyclerViewnews = (RecyclerView)view.findViewById(R.id.celebnews);



        database = FirebaseDatabase.getInstance();
        refone = database.getReference().child("celeb");
        refone.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                url1rec1 = dataSnapshot.child("rec1url1").getValue(String.class);
                url2rec1 = dataSnapshot.child("rec1url2").getValue(String.class);
                url3rec1 = dataSnapshot.child("rec1url3").getValue(String.class);
                url4rec1 = dataSnapshot.child("rec1url4").getValue(String.class);
                url5rec1 = dataSnapshot.child("rec1url5").getValue(String.class);
                url6rec1 = dataSnapshot.child("rec1url6").getValue(String.class);
                url7rec1 = dataSnapshot.child("rec1url7").getValue(String.class);
                url8rec1 = dataSnapshot.child("rec1url8").getValue(String.class);
                url9rec1 = dataSnapshot.child("rec1url9").getValue(String.class);
                url10rec1 = dataSnapshot.child("rec1url10").getValue(String.class);
                url11rec1 = dataSnapshot.child("rec1url11").getValue(String.class);
                url12rec1 = dataSnapshot.child("rec1url12").getValue(String.class);
                url13rec1 = dataSnapshot.child("rec1url13").getValue(String.class);
                url14rec1 = dataSnapshot.child("rec1url14").getValue(String.class);
                url15rec1 = dataSnapshot.child("rec1url15").getValue(String.class);
                url16rec1 = dataSnapshot.child("rec1url16").getValue(String.class);
                url17rec1 = dataSnapshot.child("rec1url17").getValue(String.class);
                url18rec1 = dataSnapshot.child("rec1url18").getValue(String.class);
                url19rec1 = dataSnapshot.child("rec1url19").getValue(String.class);
                url20rec1 = dataSnapshot.child("rec1url20").getValue(String.class);





                arrurlrec1 = new ArrayList<String>();
                arrurlrec1.add(url1rec1);
                arrurlrec1.add(url2rec1);
                arrurlrec1.add(url3rec1);
                arrurlrec1.add(url4rec1);
                arrurlrec1.add(url5rec1);
                arrurlrec1.add(url6rec1);
                arrurlrec1.add(url7rec1);
                arrurlrec1.add(url8rec1);
                arrurlrec1.add(url9rec1);
                arrurlrec1.add(url10rec1);
                arrurlrec1.add(url11rec1);
                arrurlrec1.add(url12rec1);
                arrurlrec1.add(url13rec1);
                arrurlrec1.add(url14rec1);
                arrurlrec1.add(url15rec1);
                arrurlrec1.add(url16rec1);
                arrurlrec1.add(url17rec1);
                arrurlrec1.add(url18rec1);
                arrurlrec1.add(url19rec1);
                arrurlrec1.add(url20rec1);


                txt1rec1 = dataSnapshot.child("rec1txt1").getValue(String.class);
                txt2rec1 = dataSnapshot.child("rec1txt2").getValue(String.class);
                txt3rec1 = dataSnapshot.child("rec1txt3").getValue(String.class);
                txt4rec1 = dataSnapshot.child("rec1txt4").getValue(String.class);
                txt5rec1 = dataSnapshot.child("rec1txt5").getValue(String.class);
                txt6rec1 = dataSnapshot.child("rec1txt6").getValue(String.class);
                txt7rec1 = dataSnapshot.child("rec1txt7").getValue(String.class);
                txt8rec1 = dataSnapshot.child("rec1txt8").getValue(String.class);
                txt9rec1 = dataSnapshot.child("rec1txt9").getValue(String.class);
                txt10rec1 = dataSnapshot.child("rec1txt10").getValue(String.class);
                txt11rec1 = dataSnapshot.child("rec1txt11").getValue(String.class);
                txt12rec1 = dataSnapshot.child("rec1txt12").getValue(String.class);
                txt13rec1 = dataSnapshot.child("rec1txt13").getValue(String.class);
                txt14rec1 = dataSnapshot.child("rec1txt14").getValue(String.class);
                txt15rec1 = dataSnapshot.child("rec1txt15").getValue(String.class);
                txt16rec1 = dataSnapshot.child("rec1txt16").getValue(String.class);
                txt17rec1 = dataSnapshot.child("rec1txt17").getValue(String.class);
                txt18rec1 = dataSnapshot.child("rec1txt18").getValue(String.class);
                txt19rec1 = dataSnapshot.child("rec1txt19").getValue(String.class);

                txt20rec1 = dataSnapshot.child("rec1txt20").getValue(String.class);

                arrtxt1rec1 = new ArrayList<String>();
                arrtxt1rec1.add(txt1rec1);

                arrtxt1rec1.add(txt2rec1);
                arrtxt1rec1.add(txt3rec1);
                arrtxt1rec1.add(txt4rec1);
                arrtxt1rec1.add(txt5rec1);
                arrtxt1rec1.add(txt6rec1);
                arrtxt1rec1.add(txt7rec1);
                arrtxt1rec1.add(txt8rec1);
                arrtxt1rec1.add(txt9rec1);
                arrtxt1rec1.add(txt10rec1);
                arrtxt1rec1.add(txt11rec1);
                arrtxt1rec1.add(txt12rec1);
                arrtxt1rec1.add(txt13rec1);
                arrtxt1rec1.add(txt14rec1);
                arrtxt1rec1.add(txt15rec1);
                arrtxt1rec1.add(txt16rec1);
                arrtxt1rec1.add(txt17rec1);
                arrtxt1rec1.add(txt18rec1);
                arrtxt1rec1.add(txt19rec1);
                arrtxt1rec1.add(txt20rec1);



                txt21rec1 = dataSnapshot.child("rec1txtt1").getValue(String.class);
                txt22rec1 = dataSnapshot.child("rec1txtt2").getValue(String.class);
                txt23rec1 = dataSnapshot.child("rec1txtt3").getValue(String.class);
                txt24rec1 = dataSnapshot.child("rec1txtt4").getValue(String.class);
                txt25rec1 = dataSnapshot.child("rec1txtt5").getValue(String.class);
                txt26rec1 = dataSnapshot.child("rec1txtt6").getValue(String.class);
                txt27rec1 = dataSnapshot.child("rec1txtt7").getValue(String.class);
                txt28rec1 = dataSnapshot.child("rec1txtt8").getValue(String.class);
                txt29rec1 = dataSnapshot.child("rec1txtt9").getValue(String.class);
                txt210rec1 = dataSnapshot.child("rec1txtt10").getValue(String.class);
                txt211rec1 = dataSnapshot.child("rec1txtt11").getValue(String.class);
                txt212rec1 = dataSnapshot.child("rec1txtt12").getValue(String.class);
                txt213rec1 = dataSnapshot.child("rec1txtt13").getValue(String.class);
                txt214rec1 = dataSnapshot.child("rec1txtt14").getValue(String.class);
                txt215rec1 = dataSnapshot.child("rec1txtt15").getValue(String.class);
                txt216rec1 = dataSnapshot.child("rec1txtt16").getValue(String.class);
                txt217rec1 = dataSnapshot.child("rec1txtt17").getValue(String.class);
                txt218rec1 = dataSnapshot.child("rec1txtt18").getValue(String.class);
                txt219rec1 = dataSnapshot.child("rec1txtt19").getValue(String.class);

                txt220rec1 = dataSnapshot.child("rec1txtt20").getValue(String.class);

                arrtxt2rec1 = new ArrayList<String>();
                arrtxt2rec1.add(txt21rec1);

                arrtxt2rec1.add(txt22rec1);
                arrtxt2rec1.add(txt23rec1);
                arrtxt2rec1.add(txt24rec1);
                arrtxt2rec1.add(txt25rec1);
                arrtxt2rec1.add(txt26rec1);
                arrtxt2rec1.add(txt27rec1);
                arrtxt2rec1.add(txt28rec1);
                arrtxt2rec1.add(txt29rec1);
                arrtxt2rec1.add(txt210rec1);
                arrtxt2rec1.add(txt211rec1);
                arrtxt2rec1.add(txt212rec1);
                arrtxt2rec1.add(txt213rec1);
                arrtxt2rec1.add(txt214rec1);
                arrtxt2rec1.add(txt215rec1);
                arrtxt2rec1.add(txt216rec1);
                arrtxt2rec1.add(txt217rec1);
                arrtxt2rec1.add(txt218rec1);
                arrtxt2rec1.add(txt219rec1);
                arrtxt2rec1.add(txt220rec1);


                url1news = dataSnapshot.child("recnewsurl1").getValue(String.class);
                url2news = dataSnapshot.child("recnewsurl2").getValue(String.class);
                arrurlrecnews = new ArrayList<String>();
                arrurlrecnews.add(txt21rec1);

                arrurlrecnews.add(txt22rec1);

                txt11news = dataSnapshot.child("recnewstxt11").getValue(String.class);
                txt12news = dataSnapshot.child("recnewstxt12").getValue(String.class);
                arrtxt1recnews = new ArrayList<String>();
                arrtxt1recnews.add(txt11news);

                arrtxt1recnews.add(txt12news);

                txt21news = dataSnapshot.child("recnewstxt21").getValue(String.class);
                txt22news = dataSnapshot.child("recnewstxt22").getValue(String.class);
                arrtxt2recnews = new ArrayList<String>();
                arrtxt2recnews.add(txt21news);

                arrtxt2recnews.add(txt22news);




                LinearLayoutManager aa = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
                recyclerViewone.setLayoutManager(aa);
                recyclerViewone.setNestedScrollingEnabled(false);
                adapterreccelebone = new Adapterreccelebone(arrurlrec1,arrtxt1rec1,arrtxt2rec1);
                recyclerViewone.setAdapter(adapterreccelebone);


                LinearLayoutManager b = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
                recyclerViewnews.setLayoutManager(b);
                adaptercelebnews = new Adaptercelebnews(arrurlrecnews,arrtxt1recnews,arrtxt2recnews);
                recyclerViewnews.setAdapter(adaptercelebnews);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });





return  view;
    }


}

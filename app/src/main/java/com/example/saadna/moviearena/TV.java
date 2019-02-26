package com.example.saadna.moviearena;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TV extends Fragment {

    protected RecyclerView recyclerViewone ,recyclerViewtwo,recyclerViewfour,recyclerViewfive,recyclerViewthree;
    protected Adapterrectvone adapterrectvone;
    protected Adapterrectvtwo adapterrectvtwo;
    protected Adapterrectvthree adapterrectvthree;
    protected Adapterrectvfour adapterrectvfour;
    protected Adapterrectvfive adapterrectvfive;


    protected TextView textViewone,textViewtwo;
    protected TextView textViewrelaoneone, textViewrelaonetwo;
    public FirebaseDatabase database;
    public DatabaseReference refone;

    protected ArrayList<String> arrurlrec1,arrtxt1rec1,arrtxt2rec1,arrimgnewsone,vid1,vid2,vid3,vid4;
    protected ArrayList <String> arrurlrec2,arrtxtrec2,arrtxtnewsone,arrtxtnewsthree;
    protected ArrayList<String> arrurlrec3,arrtxtrec3;
protected ArrayList<String> arrurlrec4,arrtxtrec4;
    protected    String url1rec1,url2rec1,url3rec1,url4rec1,url5rec1;
    protected    String txt11rec1,txt12rec1,txt13rec1,txt14rec1,txt15rec1;

    protected    String vid1rec1,vid2rec1,vid3rec1,vid4rec1,vid5rec1;
    protected    String vid1rec2,vid2rec2,vid3rec2,vid4rec2,vid5rec2,vid6rec2,vid7rec2,vid8rec2,vid9rec2,vid10rec2;
    protected    String vid1rec3,vid2rec3,vid3rec3,vid4rec3,vid5rec3,vid6rec3,vid7rec3,vid8rec3,vid9rec3,vid10rec3;
protected String vid1rec4,vid2rec4,vid3rec4,vid4rec4,vid5rec4,vid6rec4,vid7rec4,vid8rec4,vid9rec4,vid10rec4,vid11rec4,vid12rec4,vid13rec4,vid14rec4,vid15rec4,vid16rec4,vid17rec4,vid18rec4,vid19rec4,vid20rec4;

    protected    String url1rec2,url2rec2,url3rec2,url4rec2,url5rec2,url6rec2,url7rec2,url8rec2,url9rec2,url10rec2;
    protected    String txt1rec2,txt2rec2,txt3rec2,txt4rec2,txt5rec2,txt6rec2,txt7rec2,txt8rec2,txt9rec2,txt10rec2;
    protected String url1rec3,url2rec3;
    protected String txt1rec3,txt2rec3;

    protected String url1rec4,url2rec4,url3rec4,url4rec4,url5rec4,url6rec4,url7rec4,url8rec4,url9rec4,url10rec4,url11rec4,url12rec4,url13rec4,url14rec4,url15rec4,url16rec4,url17rec4,url18rec4,url19rec4,url20rec4;
    protected String txt1rec4,txt2rec4,txt3rec4,txt4rec4,txt5rec4,txt6rec4,txt7rec4,txt8rec4,txt9rec4,txt10rec4,txt11rec4,txt12rec4,txt13rec4,txt14rec4,txt15rec4,txt16rec4,txt17rec4,txt18rec4,txt19rec4,txt20rec4;;



    protected  String txt21rec1,txt22rec1, txt23rec1,txt24rec1,txt25rec1;
    protected ArrayList<Integer> arrimgg;
    protected ArrayList<String> arrtxtg;




   public TV() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_tv,container,false);



        database = FirebaseDatabase.getInstance();
        refone = database.getReference().child("TV");
        recyclerViewone = (RecyclerView)view.findViewById(R.id.rectvone);
        recyclerViewtwo= (RecyclerView)view.findViewById(R.id.rectvtwo);
        recyclerViewthree = (RecyclerView)view.findViewById(R.id.rectvthree);
        recyclerViewfour= (RecyclerView)view.findViewById(R.id.rectvfour);
        recyclerViewfive = (RecyclerView)view.findViewById(R.id.rectvfive);

        arrimgg = new ArrayList<>();
        arrimgg.add(R.drawable.action);
        arrimgg.add(R.drawable.advtv);
        arrimgg.add(R.drawable.biotv);
        arrimgg.add(R.drawable.comedytv);
        arrimgg.add(R.drawable.crimetv);
        arrimgg.add(R.drawable.dramatv);
        arrimgg.add(R.drawable.familytv);
        arrimgg.add(R.drawable.horrortv);
        arrimgg.add(R.drawable.romancetv);
        arrimgg.add(R.drawable.scitv);
        arrimgg.add(R.drawable.thrillertv);
        arrimgg.add(R.drawable.wartv);
        arrtxtg = new ArrayList<>();
        arrtxtg.add("Action");
        arrtxtg.add("Adventure");
        arrtxtg.add("Biography");
        arrtxtg.add("Comedy");
        arrtxtg.add("Crime");
        arrtxtg.add("Drama");
        arrtxtg.add("Family");
        arrtxtg.add("Horror");
        arrtxtg.add("Romance");
        arrtxtg.add("Sci-Fi");
        arrtxtg.add("Thriller");
        arrtxtg.add("War");


        GridLayoutManager gm = new GridLayoutManager(getActivity(),2);
        recyclerViewfive.setLayoutManager(gm);
        recyclerViewfive.setNestedScrollingEnabled(false);
        adapterrectvfive = new Adapterrectvfive(arrimgg,arrtxtg);
        recyclerViewfive.setAdapter(adapterrectvfive);
        database = FirebaseDatabase.getInstance();

        refone.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                url1rec1 = dataSnapshot.child("rec1url1").getValue(String.class);
                url2rec1= dataSnapshot.child("rec1url2").getValue(String.class);
                url3rec1= dataSnapshot.child("rec1url3").getValue(String.class);
                url4rec1= dataSnapshot.child("rec1url4").getValue(String.class);
                url5rec1= dataSnapshot.child("rec1url5").getValue(String.class);


                arrurlrec1= new ArrayList<String>();
                arrurlrec1.add(url1rec1);
                arrurlrec1.add(url2rec1);
                arrurlrec1.add(url3rec1);
                arrurlrec1.add(url4rec1);
                arrurlrec1.add(url5rec1);


                txt11rec1 = dataSnapshot.child("rec1txt11").getValue(String.class);
                txt12rec1 = dataSnapshot.child("rec1txt12").getValue(String.class);
                txt13rec1 = dataSnapshot.child("rec1txt13").getValue(String.class);
                txt14rec1 = dataSnapshot.child("rec1txt14").getValue(String.class);
                txt15rec1 = dataSnapshot.child("rec1txt15").getValue(String.class);

                arrtxt1rec1= new ArrayList<String>();
                arrtxt1rec1.add(txt11rec1);
                arrtxt1rec1.add(txt12rec1);
                arrtxt1rec1.add(txt13rec1);
                arrtxt1rec1.add(txt14rec1);
                arrtxt1rec1.add(txt15rec1);


                txt21rec1 = dataSnapshot.child("rec1txt21").getValue(String.class);
                txt22rec1 = dataSnapshot.child("rec1txt22").getValue(String.class);
                txt23rec1 = dataSnapshot.child("rec1txt23").getValue(String.class);
                txt24rec1 = dataSnapshot.child("rec1txt24").getValue(String.class);
                txt25rec1 = dataSnapshot.child("rec1txt25").getValue(String.class);

                arrtxt2rec1= new ArrayList<String>();
                arrtxt2rec1.add( txt21rec1);
                arrtxt2rec1.add(txt22rec1);
                arrtxt2rec1.add(txt23rec1);
                arrtxt2rec1.add(txt24rec1);
                arrtxt2rec1.add(txt25rec1);

                vid1rec1=  dataSnapshot.child("vid1rec1").getValue(String.class);
                vid2rec1=  dataSnapshot.child("vid2rec1").getValue(String.class);
                vid3rec1=  dataSnapshot.child("vid3rec1").getValue(String.class);
                vid4rec1=  dataSnapshot.child("vid4rec1").getValue(String.class);
                vid5rec1=  dataSnapshot.child("vid5rec1").getValue(String.class);

                vid1= new ArrayList<String>();

                vid1.add(vid1rec1);
                vid1.add(vid2rec1);
                vid1.add(vid3rec1);
                vid1.add(vid4rec1);
                vid1.add(vid5rec1);


                vid1rec2=dataSnapshot.child("rec2vid1").getValue(String.class);
                vid2rec2=dataSnapshot.child("rec2vid2").getValue(String.class);
                vid3rec2=dataSnapshot.child("rec2vid3").getValue(String.class);
                vid4rec2=dataSnapshot.child("rec2vid4").getValue(String.class);
                vid5rec2=dataSnapshot.child("rec2vid5").getValue(String.class);
                vid6rec2=dataSnapshot.child("rec2vid6").getValue(String.class);
                vid7rec2=dataSnapshot.child("rec2vid7").getValue(String.class);
                vid8rec2=dataSnapshot.child("rec2vid8").getValue(String.class);
                vid9rec2=dataSnapshot.child("rec2vid9").getValue(String.class);
                vid10rec2=dataSnapshot.child("rec2vid10").getValue(String.class);

                vid2= new ArrayList<String>();

                vid2.add(vid1rec2);
                vid2.add(vid2rec2);
                vid2.add(vid3rec2);
                vid2.add(vid4rec2);
                vid2.add(vid5rec2);
                vid2.add(vid6rec2);
                vid2.add(vid7rec2);
                vid2.add(vid8rec2);
                vid2.add(vid9rec2);
                vid2.add(vid10rec2);


                vid1rec3=dataSnapshot.child("rec3vid1").getValue(String.class);
                vid2rec3=dataSnapshot.child("rec3vid2").getValue(String.class);

                vid3= new ArrayList<String>();

                vid3.add(vid1rec3);
                vid3.add(vid2rec3);

                vid1rec4=dataSnapshot.child("rec4vid1").getValue(String.class);
                vid2rec4=dataSnapshot.child("rec4vid2").getValue(String.class);
                vid3rec4=dataSnapshot.child("rec4vid3").getValue(String.class);
                vid4rec4=dataSnapshot.child("rec4vid4").getValue(String.class);
                vid5rec4=dataSnapshot.child("rec4vid5").getValue(String.class);
                vid6rec4=dataSnapshot.child("rec4vid6").getValue(String.class);
                vid7rec4=dataSnapshot.child("rec4vid7").getValue(String.class);
                vid8rec4=dataSnapshot.child("rec4vid8").getValue(String.class);
                vid9rec4=dataSnapshot.child("rec4vid9").getValue(String.class);
                vid10rec4=dataSnapshot.child("rec4vid10").getValue(String.class);
                vid11rec4=dataSnapshot.child("rec4vid11").getValue(String.class);
                vid12rec4=dataSnapshot.child("rec4vid12").getValue(String.class);
                vid13rec4=dataSnapshot.child("rec4vid13").getValue(String.class);
                vid14rec4=dataSnapshot.child("rec4vid14").getValue(String.class);
                vid15rec4=dataSnapshot.child("rec4vid15").getValue(String.class);
                vid16rec4=dataSnapshot.child("rec4vid16").getValue(String.class);
                vid17rec4=dataSnapshot.child("rec4vid17").getValue(String.class);
                vid18rec4=dataSnapshot.child("rec4vid18").getValue(String.class);
                vid19rec4=dataSnapshot.child("rec4vid19").getValue(String.class);
                vid20rec4=dataSnapshot.child("rec4vid20").getValue(String.class);

                vid4= new ArrayList<String>();

                vid4.add(vid1rec4);
                vid4.add(vid2rec4);
                vid4.add(vid3rec4);
                vid4.add(vid4rec4);
                vid4.add(vid5rec4);
                vid4.add(vid6rec4);
                vid4.add(vid7rec4);
                vid4.add(vid8rec4);
                vid4.add(vid9rec4);
                vid4.add(vid10rec4);
                vid4.add(vid11rec4);
                vid4.add(vid12rec4);
                vid4.add(vid13rec4);
                vid4.add(vid14rec4);
                vid4.add(vid15rec4);
                vid4.add(vid16rec4);
                vid4.add(vid17rec4);
                vid4.add(vid18rec4);
                vid4.add(vid19rec4);
                vid4.add(vid20rec4);



                url1rec2 = dataSnapshot.child("rec2url1").getValue(String.class);
                url2rec2 = dataSnapshot.child("rec2url2").getValue(String.class);
                url3rec2 = dataSnapshot.child("rec2url3").getValue(String.class);
                url4rec2 = dataSnapshot.child("rec2url4").getValue(String.class);
                url5rec2 = dataSnapshot.child("rec2url5").getValue(String.class);
                url6rec2 = dataSnapshot.child("rec2url6").getValue(String.class);
                url7rec2 = dataSnapshot.child("rec2url7").getValue(String.class);
                url8rec2 = dataSnapshot.child("rec2url8").getValue(String.class);
                url9rec2 = dataSnapshot.child("rec2url9").getValue(String.class);
                url10rec2 = dataSnapshot.child("rec2url10").getValue(String.class);

                arrurlrec2 = new ArrayList<String>();
                arrurlrec2.add(url1rec2);
                arrurlrec2.add(url2rec2);
                arrurlrec2.add(url3rec2);
                arrurlrec2.add(url4rec2);
                arrurlrec2.add(url5rec2);
                arrurlrec2.add(url6rec2);
                arrurlrec2.add(url7rec2);
                arrurlrec2.add(url8rec2);
                arrurlrec2.add(url9rec2);
                arrurlrec2.add(url10rec2);

                txt1rec2= dataSnapshot.child("rec2txt1").getValue(String.class);
                txt2rec2= dataSnapshot.child("rec2txt2").getValue(String.class);
                txt3rec2= dataSnapshot.child("rec2txt3").getValue(String.class);
                txt4rec2= dataSnapshot.child("rec2txt4").getValue(String.class);
                txt5rec2= dataSnapshot.child("rec2txt5").getValue(String.class);
                txt6rec2= dataSnapshot.child("rec2txt6").getValue(String.class);
                txt7rec2= dataSnapshot.child("rec2txt7").getValue(String.class);
                txt8rec2= dataSnapshot.child("rec2txt8").getValue(String.class);
                txt9rec2= dataSnapshot.child("rec2txt9").getValue(String.class);
                txt10rec2= dataSnapshot.child("rec2txt10").getValue(String.class);

                arrtxtrec2 = new ArrayList<String>();
                arrtxtrec2.add(txt1rec2);
                arrtxtrec2.add(txt2rec2);
                arrtxtrec2.add(txt3rec2);
                arrtxtrec2.add(txt4rec2);
                arrtxtrec2.add(txt5rec2);
                arrtxtrec2.add(txt6rec2);
                arrtxtrec2.add(txt7rec2);
                arrtxtrec2.add(txt8rec2);
                arrtxtrec2.add(txt9rec2);
                arrtxtrec2.add(txt10rec2);

                url1rec3 = dataSnapshot.child("rec3url1").getValue(String.class);
                url2rec3 = dataSnapshot.child("rec3url2").getValue(String.class);

                arrurlrec3 = new ArrayList<String>();
                arrurlrec3.add(url1rec3);
                arrurlrec3.add(url2rec3);

                txt1rec3= dataSnapshot.child("rec3txt11").getValue(String.class);
                txt2rec3= dataSnapshot.child("rec3txt12").getValue(String.class);

                arrtxtrec3 = new ArrayList<String>();
                arrtxtrec3.add(txt1rec3);
                arrtxtrec3.add(txt2rec3);

                url1rec4 = dataSnapshot.child("rec4url1").getValue(String.class);
                url2rec4 = dataSnapshot.child("rec4url2").getValue(String.class);
                url3rec4 = dataSnapshot.child("rec4url3").getValue(String.class);
                url4rec4 = dataSnapshot.child("rec4url4").getValue(String.class);
                url5rec4 = dataSnapshot.child("rec4url5").getValue(String.class);
                url6rec4 = dataSnapshot.child("rec4url6").getValue(String.class);
                url7rec4 = dataSnapshot.child("rec4url7").getValue(String.class);
                url8rec4 = dataSnapshot.child("rec4url8").getValue(String.class);
                url9rec4 = dataSnapshot.child("rec4url9").getValue(String.class);
                url10rec4 = dataSnapshot.child("rec4url10").getValue(String.class);
                url11rec4 = dataSnapshot.child("rec4url11").getValue(String.class);
                url12rec4 = dataSnapshot.child("rec4url12").getValue(String.class);
                url13rec4 = dataSnapshot.child("rec4url13").getValue(String.class);
                url14rec4 = dataSnapshot.child("rec4url14").getValue(String.class);
                url15rec4 = dataSnapshot.child("rec4url15").getValue(String.class);
                url16rec4 = dataSnapshot.child("rec4url16").getValue(String.class);
                url17rec4 = dataSnapshot.child("rec4url17").getValue(String.class);
                url18rec4 = dataSnapshot.child("rec4url18").getValue(String.class);
                url19rec4 = dataSnapshot.child("rec4url19").getValue(String.class);
                url20rec4 = dataSnapshot.child("rec4url20").getValue(String.class);

                arrurlrec4 = new ArrayList<String>();
                arrurlrec4.add(url1rec4);
                arrurlrec4.add(url2rec4);
                arrurlrec4.add(url3rec4);
                arrurlrec4.add(url4rec4);
                arrurlrec4.add(url5rec4);
                arrurlrec4.add(url6rec4);
                arrurlrec4.add(url7rec4);
                arrurlrec4.add(url8rec4);
                arrurlrec4.add(url9rec4);
                arrurlrec4.add(url10rec4);
                arrurlrec4.add(url11rec4);
                arrurlrec4.add(url12rec4);
                arrurlrec4.add(url13rec4);
                arrurlrec4.add(url14rec4);
                arrurlrec4.add(url15rec4);
                arrurlrec4.add(url16rec4);
                arrurlrec4.add(url17rec4);
                arrurlrec4.add(url18rec4);
                arrurlrec4.add(url19rec4);
                arrurlrec4.add(url20rec4);


                txt1rec4 = dataSnapshot.child("rec4txt1").getValue(String.class);
                txt2rec4 = dataSnapshot.child("rec4txt2").getValue(String.class);
                txt3rec4 = dataSnapshot.child("rec4txt3").getValue(String.class);
                txt4rec4 = dataSnapshot.child("rec4txt4").getValue(String.class);
                txt5rec4 = dataSnapshot.child("rec4txt5").getValue(String.class);
                txt6rec4 = dataSnapshot.child("rec4txt6").getValue(String.class);
                txt7rec4 = dataSnapshot.child("rec4txt7").getValue(String.class);
                txt8rec4 = dataSnapshot.child("rec4txt8").getValue(String.class);
                txt9rec4 = dataSnapshot.child("rec4txt9").getValue(String.class);
                txt10rec4 = dataSnapshot.child("rec4txt10").getValue(String.class);
                txt11rec4 = dataSnapshot.child("rec4txt11").getValue(String.class);
                txt12rec4 = dataSnapshot.child("rec4txt12").getValue(String.class);
                txt13rec4 = dataSnapshot.child("rec4txt13").getValue(String.class);
                txt14rec4 = dataSnapshot.child("rec4txt14").getValue(String.class);
                txt15rec4 = dataSnapshot.child("rec4txt15").getValue(String.class);
                txt16rec4 = dataSnapshot.child("rec4txt16").getValue(String.class);
                txt17rec4 = dataSnapshot.child("rec4txt17").getValue(String.class);
                txt18rec4 = dataSnapshot.child("rec4txt18").getValue(String.class);
                txt19rec4 = dataSnapshot.child("rec4txt19").getValue(String.class);
                txt20rec4 = dataSnapshot.child("rec4txt20").getValue(String.class);

                arrtxtrec4 = new ArrayList<String>();
                arrtxtrec4.add(txt1rec4);
                arrtxtrec4.add(txt2rec4);
                arrtxtrec4.add(txt3rec4);
                arrtxtrec4.add(txt4rec4);
                arrtxtrec4.add(txt5rec4);
                arrtxtrec4.add(txt6rec4);
                arrtxtrec4.add(txt7rec4);
                arrtxtrec4.add(txt8rec4);
                arrtxtrec4.add(txt9rec4);
                arrtxtrec4.add(txt10rec4);
                arrtxtrec4.add(txt11rec4);
                arrtxtrec4.add(txt12rec4);
                arrtxtrec4.add(txt13rec4);
                arrtxtrec4.add(txt14rec4);
                arrtxtrec4.add(txt15rec4);
                arrtxtrec4.add(txt16rec4);
                arrtxtrec4.add(txt17rec4);
                arrtxtrec4.add(txt18rec4);
                arrtxtrec4.add(txt19rec4);
                arrtxtrec4.add(txt20rec4);


                LinearLayoutManager bm = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);

                recyclerViewone.setLayoutManager(bm);
                adapterrectvone = new Adapterrectvone(arrurlrec1,arrtxt1rec1,arrtxt2rec1,vid1);
                recyclerViewone.setAdapter(adapterrectvone);

                LinearLayoutManager cm = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
                recyclerViewtwo.setLayoutManager(cm);
                adapterrectvtwo = new Adapterrectvtwo(arrurlrec2,arrtxtrec2,vid2);
                recyclerViewtwo.setAdapter(adapterrectvtwo);

                LinearLayoutManager dm = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
                recyclerViewthree.setLayoutManager(dm);
                adapterrectvthree = new Adapterrectvthree(arrurlrec3,arrtxtrec3,vid3);
                recyclerViewthree.setAdapter(adapterrectvthree);

                LinearLayoutManager em = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
                recyclerViewfour.setLayoutManager(em);
                adapterrectvfour = new Adapterrectvfour(arrurlrec4,arrtxtrec4,vid4);
                recyclerViewfour.setAdapter(adapterrectvfour);





            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        return view;

    }



}

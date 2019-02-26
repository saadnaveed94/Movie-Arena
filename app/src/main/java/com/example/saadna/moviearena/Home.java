package com.example.saadna.moviearena;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
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
public class Home extends Fragment {
    protected RecyclerView recyclerViewone ,recyclerViewtwo,recyclerViewnewsone,recyclerViewthree;
    protected Adapterrechomeone adapterrechomeone;
    protected Adapterrechometwo adapterrechometwo;
    protected Adapterrechomethree adapterrechomethree;
    protected Adapterrechomeonenewsone adapterrechomeonenewsone;

    protected TextView textViewone,textViewtwo;
    protected TextView textViewrelaoneone, textViewrelaonetwo;
public FirebaseDatabase database;
  public DatabaseReference refone;
    private Context context;
public Home(Context context){
    this.context=context;

}
protected ArrayList <String> arrurlrec1,arrtxt1rec1,arrtxt2rec1,arrimgnewsone,vid1,vid2,vid3;
    protected ArrayList <String> arrurlrec2,arrtxtrec2,arrtxtnewsone,arrtxtnewsthree;
    protected ArrayList<String> arrurlrec3,arrtxtrec3;

 protected    String url1rec1,url2rec1,url3rec1,url4rec1,url5rec1;
    protected    String txt11rec1,txt12rec1,txt13rec1,txt14rec1,txt15rec1;
    protected    String vid1rec1,vid2rec1,vid3rec1,vid4rec1,vid5rec1;
    protected    String vid1rec2,vid2rec2,vid3rec2,vid4rec2,vid5rec2,vid6rec2,vid7rec2,vid8rec2,vid9rec2,vid10rec2;
    protected    String vid1rec3,vid2rec3,vid3rec3,vid4rec3,vid5rec3,vid6rec3,vid7rec3,vid8rec3,vid9rec3,vid10rec3;


    protected    String url1rec2,url2rec2,url3rec2,url4rec2,url5rec2,url6rec2,url7rec2,url8rec2,url9rec2,url10rec2;
    protected    String txt1rec2,txt2rec2,txt3rec2,txt4rec2,txt5rec2,txt6rec2,txt7rec2,txt8rec2,txt9rec2,txt10rec2;
protected String url1rec3,url2rec3,url3rec3,url4rec3,url5rec3,url6rec3,url7rec3,url8rec3,url9rec3,url10rec3;
    protected String txt1rec3,txt2rec3,txt3rec3,txt4rec3,txt5rec3,txt6rec3,txt7rec3,txt8rec3,txt9rec3,txt10rec3;


    protected  String txt21rec1,txt22rec1, txt23rec1,txt24rec1,txt25rec1;
protected  String textrelaoneone,textrelaonetwo,urlrelaone,urlralatwo;
public ImageButton imgrelaoneone, imgrelaonetwo;
    public Home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_home,container,false);



         database = FirebaseDatabase.getInstance();
         refone = database.getReference().child("Home");
recyclerViewone = (RecyclerView)view.findViewById(R.id.rectvone);
        recyclerViewtwo= (RecyclerView)view.findViewById(R.id.rectvtwo);

recyclerViewnewsone = (RecyclerView)view.findViewById(R.id.rechomenewsone);
recyclerViewthree = (RecyclerView)view.findViewById(R.id.rechomethree);

        refone.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                url1rec1 = dataSnapshot.child("rec1url1").getValue(String.class);
                url2rec1= dataSnapshot.child("rec1url2").getValue(String.class);
                url3rec1= dataSnapshot.child("rec1url3").getValue(String.class);
                url4rec1= dataSnapshot.child("rec1ur4").getValue(String.class);
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

                vid1rec1=  dataSnapshot.child("extra1").getValue(String.class);
                vid2rec1=  dataSnapshot.child("extra2").getValue(String.class);
                vid3rec1=  dataSnapshot.child("extra3").getValue(String.class);
                vid4rec1=  dataSnapshot.child("extra4").getValue(String.class);
                vid5rec1=  dataSnapshot.child("extra5").getValue(String.class);

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
                vid3rec3=dataSnapshot.child("rec3vid3").getValue(String.class);
                vid4rec3=dataSnapshot.child("rec3vid4").getValue(String.class);
                vid5rec3=dataSnapshot.child("rec3vid5").getValue(String.class);
                vid6rec3=dataSnapshot.child("rec3vid6").getValue(String.class);
                vid7rec3=dataSnapshot.child("rec3vid7").getValue(String.class);
                vid8rec3=dataSnapshot.child("rec3vid8").getValue(String.class);
                vid9rec3=dataSnapshot.child("rec3vid9").getValue(String.class);
                vid10rec3=dataSnapshot.child("rec3vid10").getValue(String.class);

                vid3= new ArrayList<String>();

                vid3.add(vid1rec3);
                vid3.add(vid2rec3);
                vid3.add(vid3rec3);
                vid3.add(vid4rec3);
                vid3.add(vid5rec3);
                vid3.add(vid6rec3);
                vid3.add(vid7rec3);
                vid3.add(vid8rec3);
                vid3.add(vid9rec3);
                vid3.add(vid10rec3);



                textrelaoneone = dataSnapshot.child("rela1txt1").getValue(String.class);



                arrtxtnewsone= new ArrayList<String>();
                arrtxtnewsone.add(textrelaoneone);



                urlrelaone = dataSnapshot.child("rela1url1").getValue(String.class);

                arrimgnewsone = new ArrayList<String>();
                arrimgnewsone.add(urlrelaone);

                textrelaonetwo = dataSnapshot.child("rela1txt2").getValue(String.class);
                arrtxtnewsthree = new ArrayList<String>();
                arrtxtnewsthree.add(textrelaonetwo);


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

                url1rec3 = dataSnapshot.child("movieurl1").getValue(String.class);
                url2rec3 = dataSnapshot.child("movieurl2").getValue(String.class);
                url3rec3 = dataSnapshot.child("movieurl3").getValue(String.class);
                url4rec3 = dataSnapshot.child("movieurl4").getValue(String.class);
                url5rec3 = dataSnapshot.child("movieurl5").getValue(String.class);
                url6rec3 = dataSnapshot.child("movieurl6").getValue(String.class);
                url7rec3 = dataSnapshot.child("movieurl7").getValue(String.class);
                url8rec3 = dataSnapshot.child("movieurl8").getValue(String.class);
                url9rec3 = dataSnapshot.child("movieurl9").getValue(String.class);
                url10rec3 = dataSnapshot.child("movieurl10").getValue(String.class);

                arrurlrec3 = new ArrayList<String>();
                arrurlrec3.add(url1rec3);
                arrurlrec3.add(url2rec3);
                arrurlrec3.add(url3rec3);
                arrurlrec3.add(url4rec3);
                arrurlrec3.add(url5rec3);
                arrurlrec3.add(url6rec3);
                arrurlrec3.add(url7rec3);
                arrurlrec3.add(url8rec3);
                arrurlrec3.add(url9rec3);
                arrurlrec3.add(url10rec3);

                txt1rec3= dataSnapshot.child("movieurl11").getValue(String.class);
                txt2rec3= dataSnapshot.child("movieurl12").getValue(String.class);
                txt3rec3= dataSnapshot.child("movieurl13").getValue(String.class);
                txt4rec3= dataSnapshot.child("movieurl14").getValue(String.class);
                txt5rec3= dataSnapshot.child("movieurl15").getValue(String.class);
                txt6rec3= dataSnapshot.child("movieurl16").getValue(String.class);
                txt7rec3= dataSnapshot.child("movieurl17").getValue(String.class);
                txt8rec3= dataSnapshot.child("movieurl18").getValue(String.class);
                txt9rec3= dataSnapshot.child("movieurl19").getValue(String.class);
                txt10rec3= dataSnapshot.child("movieurl20").getValue(String.class);

                arrtxtrec3 = new ArrayList<String>();
                arrtxtrec3.add(txt1rec3);
                arrtxtrec3.add(txt2rec3);
                arrtxtrec3.add(txt3rec3);
                arrtxtrec3.add(txt4rec3);
                arrtxtrec3.add(txt5rec3);
                arrtxtrec3.add(txt6rec3);
                arrtxtrec3.add(txt7rec3);
                arrtxtrec3.add(txt8rec3);
                arrtxtrec3.add(txt9rec3);
                arrtxtrec3.add(txt10rec3);




                LinearLayoutManager bm = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);

                recyclerViewone.setLayoutManager(bm);
                adapterrechomeone = new Adapterrechomeone(arrurlrec1,arrtxt1rec1,arrtxt2rec1,vid1);
                recyclerViewone.setAdapter(adapterrechomeone);

                LinearLayoutManager cm = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
                recyclerViewtwo.setLayoutManager(cm);
                adapterrechometwo = new Adapterrechometwo(arrurlrec2,arrtxtrec2,vid2);
                recyclerViewtwo.setAdapter(adapterrechometwo);

                LinearLayoutManager dm = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
                recyclerViewnewsone.setLayoutManager(dm);
                adapterrechomeonenewsone = new Adapterrechomeonenewsone(arrimgnewsone,arrtxtnewsone,arrtxtnewsthree);
                recyclerViewnewsone.setAdapter(adapterrechomeonenewsone);


                LinearLayoutManager em = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
                recyclerViewthree.setLayoutManager(em);
                adapterrechomethree = new Adapterrechomethree(arrurlrec3,arrtxtrec3,vid3);
                recyclerViewthree.setAdapter(adapterrechomethree);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

       return view;

    }



}

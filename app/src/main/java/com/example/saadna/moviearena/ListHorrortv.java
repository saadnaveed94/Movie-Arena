package com.example.saadna.moviearena;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class ListHorrortv extends AppCompatActivity {
protected ArrayList<String> arrurl,arrtxt1,arrtxt2;

    protected String url1,url2,url3,url4,url5,url6,url7,url8,url9,url10,url11,url12,url13,url14,url15;
    protected String txt1o,txt2o,txt3o,txt4o,txt5o,txt6o,txt7o,txt8o,txt9o,txt10o,txt11o,txt12o,txt13o,txt14o,txt15o;
    protected String txt1t,txt2t,txt3t,txt4t,txt5t,txt6t,txt7t,txt8t,txt9t,txt10t,txt11t,txt12t,txt13t,txt14t,txt15t;

    public FirebaseDatabase database ;
    public DatabaseReference refone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_horrortv);


        database = FirebaseDatabase.getInstance();
        refone = database.getReference().child("listhorrortv");

        refone.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                url1 = dataSnapshot.child("rec1url1").getValue(String.class);
                url2= dataSnapshot.child("rec1url2").getValue(String.class);
                url3= dataSnapshot.child("rec1url3").getValue(String.class);
                url4= dataSnapshot.child("rec1url4").getValue(String.class);
                url5= dataSnapshot.child("rec1url5").getValue(String.class);
                url6= dataSnapshot.child("rec1url6").getValue(String.class);
                url7= dataSnapshot.child("rec1url7").getValue(String.class);
                url8= dataSnapshot.child("rec1url8").getValue(String.class);
                url9= dataSnapshot.child("rec1url9").getValue(String.class);
                url10= dataSnapshot.child("rec1url10").getValue(String.class);
                url11= dataSnapshot.child("rec1url11").getValue(String.class);
                url12= dataSnapshot.child("rec1url12").getValue(String.class);
                url13= dataSnapshot.child("rec1url13").getValue(String.class);
                url14= dataSnapshot.child("rec1url14").getValue(String.class);
                url15= dataSnapshot.child("rec1url15").getValue(String.class);



                arrurl= new ArrayList<String>();
                arrurl.add(url1);
                arrurl.add(url2);
                arrurl.add(url3);
                arrurl.add(url4);
                arrurl.add(url5);
                arrurl.add(url6);
                arrurl.add(url7);
                arrurl.add(url8);
                arrurl.add(url9);
                arrurl.add(url10);
                arrurl.add(url11);
                arrurl.add(url12);
                arrurl.add(url13);
                arrurl.add(url14);
                arrurl.add(url15);






                txt1o = dataSnapshot.child("rec1txto1").getValue(String.class);
                txt2o = dataSnapshot.child("rec1txto2").getValue(String.class);
                txt3o = dataSnapshot.child("rec1txto3").getValue(String.class);
                txt4o = dataSnapshot.child("rec1txto4").getValue(String.class);
                txt5o = dataSnapshot.child("rec1txto5").getValue(String.class);
                txt6o = dataSnapshot.child("rec1txto6").getValue(String.class);
                txt7o = dataSnapshot.child("rec1txto7").getValue(String.class);
                txt8o = dataSnapshot.child("rec1txto8").getValue(String.class);
                txt9o = dataSnapshot.child("rec1txto9").getValue(String.class);
                txt10o = dataSnapshot.child("rec1txto10").getValue(String.class);

                txt11o = dataSnapshot.child("rec1txto11").getValue(String.class);
                txt12o = dataSnapshot.child("rec1txto12").getValue(String.class);
                txt13o = dataSnapshot.child("rec1txto13").getValue(String.class);
                txt14o = dataSnapshot.child("rec1txto14").getValue(String.class);
                txt15o = dataSnapshot.child("rec1txto15").getValue(String.class);

                arrtxt1= new ArrayList<String>();

                arrtxt1.add(txt1o);
                arrtxt1.add(txt2o);
                arrtxt1.add(txt3o);
                arrtxt1.add(txt4o);
                arrtxt1.add(txt5o);
                arrtxt1.add(txt6o);
                arrtxt1.add(txt7o);
                arrtxt1.add(txt8o);
                arrtxt1.add(txt9o);
                arrtxt1.add(txt10o);

                arrtxt1.add(txt11o);
                arrtxt1.add(txt12o);
                arrtxt1.add(txt13o);
                arrtxt1.add(txt14o);
                arrtxt1.add(txt15o);


                txt1t = dataSnapshot.child("rec1txtt1").getValue(String.class);
                txt2t = dataSnapshot.child("rec1txtt2").getValue(String.class);
                txt3t = dataSnapshot.child("rec1txtt3").getValue(String.class);
                txt4t = dataSnapshot.child("rec1txtt4").getValue(String.class);
                txt5t = dataSnapshot.child("rec1txtt5").getValue(String.class);

                txt6t = dataSnapshot.child("rec1txtt6").getValue(String.class);

                txt7t = dataSnapshot.child("rec1txtt7").getValue(String.class);
                txt8t = dataSnapshot.child("rec1txtt8").getValue(String.class);
                txt9t = dataSnapshot.child("rec1txtt9").getValue(String.class);
                txt10t = dataSnapshot.child("rec1txtt10").getValue(String.class);
                txt11t = dataSnapshot.child("rec1txtt11").getValue(String.class);
                txt12t = dataSnapshot.child("rec1txtt12").getValue(String.class);
                txt13t = dataSnapshot.child("rec1txtt13").getValue(String.class);
                txt14t = dataSnapshot.child("rec1txtt14").getValue(String.class);
                txt15t = dataSnapshot.child("rec1txtt15").getValue(String.class);



                arrtxt2= new ArrayList<String>();
                arrtxt2.add( txt1t);
                arrtxt2.add(txt2t);
                arrtxt2.add(txt3t);
                arrtxt2.add(txt4t);
                arrtxt2.add(txt5t);
                arrtxt2.add(txt6t);
                arrtxt2.add(txt7t);
                arrtxt2.add(txt8t);
                arrtxt2.add(txt9t);
                arrtxt2.add(txt10t);
                arrtxt2.add(txt11t);
                arrtxt2.add(txt12t);
                arrtxt2.add(txt13t);
                arrtxt2.add(txt14t);
                arrtxt2.add(txt15t);




                RecyclerView recyclerView;
                Adapterreclistaction adapterreclistaction;
                LinearLayoutManager a = new LinearLayoutManager(ListHorrortv.this,LinearLayoutManager.VERTICAL,false);
                recyclerView = (RecyclerView)findViewById(R.id.listhorrortv);
                recyclerView.setLayoutManager(a);
                adapterreclistaction = new Adapterreclistaction(arrurl,arrtxt1,arrtxt2);
                recyclerView.setAdapter(adapterreclistaction);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }


        });


    }
}

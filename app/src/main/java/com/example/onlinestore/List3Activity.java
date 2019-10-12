package com.example.onlinestore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class List3Activity extends AppCompatActivity {
    ListView list_view;
    ArrayList<DataModel> arrayList = new ArrayList<>();
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        list_view=findViewById(R.id.list_view);


        arrayList.add(new DataModel("38024PP25 Minimalists Analog Watch - For Men & Women\n" +
                "₹850\n",R.mipmap.wat1)); //0

        arrayList.add(new DataModel("SKMEI Sports Multifunctional Dual Time Digital Blue Dial Men's Watch 1155blueA1 Analog-Digital Watch - For Men\n" +
                "₹425",R.mipmap.wat2)); //1

        arrayList.add(new DataModel("Digital Multi-functional Full Screen Black Sports Digital Watch - For Men\n" +
                "₹519",R.mipmap.wat3)); //2

        arrayList.add(new DataModel("DK11421-7 Analog Watch - For men\n" +
                "₹1,282",R.mipmap.wat4)); //3

        arrayList.add(new DataModel("Abx1017-Gents Green Solitary Affrican Army Pattern Chronograph Digital Watch Analog-Digital Watch - For Men#JustHere\n" +
                "₹407",R.mipmap.wat5)); //4

        arrayList.add(new DataModel("LS2727 Avatar Day and Date Functioning Crocodile Strap Analog Analog Watch - For Men\n" +
                "₹512",R.mipmap.wat6));

        arrayList.add(new DataModel("LCS-8404 ORIGINAL GOLD PLATED DAY & DATE FUNCTIONING Analog Watch - For Men\n" +
                "₹599",R.mipmap.wat7));

        arrayList.add(new DataModel("New Stylish Blue Modish Watch Collection for Mens Club Analog Watch - For Boys\n" +
                "₹635",R.mipmap.wat8));

        arrayList.add(new DataModel("Multi-functional Full Screen Sports Digital Watch - For Men\n" +
                "₹4,574",R.mipmap.wat9));


        adapter=new CustomAdapter(List3Activity.this,arrayList);

        list_view.setAdapter(adapter);


        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent = new Intent(List3Activity.this,ShowListItemActivity.class);


                intent.putExtra("name",arrayList.get(position).getName());
                intent.putExtra("img",arrayList.get(position).getImg());
                startActivity(intent);


            }
        });




    }
}


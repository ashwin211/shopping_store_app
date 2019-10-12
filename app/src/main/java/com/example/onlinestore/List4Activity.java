package com.example.onlinestore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class List4Activity extends AppCompatActivity {

    ListView list_view;
    ArrayList<DataModel> arrayList = new ArrayList<>();
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        list_view=findViewById(R.id.list_view);


        arrayList.add(new DataModel("SanDisk SDSQBNN-032G-G031N 32 GB Pen Drive  (Multicolor)\n" +
                "₹325",R.mipmap.pendrive1)); //0

        arrayList.add(new DataModel("HP MM-OTG032GB-02P 32 GB Pen Drive  (Silver)\n" +
                "₹629",R.mipmap.pendrive2)); //1

        arrayList.add(new DataModel("SanDisk Ultra USB3.0 64 GB Pen Drive \n" +
                "₹449",R.mipmap.pendrive3)); //2

        arrayList.add(new DataModel("Toshiba Yamabiko 64 GB Pen Drive  (Black)\n" +
                "₹999",R.mipmap.pendrive4)); //3

        arrayList.add(new DataModel("SanDisk Ultra Dual SDDD3-016G-I35 16 GB OTG Drive  (Black, Type A to Micro USB)\n" +
                "₹429",R.mipmap.pendrive5)); //4

        arrayList.add(new DataModel("HP 215 64 GB Pen Drive  (Blue)\n" +
                "₹515",R.mipmap.pendrive6));

        arrayList.add(new DataModel("Sony Micro Vault USM8M1/B 16 GB Pen Drive  (Black)\n" +
                "₹475",R.mipmap.pendrive7));

        arrayList.add(new DataModel("Toshiba THN-U202L0160A4 32 GB Pen Drive  (Blue)\n" +
                "₹365",R.mipmap.pendrive8));

        arrayList.add(new DataModel("HP V152W 32 GB Pen Drive  (Blue)\n" +
                "₹399",R.mipmap.pendrive9));


        adapter=new CustomAdapter(List4Activity.this,arrayList);

        list_view.setAdapter(adapter);


        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent = new Intent(List4Activity.this,ShowListItemActivity.class);


                intent.putExtra("name",arrayList.get(position).getName());
                intent.putExtra("img",arrayList.get(position).getImg());
                startActivity(intent);


            }
        });




    }
}


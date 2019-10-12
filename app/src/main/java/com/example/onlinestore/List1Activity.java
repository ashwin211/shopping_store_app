package com.example.onlinestore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class List1Activity extends AppCompatActivity {

    ListView list_view;
    ArrayList<DataModel> arrayList = new ArrayList<>();
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        list_view=findViewById(R.id.list_view);


        arrayList.add(new DataModel("HP 14q Core i5 8th Gen - (4 GB/1 TB HDD/Windows 10 Home) 14q-cs0007TU Laptop)\n" +

                "₹44,990",R.mipmap.lap1)); //0

        arrayList.add(new DataModel("HP 15q Core i5 8th Gen - (8 GB/1 TB HDD/Windows 10 Home/2 GB Graphics) \n" +

                "₹50,990)",R.mipmap.lap2)); //1

        arrayList.add(new DataModel("SASMSUNG 15 APU Dual Core A4 - (4 GB/1 TB HDD/Windows 10 Home) )\n" +
                "₹20,990)",R.mipmap.lap3)); //2

        arrayList.add(new DataModel("Lenovo Ideapad 330 Core i5 8th Gen - (8 GB/1 TB HDD/Windows 10 Home/2 GB Graphics) \n" +
                "₹46,990)",R.mipmap.lap4)); //3

        arrayList.add(new DataModel("Acer Aspire 3 Core i3 8th Gen - (4 GB/1 TB HDD/Windows 10 Home) )\n" +
                "₹27,990",R.mipmap.lap5)); //4

        arrayList.add(new DataModel("Dell Inspiron 14 3000 Series Core i3 7th Gen - (4 GB/1 TB HDD/Windows 10 Home)\n" +
                "₹29,990",R.mipmap.lap6));

        arrayList.add(new DataModel("Dell Vostro 14 3000 Core i5 8th Gen - (8 GB/1 TB HDD/Windows)\n" +
                "₹38,990",R.mipmap.lap7));

        arrayList.add(new DataModel("Acer Nitro 5 Core i7 9th Gen - (8 GB/1 TB HDD/256 GB SSD/Windows 10 Home/4 GB Graphics)\n" +
                "₹84,990",R.mipmap.lap8));

        arrayList.add(new DataModel("Acer Swift 7 Core i5 7th Gen - (8 GB/256 GB SSD/Windows 10 Home)\n" +
                "₹51,490",R.mipmap.lap9));


        adapter=new CustomAdapter(List1Activity.this,arrayList);

        list_view.setAdapter(adapter);


        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent = new Intent(List1Activity.this,ShowListItemActivity.class);


                intent.putExtra("name",arrayList.get(position).getName());
                intent.putExtra("img",arrayList.get(position).getImg());
                startActivity(intent);


            }
        });




    }
}


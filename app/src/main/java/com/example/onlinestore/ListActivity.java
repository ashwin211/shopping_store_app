package com.example.onlinestore;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    ListView list_view;
    ArrayList<DataModel> arrayList = new ArrayList<>();
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        list_view=findViewById(R.id.list_view);

        arrayList.add(new DataModel("One Plus 5 (Black, 128 GB)  (8 GB RAM)\n" +
                "₹31,999",R.mipmap.mob9));


        arrayList.add(new DataModel("Honor 8C (Blue, 32 GB)  (4 GB RAM)\n" +
                "₹7,999\n",R.mipmap.mob1)); //0

        arrayList.add(new DataModel("Samsung Galaxy J7 Prime (Gold, 32 GB)  (3 GB RAM)\n" +
                "₹15,300)",R.mipmap.mob2)); //1

        arrayList.add(new DataModel("Micromax Bharat 5 Plus (Jet Black, 16 GB)  (2 GB RAM)\n" +
                "₹5,699)",R.mipmap.mob3)); //2

        arrayList.add(new DataModel("Realme 3 Pro (Dynamic Black, 64 GB)  (6 GB RAM)\n" +
                "₹16,999)",R.mipmap.mob4)); //3

        arrayList.add(new DataModel("Lava Z62 (Midnight Blue, 16 GB)  (2 GB RAM)\n" +
                "₹6,060",R.mipmap.mob5)); //4

        arrayList.add(new DataModel("Redmi Note 5 (Gold, 64 GB)  (4 GB RAM)\n" +
                "₹9,765",R.mipmap.mob6));

        arrayList.add(new DataModel("Sony Xperia XA1 Ultra Dual (Black, 64 GB)  (4 GB RAM)\n" +
                "₹31,990",R.mipmap.mob7));

        arrayList.add(new DataModel("Redmi Note 7 Pro (Neptune Blue, 64 GB)  (4 GB RAM)\n" +
                "₹13,999",R.mipmap.mob8));


        adapter=new CustomAdapter(ListActivity.this,arrayList);

        list_view.setAdapter(adapter);


        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent = new Intent(ListActivity.this,ShowListItemActivity.class);


                intent.putExtra("name",arrayList.get(position).getName());
                intent.putExtra("img",arrayList.get(position).getImg());
                startActivity(intent);


            }
        });




    }
}

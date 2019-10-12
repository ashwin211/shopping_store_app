package com.example.onlinestore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class List2Activity extends AppCompatActivity {
    ListView list_view;
    ArrayList<DataModel> arrayList = new ArrayList<>();
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        list_view=findViewById(R.id.list_view);


        arrayList.add(new DataModel("JBL T450BT Extra Bass Bluetooth Headset with Mic \n" +
                "₹2,499",R.mipmap.ha1)); //0

        arrayList.add(new DataModel("Motorola HP-BT-Moto-Escape 200 with Google Assistant Bluetooth Headset with Mic \n" +
                "₹1,699",R.mipmap.ha2)); //1

        arrayList.add(new DataModel("Sony WH-CH500 Google Assistant enabled Bluetooth Headset with Mic  \n" +
                "₹3,899",R.mipmap.ha3)); //2

        arrayList.add(new DataModel("Sony C400 Bluetooth Headset with Mic  (Black), In the Ear)\n" +
                "₹3,399",R.mipmap.ha4_sony)); //3

        arrayList.add(new DataModel("Samsung EHS64 Hands-Free with inline Remote Wired Headset with Mic  (Black, In the Ear)\n" +
                "₹439",R.mipmap.ha5_sam)); //4

        arrayList.add(new DataModel("JBL T500 Wired Headset with Mic  (Blue, Over the Ear)\n" +
                "₹1,879",R.mipmap.ha6));

        arrayList.add(new DataModel("JBL C150SI Wired Headset with Mic  (Black, In the Ear)\n" +
                "₹799",R.mipmap.ha7));

        arrayList.add(new DataModel("Sony 310AP Wired Headset with Mic  (Red, Over the Ear)\n" +
                "₹999",R.mipmap.ha8));

        arrayList.add(new DataModel("Sony XB450AP Wired Headset with Mic  (Blue, Over the Ear)\n" +
                "₹1,924",R.mipmap.ha9));


        adapter=new CustomAdapter(List2Activity.this,arrayList);

        list_view.setAdapter(adapter);


        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent = new Intent(List2Activity.this,ShowListItemActivity.class);


                intent.putExtra("name",arrayList.get(position).getName());
                intent.putExtra("img",arrayList.get(position).getImg());
                startActivity(intent);


            }
        });




    }
}

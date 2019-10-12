package com.example.onlinestore;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ShowListItemActivity extends AppCompatActivity {
    TextView txt1_name;
    ImageView img1;
    ImageView img_buy;

    int id = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_list_item);


        img_buy = findViewById(R.id.img_buy);
        txt1_name = findViewById(R.id.txt1_name);
        img1 = findViewById(R.id.img1);
        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            txt1_name.setText(bundle.getString("name"));
            img1.setImageResource(bundle.getInt("img"));


        }
        img_buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShowListItemActivity.this, ProcessActivity.class);
                startActivity(intent);

            }
        });
    }
}
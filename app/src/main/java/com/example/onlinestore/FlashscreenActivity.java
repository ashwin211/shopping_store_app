package com.example.onlinestore;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class FlashscreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashscreen);

        ImageView imageView=findViewById(R.id.image_view);
        Animation animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        imageView.startAnimation(animation);

        Thread timer=new Thread() {

            @Override
            public void run() {
                try{
                    sleep(3000);
                    Intent intent=new Intent(FlashscreenActivity.this,LoginActivity.class);
                    startActivity(intent);
                    finish();
                    super.run();
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }

                }


        };
        timer.start();


    }


}

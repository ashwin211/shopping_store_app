package com.example.onlinestore;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    ImageView img_lap;
    ImageView img_mob;
    ImageView img_ha;
    ImageView img_watch;
    ImageView img_pen;



    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MainActivity)getActivity()).setActionBarTitle("eSTORE");
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);

        img_mob=view.findViewById(R.id.img_mob);
        img_lap=view.findViewById(R.id.img_lap);
       img_watch=view.findViewById(R.id.img_watch);
        img_pen=view.findViewById(R.id.img_pen);
       img_ha=view.findViewById(R.id.img_ha);

        img_mob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),ListActivity.class);
                startActivity(intent);



            }
        });
       img_pen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),List4Activity.class);
                startActivity(intent);

            }
        });
     img_watch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),List3Activity.class);
                startActivity(intent);

            }
        });
     img_lap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),List1Activity.class);
                startActivity(intent);

            }
        });
        img_ha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),List2Activity.class);
                startActivity(intent);

            }
        });

        return view;


    }

}

package com.example.onlinestore;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class InboxFragment extends Fragment {

    TextView txt_mobile;
    TextView txt_pendrive;
    TextView txt_watches;
    TextView txt_laptop;
    TextView txt_headphone;

    public InboxFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MainActivity)getActivity()).setActionBarTitle("Category");

        View view= inflater.inflate(R.layout.fragment_inbox, container, false);

        txt_mobile=view.findViewById(R.id.txt_mobile);
        txt_pendrive=view.findViewById(R.id.txt_pendrive);
        txt_watches=view.findViewById(R.id.txt_watches);
        txt_laptop=view.findViewById(R.id.txt_laptop);
        txt_headphone=view.findViewById(R.id.txt_headphone);

        txt_mobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),ListActivity.class);
                startActivity(intent);



            }
        });
                                        txt_pendrive.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent intent=new Intent(getActivity(),List4Activity.class);
                                                startActivity(intent);

                                    }
                                });
                                        txt_watches.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent intent=new Intent(getActivity(),List3Activity.class);
                                                startActivity(intent);

                            }
                        });
                txt_laptop.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(getActivity(),List1Activity.class);
                        startActivity(intent);

                    }
                });
        txt_headphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),List2Activity.class);
                startActivity(intent);

            }
        });

        return view;


    }

}
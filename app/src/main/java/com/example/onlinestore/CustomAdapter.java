package com.example.onlinestore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    Context context;

    ArrayList<DataModel> arrayList = new ArrayList<>();


    public CustomAdapter(Context context, ArrayList<DataModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class ViewHolder{
        TextView txt_name;
        ImageView img_view;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        LayoutInflater inflater =
                (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        ViewHolder viewHolder;

        if(view==null){

           view=inflater.inflate(R.layout.single_view,null);

           viewHolder = new ViewHolder();

           viewHolder.txt_name=view.findViewById(R.id.txt_name);
           viewHolder.img_view=view.findViewById(R.id.img_view);

            view.setTag(viewHolder);


        }
        else{

            viewHolder=(ViewHolder) view.getTag();

        }

        viewHolder.txt_name.setText(arrayList.get(position).getName());

        viewHolder.img_view.setImageResource(arrayList.get(position).getImg());
        arrayList.get(position).setId(position);


        return view;
    }
}

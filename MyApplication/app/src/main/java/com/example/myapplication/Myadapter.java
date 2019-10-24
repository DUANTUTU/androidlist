package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Myadapter extends ArrayAdapter<Name> {
    int resourceid;
    public Myadapter(Context context, int resource, List<Name> objects) {
        super(context, resource, objects);
        resourceid=resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Name name=getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceid,parent,false);
        ImageView imageView=view.findViewById(R.id.image);
        TextView textView=view.findViewById(R.id.text);
        imageView.setImageResource(name.getImageid());
        textView.setText(name.getName());
        return view;
    }
}

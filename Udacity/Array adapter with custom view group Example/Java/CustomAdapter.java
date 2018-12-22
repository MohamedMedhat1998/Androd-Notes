package com.andalus.abomed7at.customarrayadaptertest;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by AboMed7at on 9/25/2017.
 */

public class CustomAdapter extends ArrayAdapter<Wasfa> {
    public CustomAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Wasfa> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Wasfa this_wasfa = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.my_list_item, parent, false);
        }
        TextView tv = (TextView)convertView.findViewById(R.id.txt_id);
        ImageView image = (ImageView) convertView.findViewById(R.id.image_id);
        Button btn = (Button) convertView.findViewById(R.id.btn_id);

        tv.setText(this_wasfa.getTVT());
        image.setImageResource(this_wasfa.getImageID());
        btn.setText(this_wasfa.getButtonText());

        return convertView;
    }
}

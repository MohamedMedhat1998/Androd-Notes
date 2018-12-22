package com.andalus.abomed7at.customarrayadaptertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupAdapter();

    }

    private void setupAdapter(){
        ArrayList<Wasfa> myArrayList = new ArrayList<Wasfa>();

        myArrayList.add(new Wasfa(android.R.drawable.ic_menu_report_image,"Press Me","This is Text"));
        myArrayList.add(new Wasfa(android.R.drawable.btn_default,"jaksdb as","j,HMGS,DB KHB H"));
        myArrayList.add(new Wasfa(android.R.drawable.alert_light_frame,"ASDL  Me","This ASDKJHBK A Text"));
        myArrayList.add(new Wasfa(android.R.drawable.divider_horizontal_textfield,"PreASDAH Me","This is SBFB,HJH"));
        myArrayList.add(new Wasfa(android.R.drawable.bottom_bar,"Press Me","This is Text"));
        myArrayList.add(new Wasfa(android.R.drawable.ic_menu_report_image,"Press Me","This is Text"));
        myArrayList.add(new Wasfa(android.R.drawable.btn_minus,"Press Me","This is Text"));
        myArrayList.add(new Wasfa(android.R.drawable.ic_menu_report_image,"Press Me","This is Text"));
        myArrayList.add(new Wasfa(android.R.drawable.ic_menu_report_image,"Press Me","This is Text"));
        myArrayList.add(new Wasfa(android.R.drawable.ic_menu_report_image,"Press Me","This is Text"));
        myArrayList.add(new Wasfa(android.R.drawable.btn_default_small,"Press Me","This is Text"));
        myArrayList.add(new Wasfa(android.R.drawable.ic_menu_report_image,"Press Me","This is Text"));
        myArrayList.add(new Wasfa(android.R.drawable.btn_dropdown,"Press Me","This is Text"));
        myArrayList.add(new Wasfa(android.R.drawable.divider_horizontal_dark,"Press Me","This is Text"));
        myArrayList.add(new Wasfa(android.R.drawable.ic_menu_report_image,"Press Me","This is Text"));
        myArrayList.add(new Wasfa(android.R.drawable.ic_menu_report_image,"Press Me","This is Text"));
        myArrayList.add(new Wasfa(android.R.drawable.ic_media_pause,"Press Me","This is Text"));
        myArrayList.add(new Wasfa(android.R.drawable.ic_menu_report_image,"Press Me","This is Text"));
        myArrayList.add(new Wasfa(android.R.drawable.alert_dark_frame,"Press Me","This is Text"));
        myArrayList.add(new Wasfa(android.R.drawable.ic_menu_report_image,"Press Me","This is Text"));

        GridView listView = (GridView) findViewById(R.id.myList);

        CustomAdapter customAdapter = new CustomAdapter(getBaseContext(),R.layout.my_list_item,myArrayList);

        listView.setAdapter(customAdapter);

    }
}

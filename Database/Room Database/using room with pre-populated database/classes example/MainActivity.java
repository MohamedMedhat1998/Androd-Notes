package com.andalus.abomed7at55.roomwithexistingdatabasetest;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.andalus.abomed7at55.roomwithexistingdatabasetest.Database.AppDatabase;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MainActivity extends AppCompatActivity {

    public static final String DB_NAME = "test.db";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final File dbFile = getDatabasePath(DB_NAME);
        if(!dbFile.exists()){
            Log.d("DATABASE","Not Found And Is Being Created");
            try {
                InputStream in = getAssets().open(DB_NAME);
                byte[] buffer = new byte[1024];
                int sz;
                OutputStream out = new FileOutputStream(getDatabasePath(DB_NAME));
                Log.d("Location",getDatabasePath(DB_NAME) + "");
                while ((sz = in.read(buffer)) > 0){
                    out.write(buffer,0,sz);
                }
                in.close();
                out.flush();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            Log.d("DATABASE","Found And No Action Is Taken");
        }
        new AsyncTask<Object,Object,Object>(){

            @Override
            protected Object doInBackground(Object[] objects) {
                AppDatabase appDatabase = AppDatabase.getDatabaseStaticInstance(getBaseContext());
                Log.d("DATA Size",appDatabase.getExistingDao().getAll().size() + "");
                return null;
            }
        }.execute();
    }
}

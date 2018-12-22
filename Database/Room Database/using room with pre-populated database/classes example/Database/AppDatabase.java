package com.andalus.abomed7at55.roomwithexistingdatabasetest.Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.andalus.abomed7at55.roomwithexistingdatabasetest.MainActivity;

@Database(entities = {existing.class},version = 1)
public abstract class AppDatabase extends RoomDatabase{

    private static AppDatabase mMyDatabase;
    public static AppDatabase getDatabaseStaticInstance(Context context){
        if(mMyDatabase == null){
            mMyDatabase = Room.databaseBuilder(context,AppDatabase.class, MainActivity.DB_NAME).build();
        }
        return mMyDatabase;
    }

    public abstract CustomDao getExistingDao();
}

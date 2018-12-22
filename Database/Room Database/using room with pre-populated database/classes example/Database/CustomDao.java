package com.andalus.abomed7at55.roomwithexistingdatabasetest.Database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface CustomDao {
    @Query("SELECT * FROM existing")
    List<existing> getAll();
}

package com.andalus.abomed7at55.roomwithexistingdatabasetest.Database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class existing {

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "Id")
    private int id;

    @ColumnInfo(name = "name")
    private String name;
    @ColumnInfo(name = "link")
    private String link;
    @ColumnInfo(name = "description")
    private String description;

    public existing(@NonNull int id, String name, String link, String description) {
        this.id = id;
        this.name = name;
        this.link = link;
        this.description = description;
    }

    @NonNull
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLink() {
        return link;
    }

    public String getDescription() {
        return description;
    }
}

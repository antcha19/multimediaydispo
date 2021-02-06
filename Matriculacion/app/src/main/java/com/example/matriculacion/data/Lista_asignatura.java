package com.example.matriculacion.data;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "lista_asignatura")
public class Lista_asignatura {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "id")
    private final String mId ;

    @NonNull
    @ColumnInfo(name = "name")
    private final String mName;

    public Lista_asignatura(@NonNull String id, @NonNull String name) {
        mId = id;
        mName = name;
    }


    @NonNull
    public String getId() {
        return mId;
    }

    @NonNull
    public String getName() {
        return mName;
    }
}

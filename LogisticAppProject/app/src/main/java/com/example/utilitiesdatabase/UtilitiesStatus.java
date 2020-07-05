package com.example.utilitiesdatabase;

import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class UtilitiesStatus {
    public static final String CREATE_TABLE_STATUS = "CREATE TABLE STATUS (status_id INTEGER PRIMARY KEY, status_name TEXT, FOREIGN KEY(status_id) REFERENCES MATERIALS(status_id), FOREIGN KEY(status_id) REFERENCES TESTS(status_id))";

    public void RegisterDataDefaultStatus(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getWritableDatabase();

        ArrayList<String> InsertStatus;
        InsertStatus = new ArrayList<>();

        InsertStatus.add("INSERT INTO STATUS (status_id, status_name) VALUES (1, 'En despacho')");
        InsertStatus.add("INSERT INTO STATUS (status_id, status_name) VALUES (2, 'En transito')");
        InsertStatus.add("INSERT INTO STATUS (status_id, status_name) VALUES (3, 'Entregado en sitio')");
        InsertStatus.add("INSERT INTO STATUS (status_id, status_name) VALUES (4, 'Entregado en salón')");

        for (int i = 0; i<InsertStatus.size();i++){
            db.execSQL(InsertStatus.get(i));
        }

        db.close();
    }
}

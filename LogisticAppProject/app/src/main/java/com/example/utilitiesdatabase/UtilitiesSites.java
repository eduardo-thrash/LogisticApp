package com.example.utilitiesdatabase;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class UtilitiesSites {
    public static final String CREATE_TABLE_SITES = "CREATE TABLE SITES (site_id INTEGER PRIMARY KEY, site_name TEXT, city_id INTEGER, FOREIGN KEY(site_id) REFERENCES USERS(site_id), FOREIGN KEY(site_id) REFERENCES MATERIALS(site_id), FOREIGN KEY(site_id) REFERENCES ROOMS(site_id))";

    public void RegisterDataDefaultSite(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getWritableDatabase();

        ArrayList<String> InsertSites;
        InsertSites = new ArrayList<>();

        InsertSites.add("INSERT INTO SITES (site_id, site_name, city_id) VALUES (1, 'Universidad Javeriana', 1)");
        InsertSites.add("INSERT INTO SITES (site_id, site_name, city_id) VALUES (2, 'Universidad del Rosario', 1)");
        InsertSites.add("INSERT INTO SITES (site_id, site_name, city_id) VALUES (3, 'Universidad de los Andes', 1)");
        InsertSites.add("INSERT INTO SITES (site_id, site_name, city_id) VALUES (4, 'Universidad Los Libertadores', 1)");
        InsertSites.add("INSERT INTO SITES (site_id, site_name, city_id) VALUES (5, 'Universidad Area Andina', 1)");
        InsertSites.add("INSERT INTO SITES (site_id, site_name, city_id) VALUES (6, 'Universidad Nacional de Bogota', 1)");
        InsertSites.add("INSERT INTO SITES (site_id, site_name, city_id) VALUES (7, 'Universidad de Antioquia', 1)");
        InsertSites.add("INSERT INTO SITES (site_id, site_name, city_id) VALUES (8, 'Universidad Nacional Abierta y a Distanca', 1)");
        InsertSites.add("INSERT INTO SITES (site_id, site_name, city_id) VALUES (9, 'Universidad Piloto', 1)");

        for (int i = 0; i<InsertSites.size();i++){
            db.execSQL(InsertSites.get(i));
        }

        db.close();
    }

    public Cursor GetSiteNameByMaterialCode(SQLiteConnectionHelper conn, String materialCode) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT site_name FROM SITES WHERE site_id = (SELECT site_id FROM MATERIALS WHERE material_code = '"+materialCode+"')",null);

        return cursor;
    }

    public Cursor GetSiteNameByTestCode(SQLiteConnectionHelper conn, String testCode) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT site_name FROM SITES WHERE site_id = (SELECT site_id FROM MATERIALS WHERE material_id = (SELECT test_material_id FROM TESTS WHERE test_code = '"+testCode+"'))",null);

        return cursor;
    }

    public Cursor GetSiteNameByUserIdentification(SQLiteConnectionHelper conn, int userId) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT site_name FROM SITES WHERE site_id = (SELECT site_id FROM USERS WHERE user_id = "+userId+")",null);

        return cursor;
    }
}

package com.example.utilitiesdatabase;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.businessrules.SiteBusinessRules;

import java.util.ArrayList;

public class UtilitiesSites {
    public static final String CREATE_TABLE_SITES = "CREATE TABLE SITES (site_id INTEGER PRIMARY KEY, site_name TEXT, city_id INTEGER, FOREIGN KEY(site_id) REFERENCES USERS(site_id), FOREIGN KEY(site_id) REFERENCES MATERIALS(site_id), FOREIGN KEY(site_id) REFERENCES ROOMS(site_id))";

    public void RegisterDataDefaultSite(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getWritableDatabase();

        ArrayList<String> InsertSites;
        InsertSites = new ArrayList<>();

        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (1,'Universidad Javeriana',1)");

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

    public ArrayList<SiteBusinessRules> GetSitesByCity(SQLiteConnectionHelper conn, String cityName) {

        SiteBusinessRules site = new SiteBusinessRules();
        ArrayList<SiteBusinessRules> siteList = new ArrayList<SiteBusinessRules>();

        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT site_name FROM SITES WHERE city_id = (SELECT city_id FROM CITIES WHERE city_name = '"+cityName+"')",null);

        while (cursor.moveToNext()){
            site = new SiteBusinessRules();

            site.setSiteName(cursor.getString(0));

            siteList.add(site);
        }

        return siteList;

    }

    public Cursor SelectSiteIdByName(SQLiteConnectionHelper conn, String siteNameSelected) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT site_id FROM SITES WHERE site_name = '"+siteNameSelected+"'",null);

        return cursor;
    }
}

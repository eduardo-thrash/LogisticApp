package com.example.utilitiesdatabase;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.businessrules.MaterialBusinessRules;

import java.util.ArrayList;

public class UtilitiesMaterials {
    public static final String MaterialTable = "MATERIALS";
    public static final String fieldMaterialId = "material_id";
    public static final String fieldMaterialCode = "material_code";
    public static final String fieldMaterialStatusId = "status_id";
    public static final String fieldMaterialPackageCount = "material_package_count";
    public static final String fieldMaterialUserId = "user_id";
    public static final String fieldMaterialSiteId = "site_id";
    public static final String fieldMaterialUserRoom = "material_user_room";

    public static final String CREATE_TABLE_MATERIALS = "CREATE TABLE MATERIALS (material_id INTEGER PRIMARY KEY, material_code TEXT, status_id INTEGER, material_package_count INTEGER, user_id INTEGER, site_id INTEGER, material_user_room INTEGER, FOREIGN KEY(material_id) REFERENCES TESTS(test_material_id))";

    public void RegisterDataDefaultMaterial(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getWritableDatabase();

        ArrayList<String> InsertMaterial;
        InsertMaterial = new ArrayList<>();

        InsertMaterial.add("INSERT INTO MATERIALS (material_id, material_code, status_id, material_package_count, user_id, site_id, material_user_room) VALUES (1,'MT000001',1,1,1,1, 3)");
        InsertMaterial.add("INSERT INTO MATERIALS (material_id, material_code, status_id, material_package_count, user_id, site_id, material_user_room) VALUES (2,'MT000002',1,1,7,1, 6)");
        InsertMaterial.add("INSERT INTO MATERIALS (material_id, material_code, status_id, material_package_count, user_id, site_id, material_user_room) VALUES (3,'MT000003',1,1,1,2, 9)");
        InsertMaterial.add("INSERT INTO MATERIALS (material_id, material_code, status_id, material_package_count, user_id, site_id, material_user_room) VALUES (4,'MT000004',1,1,7,3, 10)");
        InsertMaterial.add("INSERT INTO MATERIALS (material_id, material_code, status_id, material_package_count, user_id, site_id, material_user_room) VALUES (5,'MT000005',1,1,1,4, 11)");


        for (int i = 0; i<InsertMaterial.size();i++){
            db.execSQL(InsertMaterial.get(i));
        }

        db.close();
    }

    public Cursor GetMaterialCode(SQLiteConnectionHelper conn, String materialCode) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT material_code FROM MATERIALS WHERE material_code = '"+materialCode+"'",null);

        return cursor;
    }

    public Cursor GetPackageNumberByMaterialCode(SQLiteConnectionHelper conn, String materialCode) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT material_package_count FROM MATERIALS WHERE material_code = '"+materialCode+"'",null);

        return cursor;
    }

    public void MaterialStatusUpdateByScan(SQLiteConnectionHelper conn, String materialCode){

        SQLiteDatabase db = conn.getWritableDatabase();

        db.execSQL("PRAGMA foreign_keys = OFF");
        db.execSQL("UPDATE MATERIALS SET status_id = 3 WHERE material_code = '" + materialCode + "'");

    }

    public Cursor GetMaterialStatusByMaterialCode(SQLiteConnectionHelper conn, String materialCode) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT status_name FROM STATUS WHERE status_id = (SELECT status_id FROM MATERIALS  WHERE material_code = '"+materialCode+"')",null);

        return cursor;
    }

    public ArrayList<MaterialBusinessRules> GetMaterialListByUser(SQLiteConnectionHelper conn, int userId) {

        MaterialBusinessRules material = new MaterialBusinessRules();
        ArrayList<MaterialBusinessRules> MaterialDepartures = new ArrayList<MaterialBusinessRules>();

        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT M.material_code, S.status_name FROM MATERIALS M INNER JOIN STATUS S ON M.status_id = S.status_id WHERE M.user_id = (SELECT user_id FROM USERS WHERE user_id = "+userId+")",null);

        while (cursor.moveToNext()){
            material = new MaterialBusinessRules();

            material.setMaterialCode(cursor.getString(0));
            material.setMaterialStatus(cursor.getString(1));

            MaterialDepartures.add(material);
        }

        return MaterialDepartures;
    }

    public Cursor GetMaterialCodeList(SQLiteConnectionHelper conn) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT material_code FROM MATERIALS",null);

        return cursor;
    }

    public Cursor GetInfoStatusByMaterialCode(SQLiteConnectionHelper conn, String materialCode) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT status_name FROM STATUS WHERE status_id = (SELECT status_id FROM MATERIALS WHERE material_code = '"+materialCode+"')",null);

        return cursor;
    }

    public Cursor GetInfoMaterialIdByMaterialCode(SQLiteConnectionHelper conn, String materialCode) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT material_id FROM MATERIALS WHERE material_code = '"+materialCode+"'",null);

        return cursor;
    }

    public ArrayList<MaterialBusinessRules> SelectMaterialListBySiteName(SQLiteConnectionHelper conn, String siteName) {
        MaterialBusinessRules material = new MaterialBusinessRules();
        ArrayList<MaterialBusinessRules> MaterialDepartures = new ArrayList<MaterialBusinessRules>();

        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT M.material_code, S.status_name FROM MATERIALS M INNER JOIN STATUS S ON M.status_id = S.status_id WHERE M.site_id = (SELECT site_id FROM SITES WHERE site_name = '"+siteName+"')",null);

        while (cursor.moveToNext()){
            material = new MaterialBusinessRules();

            material.setMaterialCode(cursor.getString(0));
            material.setMaterialStatus(cursor.getString(1));

            MaterialDepartures.add(material);
        }

        return MaterialDepartures;
    }

    public void UpdateMaterialForScan(SQLiteConnectionHelper conn, String materialCodeContents) {
        SQLiteDatabase db = conn.getWritableDatabase();

        db.execSQL("PRAGMA foreign_keys = OFF");
        db.execSQL("UPDATE MATERIALS SET status_id = 3 WHERE material_code = '" + materialCodeContents + "'");
    }
}
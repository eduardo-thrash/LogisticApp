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

        InsertMaterial.add("INSERT INTO MATERIALS (material_id, material_code, status_id, material_package_count, user_id, site_id, material_user_room) VALUES (1, 'MT00000001', 1, 5, 2, 1, 3)");
        InsertMaterial.add("INSERT INTO MATERIALS (material_id, material_code, status_id, material_package_count, user_id, site_id, material_user_room) VALUES (2, 'MT00000002', 1, 5, 2, 1, 3)");
        InsertMaterial.add("INSERT INTO MATERIALS (material_id, material_code, status_id, material_package_count, user_id, site_id, material_user_room) VALUES (3, 'MT00000003', 1, 5, 2, 1, 3)");
        InsertMaterial.add("INSERT INTO MATERIALS (material_id, material_code, status_id, material_package_count, user_id, site_id, material_user_room) VALUES (4, 'MT00000004', 1, 5, 2, 1, 3)");
        InsertMaterial.add("INSERT INTO MATERIALS (material_id, material_code, status_id, material_package_count, user_id, site_id, material_user_room) VALUES (5, 'MT00000005', 1, 5, 2, 1, 3)");
        InsertMaterial.add("INSERT INTO MATERIALS (material_id, material_code, status_id, material_package_count, user_id, site_id, material_user_room) VALUES (6, 'MT00000006', 1, 5, 2, 1, 3)");
        InsertMaterial.add("INSERT INTO MATERIALS (material_id, material_code, status_id, material_package_count, user_id, site_id, material_user_room) VALUES (7, 'MT00000007', 1, 5, 2, 1, 3)");
        InsertMaterial.add("INSERT INTO MATERIALS (material_id, material_code, status_id, material_package_count, user_id, site_id, material_user_room) VALUES (8, 'MT00000008', 1, 5, 2, 1, 3)");
        InsertMaterial.add("INSERT INTO MATERIALS (material_id, material_code, status_id, material_package_count, user_id, site_id, material_user_room) VALUES (9, 'MT00000009', 1, 5, 2, 1, 3)");
        InsertMaterial.add("INSERT INTO MATERIALS (material_id, material_code, status_id, material_package_count, user_id, site_id, material_user_room) VALUES (10, 'MT00000010', 1, 10, 2, 1, 3)");
        InsertMaterial.add("INSERT INTO MATERIALS (material_id, material_code, status_id, material_package_count, user_id, site_id, material_user_room) VALUES (11, 'MT00000011', 1, 10, 2, 1, 3)");
        InsertMaterial.add("INSERT INTO MATERIALS (material_id, material_code, status_id, material_package_count, user_id, site_id, material_user_room) VALUES (12, 'MT00000012', 1, 10, 2, 1, 3)");
        InsertMaterial.add("INSERT INTO MATERIALS (material_id, material_code, status_id, material_package_count, user_id, site_id, material_user_room) VALUES (13, 'MT00000013', 1, 10, 2, 1, 3)");
        InsertMaterial.add("INSERT INTO MATERIALS (material_id, material_code, status_id, material_package_count, user_id, site_id, material_user_room) VALUES (14, 'MT00000014', 1, 10, 2, 1, 3)");
        InsertMaterial.add("INSERT INTO MATERIALS (material_id, material_code, status_id, material_package_count, user_id, site_id, material_user_room) VALUES (15, 'MT00000015', 1, 10, 2, 1, 3)");
        InsertMaterial.add("INSERT INTO MATERIALS (material_id, material_code, status_id, material_package_count, user_id, site_id, material_user_room) VALUES (16, 'MT00000016', 1, 10, 2, 1, 3)");
        InsertMaterial.add("INSERT INTO MATERIALS (material_id, material_code, status_id, material_package_count, user_id, site_id, material_user_room) VALUES (17, 'MT00000017', 1, 10, 2, 1, 3)");
        InsertMaterial.add("INSERT INTO MATERIALS (material_id, material_code, status_id, material_package_count, user_id, site_id, material_user_room) VALUES (18, 'MT00000018', 1, 10, 2, 1, 3)");
        InsertMaterial.add("INSERT INTO MATERIALS (material_id, material_code, status_id, material_package_count, user_id, site_id, material_user_room) VALUES (19, 'MT00000019', 1, 10, 2, 1, 3)");
        InsertMaterial.add("INSERT INTO MATERIALS (material_id, material_code, status_id, material_package_count, user_id, site_id, material_user_room) VALUES (20, 'MT00000020', 1, 10, 2, 1, 3)");

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
        db.execSQL("UPDATE MATERIALS SET status_id = 5 WHERE material_code = '" + materialCode + "'");

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
}

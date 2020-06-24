package com.example.utilitiesdatabase;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class UtilitiesNotificationMaterial {

    public static final String fieldNotificationMaterialTable = "NOTIFICATION_MATERIAL";
    public static final String fieldNotificationMaterialId = "notification_material_id";
    public static final String fieldNotificationMaterialTypeId = "notification_material_type_id";
    public static final String fieldMaterialId = "material_id";
    public static final String fieldNotificationMaterialDescription = "notification_material_description";

    public static final String CREATE_TABLE_NOTIFICATION_MATERIAL = "CREATE TABLE NOTIFICATION_MATERIAL (notification_material_id INTEGER PRIMARY KEY, notification_material_type_id INTEGER, material_id INTEGER, notification_material_description TEXT)";

    public void RegisterDataDefaultNotificationMaterial(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getWritableDatabase();

        ArrayList<String> InsertNotificationMaterial;
        InsertNotificationMaterial = new ArrayList<>();
        InsertNotificationMaterial.add("INSERT INTO NOTIFICATION_MATERIAL(notification_material_id,notification_material_type_id,Material_id,notification_material_description)VALUES(1,1,1,'Material de Evaluacion')");
        InsertNotificationMaterial.add("INSERT INTO NOTIFICATION_MATERIAL(notification_material_id,notification_material_type_id,Material_id,notification_material_description)VALUES(2,2,2,'Material de Sitio')");
        InsertNotificationMaterial.add("INSERT INTO NOTIFICATION_MATERIAL(notification_material_id,notification_material_type_id,Material_id,notification_material_description)VALUES(3,3,3,'Material Incompleto ')");
        InsertNotificationMaterial.add("INSERT INTO NOTIFICATION_MATERIAL(notification_material_id,notification_material_type_id,Material_id,notification_material_description)VALUES(4,4,4,'Codigo Material ')");
        InsertNotificationMaterial.add("INSERT INTO NOTIFICATION_MATERIAL(notification_material_id,notification_material_type_id,Material_id,notification_material_description)VALUES(5,5,5,'Material Sobrante')");
        InsertNotificationMaterial.add("INSERT INTO NOTIFICATION_MATERIAL(notification_material_id,notification_material_type_id,Material_id,notification_material_description)VALUES(6,6,6,'Material Faltante')");


        for (int i = 0; i<InsertNotificationMaterial.size();i++){
            db.execSQL(InsertNotificationMaterial.get(i));
        }

        db.close();
    }

    public Cursor GetMissingMaterialBySite(SQLiteConnectionHelper conn) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM NOTIFICATION_MATERIAL WHERE notification_material_type_id = 1",null);

        return cursor;
    }

    public Cursor GetAdditionalMaterialBySite(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM NOTIFICATION_MATERIAL WHERE notification_material_type_id = 2",null);

        return cursor;
    }

    public Cursor GetMissingPersonalBySite(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM NOTIFICATION_MATERIAL WHERE notification_material_type_id = 3",null);

        return cursor;
    }
}

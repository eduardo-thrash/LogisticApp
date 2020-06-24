package com.example.utilitiesdatabase;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class UtilitiesNotificationMaterialType {

    public static final String NotificationMaterialTypeTable = "NOTIFICATION_MATERIAL_TYPE";
    public static final String fieldNotificationMaterialTypeId = "notification_material_type_id";

    public static final String CREATE_TABLE_NOTIFICATION_MATERIAL_TYPE = "CREATE TABLE NOTIFICATION_MATERIAL_TYPE (notification_material_type_id INTEGER PRIMARY KEY, notification_material_type_name TEXT, FOREIGN KEY(notification_material_type_id) REFERENCES NOTIFICATION_MATERIAL(notification_material_type_id))";

    public void RegisterDataDefaultNotificationMaterialType(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getWritableDatabase();

        ArrayList<String> InsertNotificationMaterialType;
        InsertNotificationMaterialType = new ArrayList<>();

        InsertNotificationMaterialType.add("INSERT INTO NOTIFICATION_MATERIAL_TYPE(notification_material_type_id,notification_material_type_name)VALUES(1,'Material de Evaluacion')");
        InsertNotificationMaterialType.add("INSERT INTO NOTIFICATION_MATERIAL_TYPE(notification_material_type_id,notification_material_type_name)VALUES(2,'Material de Sitio')");
        InsertNotificationMaterialType.add("INSERT INTO NOTIFICATION_MATERIAL_TYPE(notification_material_type_id,notification_material_type_name)VALUES(3,'Material Incompleto')");
        InsertNotificationMaterialType.add("INSERT INTO NOTIFICATION_MATERIAL_TYPE(notification_material_type_id,notification_material_type_name)VALUES(4,'Codigo Material')");
        InsertNotificationMaterialType.add("INSERT INTO NOTIFICATION_MATERIAL_TYPE(notification_material_type_id,notification_material_type_name)VALUES(5,'Material Sobrante')");
        InsertNotificationMaterialType.add("INSERT INTO NOTIFICATION_MATERIAL_TYPE(notification_material_type_id,notification_material_type_name)VALUES(6,'Material Faltante')");



        for (int i = 0; i<InsertNotificationMaterialType.size();i++){
            db.execSQL(InsertNotificationMaterialType.get(i));
        }

        db.close();
    }

    public Cursor GetMaterialNotificationTypeList(SQLiteConnectionHelper conn) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT notification_material_type_name FROM NOTIFICATION_MATERIAL_TYPE",null);

        return cursor;
    }

    public Cursor GetInfoMaterialNotificationTypeId(SQLiteConnectionHelper conn, String materialNotificationType) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT notification_material_type_id FROM NOTIFICATION_MATERIAL_TYPE WHERE notification_material_type_name = '"+materialNotificationType+"'",null);

        return cursor;
    }
}

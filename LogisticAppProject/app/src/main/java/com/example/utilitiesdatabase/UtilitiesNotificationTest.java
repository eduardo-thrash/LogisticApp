package com.example.utilitiesdatabase;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class UtilitiesNotificationTest {

    public static final String fieldNotificationMaterialTable = "NOTIFICATION_TEST";
    public static final String fieldNotificationMaterialId = "notification_test_id";
    public static final String fieldNotificationMaterialTypeId = "notification_test_type_id";
    public static final String fieldMaterialId = "test_id";
    public static final String fieldNotificationMaterialDescription = "notification_test_description";

    public static final String CREATE_TABLE_NOTIFICATION_TEST = "CREATE TABLE NOTIFICATION_TEST (notification_test_id INTEGER PRIMARY KEY, notification_test_type_id INTEGER, test_id INTEGER, notification_test_description TEXT)";

    public void RegisterDataDefaultNotificationTest(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getWritableDatabase();

        ArrayList<String> InsertNotificationTest;
        InsertNotificationTest = new ArrayList<>();

        InsertNotificationTest.add("INSERT INTO NOTIFICATION_TEST(notification_test_id,notification_test_type_id,test_id,notification_test_description)VALUES(1,1,1,'descripcion de examen por novedad')");
        InsertNotificationTest.add("INSERT INTO NOTIFICATION_TEST(notification_test_id,notification_test_type_id,test_id,notification_test_description)VALUES(2,1,2,'descripcion de examen por novedad')");
        InsertNotificationTest.add("INSERT INTO NOTIFICATION_TEST(notification_test_id,notification_test_type_id,test_id,notification_test_description)VALUES(3,1,3,'descripcion de examen por novedad')");
        InsertNotificationTest.add("INSERT INTO NOTIFICATION_TEST(notification_test_id,notification_test_type_id,test_id,notification_test_description)VALUES(4,1,4,'descripcion de examen por novedad')");
        InsertNotificationTest.add("INSERT INTO NOTIFICATION_TEST(notification_test_id,notification_test_type_id,test_id,notification_test_description)VALUES(5,1,5,'descripcion de examen por novedad')");
        InsertNotificationTest.add("INSERT INTO NOTIFICATION_TEST(notification_test_id,notification_test_type_id,test_id,notification_test_description)VALUES(6,1,6,'descripcion de examen por novedad')");
        InsertNotificationTest.add("INSERT INTO NOTIFICATION_TEST(notification_test_id,notification_test_type_id,test_id,notification_test_description)VALUES(7,1,7,'descripcion de examen por novedad')");
        InsertNotificationTest.add("INSERT INTO NOTIFICATION_TEST(notification_test_id,notification_test_type_id,test_id,notification_test_description)VALUES(8,1,8,'descripcion de examen por novedad')");
        InsertNotificationTest.add("INSERT INTO NOTIFICATION_TEST(notification_test_id,notification_test_type_id,test_id,notification_test_description)VALUES(9,1,9,'descripcion de examen por novedad')");
        InsertNotificationTest.add("INSERT INTO NOTIFICATION_TEST(notification_test_id,notification_test_type_id,test_id,notification_test_description)VALUES(10,2,10,'descripcion de examen por novedad')");
        InsertNotificationTest.add("INSERT INTO NOTIFICATION_TEST(notification_test_id,notification_test_type_id,test_id,notification_test_description)VALUES(11,2,11,'descripcion de examen por novedad')");
        InsertNotificationTest.add("INSERT INTO NOTIFICATION_TEST(notification_test_id,notification_test_type_id,test_id,notification_test_description)VALUES(12,2,12,'descripcion de examen por novedad')");
        InsertNotificationTest.add("INSERT INTO NOTIFICATION_TEST(notification_test_id,notification_test_type_id,test_id,notification_test_description)VALUES(13,2,13,'descripcion de examen por novedad')");

        for (int i = 0; i<InsertNotificationTest.size();i++){
            db.execSQL(InsertNotificationTest.get(i));
        }

        db.close();
    }

    public Cursor GetMissingParticipants(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM NOTIFICATION_TEST WHERE notification_test_type_id = 1",null);

        return cursor;
    }

    public Cursor GetCancelTest(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM NOTIFICATION_TEST WHERE notification_test_type_id = 2",null);

        return cursor;
    }
}

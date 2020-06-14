package com.example.utilitiesdatabase;

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

        for (int i = 0; i<InsertNotificationTest.size();i++){
            db.execSQL(InsertNotificationTest.get(i));
        }

        db.close();
    }
}

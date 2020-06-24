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

        InsertNotificationTest.add("INSERT INTO NOTIFICATION_TEST(notification_test_id,notification_test_type_id,test_id,notification_test_description)VALUES(1,1,1,'Examen Perdido')");
        InsertNotificationTest.add("INSERT INTO NOTIFICATION_TEST(notification_test_id,notification_test_type_id,test_id,notification_test_description)VALUES(2,2,2,'Examen Incompleto')");
        InsertNotificationTest.add("INSERT INTO NOTIFICATION_TEST(notification_test_id,notification_test_type_id,test_id,notification_test_description)VALUES(3,3,3,'Examen Anulado')");
        InsertNotificationTest.add("INSERT INTO NOTIFICATION_TEST(notification_test_id,notification_test_type_id,test_id,notification_test_description)VALUES(4,4,4,'El examen no corresponde al participante')");


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

    public Cursor GetTestCode(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT test_code FROM TESTS",null);

        return cursor;
    }

    public boolean CreateNotificationTest(SQLiteConnectionHelper conn, String testId, String testNotificationType, String testDescription) {

        int notificationTestTypeId = Integer.parseInt(testNotificationType);
        int test_id = Integer.parseInt(testId);

        SQLiteDatabase db = conn.getWritableDatabase();

        ArrayList<String> InsertNotificationTest;
        InsertNotificationTest = new ArrayList<>();

        InsertNotificationTest.add("INSERT INTO NOTIFICATION_TEST(notification_test_type_id,test_id,notification_test_description)VALUES("+notificationTestTypeId+","+test_id+",'"+testDescription+"')");

        for (int i = 0; i<InsertNotificationTest.size();i++){
            db.execSQL(InsertNotificationTest.get(i));
        }

        db.close();

        return true;
    }
}

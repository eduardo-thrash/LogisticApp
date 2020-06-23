package com.example.utilitiesdatabase;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class UtilitiesNotificationTestType {
    public static final String NotificationMaterialTypeTable = "NOTIFICATION_TEST_TYPE";
    public static final String fieldNotificationTestTypeId = "notification_test_type_id";
    public static final String fieldNotificationTestTypeName = "notification_test_type_name";

    public static final String CREATE_TABLE_NOTIFICATION_TEST_TYPE = "CREATE TABLE NOTIFICATION_TEST_TYPE (notification_test_type_id INTEGER PRIMARY KEY, notification_test_type_name TEXT, FOREIGN KEY(notification_test_type_id) REFERENCES NOTIFICATION_TEST(notification_test_type_id))";

    public void RegisterDataDefaultNotificationTestType(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getWritableDatabase();

        ArrayList<String> InsertNotificationTestType;
        InsertNotificationTestType = new ArrayList<>();

        InsertNotificationTestType.add("INSERT INTO NOTIFICATION_TEST_TYPE(notification_test_type_id,notification_test_type_name)VALUES(1,Perdido')");
        InsertNotificationTestType.add("INSERT INTO NOTIFICATION_TEST_TYPE(notification_test_type_id,notification_test_type_name)VALUES(2,Incompleto')");
        InsertNotificationTestType.add("INSERT INTO NOTIFICATION_TEST_TYPE(notification_test_type_id,notification_test_type_name)VALUES(3,Anulado')");
        InsertNotificationTestType.add("INSERT INTO NOTIFICATION_TEST_TYPE(notification_test_type_id,notification_test_type_name)VALUES(4,No corresponde')");
        InsertNotificationTestType.add("INSERT INTO NOTIFICATION_TEST_TYPE(notification_test_type_id,notification_test_type_name)VALUES(5,Duplicado')");


        for (int i = 0; i<InsertNotificationTestType.size();i++){
            db.execSQL(InsertNotificationTestType.get(i));
        }

        db.close();
    }

    public Cursor GetNotificationTestType(SQLiteConnectionHelper conn) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT notification_test_type_name FROM NOTIFICATION_TEST_TYPE",null);

        return cursor;
    }

    public Cursor GetTestNotificationTypeId(SQLiteConnectionHelper conn, String testNotificationTypeName) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT notification_test_type_id FROM NOTIFICATION_TEST_TYPE WHERE notification_test_type_name = '"+testNotificationTypeName+"'",null);

        return cursor;
    }
}

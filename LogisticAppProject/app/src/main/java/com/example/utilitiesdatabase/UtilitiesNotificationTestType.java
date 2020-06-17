package com.example.utilitiesdatabase;

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

        InsertNotificationTestType.add("INSERT INTO NOTIFICATION_TEST_TYPE(notification_test_type_id,notification_test_type_name)VALUES(1,'Participante ausente')");
        InsertNotificationTestType.add("INSERT INTO NOTIFICATION_TEST_TYPE(notification_test_type_id,notification_test_type_name)VALUES(2,'Prueba anulada')");

        for (int i = 0; i<InsertNotificationTestType.size();i++){
            db.execSQL(InsertNotificationTestType.get(i));
        }

        db.close();
    }
}

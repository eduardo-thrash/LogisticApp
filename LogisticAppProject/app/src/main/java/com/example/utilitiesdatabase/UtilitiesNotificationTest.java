package com.example.utilitiesdatabase;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.businessrules.NotificationBusinessRules;
import com.example.businessrules.TestBusinessRules;

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

    public ArrayList<NotificationBusinessRules> GetListTestNotificationByRoom(SQLiteConnectionHelper conn, int userRoomBossIdSession) {

        NotificationBusinessRules notificationTest = new NotificationBusinessRules();
        ArrayList<NotificationBusinessRules> TestList = new ArrayList<NotificationBusinessRules>();

        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT TS.test_code, TY.notification_test_type_name, NT.notification_test_description FROM NOTIFICATION_TEST NT INNER JOIN TESTS TS ON NT.test_id = TS.test_id INNER JOIN MATERIALS MT ON TS.test_material_id = MT.material_id INNER JOIN NOTIFICATION_TEST_TYPE TY ON NT.notification_test_type_id = TY.notification_test_type_id WHERE material_user_room = (SELECT user_id FROM USERS WHERE user_id = "+userRoomBossIdSession+")",null);

        while (cursor.moveToNext()){
            notificationTest = new NotificationBusinessRules();

            notificationTest.setTestCode(cursor.getString(0));
            notificationTest.setNotificationTestTypeName(cursor.getString(1));
            notificationTest.setNotificationTestTypeDescription(cursor.getString(2));

            TestList.add(notificationTest);
        }

        return TestList;
    }

    public ArrayList<NotificationBusinessRules> GetListNotificationByRoom(SQLiteConnectionHelper conn, int RoomId) {

        NotificationBusinessRules notificationTest = new NotificationBusinessRules();
        ArrayList<NotificationBusinessRules> TestList = new ArrayList<NotificationBusinessRules>();

        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT TS.test_code, TY.notification_test_type_name, NT.notification_test_description FROM NOTIFICATION_TEST NT INNER JOIN TESTS TS ON NT.test_id = TS.test_id INNER JOIN MATERIALS MT ON TS.test_material_id = MT.material_id INNER JOIN NOTIFICATION_TEST_TYPE TY ON NT.notification_test_type_id = TY.notification_test_type_id where TS.room_id = (SELECT R.room_id FROM ROOMS R WHERE R.room_id = "+RoomId+")",null);

        while (cursor.moveToNext()){
            notificationTest = new NotificationBusinessRules();

            notificationTest.setTestCode(cursor.getString(0));
            notificationTest.setNotificationTestTypeName(cursor.getString(1));
            notificationTest.setNotificationTestTypeDescription(cursor.getString(2));

            TestList.add(notificationTest);
        }

        return TestList;
    }

    public Cursor TestQuantityByRoom(SQLiteConnectionHelper conn, String roomId) {
        int IntRoomId = Integer.parseInt(roomId);

        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM NOTIFICATION_TEST WHERE notification_test_type_id = 1 AND test_id = (SELECT test_id FROM TESTS WHERE room_id = "+IntRoomId+")",null);

        return cursor;
    }

    public Cursor GetNotificationMissingTestQuantityByRoom(SQLiteConnectionHelper conn, String roomId) {
        int IntRoomId = Integer.parseInt(roomId);

        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM NOTIFICATION_TEST NT INNER JOIN TESTS TE ON NT.test_id = TE.test_id WHERE NT.notification_test_type_id = 1 AND TE.room_id = "+IntRoomId+"",null);

        return cursor;
    }

    public Cursor GetNotificationAdditionalTestQuantityByRoom(SQLiteConnectionHelper conn, String roomId) {
        int IntRoomId = Integer.parseInt(roomId);

        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM NOTIFICATION_TEST NT INNER JOIN TESTS TE ON NT.test_id = TE.test_id WHERE NT.notification_test_type_id = 2 AND TE.room_id = "+IntRoomId+"",null);

        return cursor;
    }

    public Cursor GetNotificationMissingParticipantsQuantityByRoom(SQLiteConnectionHelper conn, String roomId) {
        int IntRoomId = Integer.parseInt(roomId);

        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM NOTIFICATION_TEST NT INNER JOIN TESTS TE ON NT.test_id = TE.test_id WHERE NT.notification_test_type_id = 4 AND TE.room_id = "+IntRoomId+"",null);

        return cursor;
    }

    public Cursor GetNotificationCancelTestQuantityByRoom(SQLiteConnectionHelper conn, String roomId) {
        int IntRoomId = Integer.parseInt(roomId);

        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM NOTIFICATION_TEST NT INNER JOIN TESTS TE ON NT.test_id = TE.test_id WHERE NT.notification_test_type_id = 3 AND TE.room_id = "+IntRoomId+"",null);

        return cursor;
    }

    public ArrayList<NotificationBusinessRules> GetListNotificationBySite(SQLiteConnectionHelper conn, int siteId) {
        NotificationBusinessRules notificationTest = new NotificationBusinessRules();
        ArrayList<NotificationBusinessRules> TestList = new ArrayList<NotificationBusinessRules>();

        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT TS.test_code, TY.notification_test_type_name, NT.notification_test_description FROM NOTIFICATION_TEST NT INNER JOIN TESTS TS ON NT.test_id = TS.test_id INNER JOIN MATERIALS MT ON TS.test_material_id = MT.material_id INNER JOIN NOTIFICATION_TEST_TYPE TY ON NT.notification_test_type_id = TY.notification_test_type_id where MT.site_id = (SELECT S.site_id FROM SITES S WHERE S.site_id = "+siteId+")",null);

        while (cursor.moveToNext()){
            notificationTest = new NotificationBusinessRules();

            notificationTest.setTestCode(cursor.getString(0));

            TestList.add(notificationTest);
        }

        return TestList;
    }

    public Cursor SelectNotificationTestDetail(SQLiteConnectionHelper conn, String testCodeNotification) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT TS.test_code, TY.notification_test_type_name, NT.notification_test_description FROM NOTIFICATION_TEST NT INNER JOIN TESTS TS ON NT.test_id = TS.test_id INNER JOIN MATERIALS MT ON TS.test_material_id = MT.material_id INNER JOIN NOTIFICATION_TEST_TYPE TY ON NT.notification_test_type_id = TY.notification_test_type_id WHERE TS.test_code = '"+testCodeNotification+"'",null);

        return cursor;
    }
}

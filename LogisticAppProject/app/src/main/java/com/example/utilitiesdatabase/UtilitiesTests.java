package com.example.utilitiesdatabase;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class UtilitiesTests {

    public static final String CREATE_TABLE_TESTS = "CREATE TABLE TESTS (test_id INTEGER PRIMARY KEY, test_code TEXT, status_id INTEGER, participant_id INTEGER, room_id INTEGER, test_material_id INTEGER, FOREIGN KEY(test_id) REFERENCES NOTIFICATION_TEST(test_id))";

    public void RegisterDataDefaultTest(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getWritableDatabase();

        ArrayList<String> InsertTest;
        InsertTest = new ArrayList<>();

        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(1,'TS00000001',1,1,1,2)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(2,'TS00000002',3,2,1,2)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(3,'TS00000003',3,3,1,2)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(4,'TS00000004',3,4,1,2)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(5,'TS00000005',3,5,1,2)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(6,'TS00000006',3,6,1,2)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(7,'TS00000007',3,7,1,2)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(8,'TS00000008',3,8,1,2)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(9,'TS00000009',3,9,1,2)");

        for (int i = 0; i<InsertTest.size();i++){
            db.execSQL(InsertTest.get(i));
        }

        db.close();
    }

    public Cursor GetPresentParticipants(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT test_code FROM TESTS WHERE status_id = 5",null);

        return cursor;
    }

    public Cursor GetTestCode(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT test_code FROM TESTS",null);

        return cursor;
    }

    public Cursor GetTestStatus(SQLiteConnectionHelper conn, String statusCode){
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT status_name FROM STATUS WHERE status_id = (SELECT status_id FROM TESTS WHERE test_code = '"+statusCode+"')",null);

        return cursor;
    }

    public Cursor GetTestId(SQLiteConnectionHelper conn, String testCode) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT test_id FROM TESTS WHERE test_code = '"+testCode+"'",null);

        return cursor;

    }

    public Cursor GetTestNumberByMaterialCode(SQLiteConnectionHelper conn, String materialCode) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM TESTS WHERE test_material_id = (SELECT material_id FROM MATERIALS WHERE material_code = '"+materialCode+"')",null);

        return cursor;
    }


}



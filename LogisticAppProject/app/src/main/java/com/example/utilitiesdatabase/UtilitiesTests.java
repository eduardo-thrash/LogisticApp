package com.example.utilitiesdatabase;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class UtilitiesTests {

    public static final String CREATE_TABLE_TESTS = "CREATE TABLE TESTS (test_id INTEGER PRIMARY KEY, test_code TEXT, status_id INTEGER participant_id INTEGER, room_id INTEGER, FOREIGN KEY(test_id) REFERENCES NOTIFICATION_TEST(test_id))";

    public Cursor GetPresentParticipants(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM TESTS WHERE status_id = 5",null);

        return cursor;
    }
}



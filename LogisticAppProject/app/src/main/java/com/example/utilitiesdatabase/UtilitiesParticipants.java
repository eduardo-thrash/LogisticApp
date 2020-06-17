package com.example.utilitiesdatabase;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class UtilitiesParticipants {
    public static final String CREATE_TABLE_PARTICIPANTS = "CREATE TABLE PARTICIPANTS (participant_id INTEGER PRIMARY KEY, participant_identification_type TEXT, participant_identification_id INTEGER, participant_name TEXT, FOREIGN KEY(participant_id) REFERENCES TESTS(participant_id))";

    public Cursor GetParticipantsBySite(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM PARTICIPANTS",null);

        return cursor;
    }

    public Cursor GetPresentParticipants(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM ROOMS",null);

        return cursor;
    }
}

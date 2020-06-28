package com.example.utilitiesdatabase;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class UtilitiesParticipants {
    public static final String CREATE_TABLE_PARTICIPANTS = "CREATE TABLE PARTICIPANTS (participant_id INTEGER PRIMARY KEY, participant_identification_type TEXT, participant_identification_id INTEGER, participant_name TEXT, FOREIGN KEY(participant_id) REFERENCES TESTS(participant_id))";

    public void RegisterDataDefaultParticipant(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getWritableDatabase();

        ArrayList<String> InsertParticipants;
        InsertParticipants = new ArrayList<>();

        InsertParticipants.add("INSERT INTO PARTICIPANTS (participant_id, participant_identification_type, participant_identification_id, participant_name) VALUES (1, 'CC', 1024510107, 'Juan David Suarez')");

        for (int i = 0; i<InsertParticipants.size();i++){
            db.execSQL(InsertParticipants.get(i));
        }

        db.close();
    }


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

    public Cursor GetParticipantDocumentTypeByTestCode(SQLiteConnectionHelper conn, String testCode) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT participant_identification_type FROM PARTICIPANTS WHERE participant_id = (SELECT participant_id FROM TESTS WHERE test_code = '"+testCode+"')",null);

        return cursor;
    }

    public Cursor GetParticipantDocumentIdByTestCode(SQLiteConnectionHelper conn, String testCode) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT participant_identification_id FROM PARTICIPANTS WHERE participant_id = (SELECT participant_id FROM TESTS WHERE test_code = '"+testCode+"')",null);

        return cursor;
    }

    public Cursor GetParticipantNameByTestCode(SQLiteConnectionHelper conn, String testCode) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT participant_name FROM PARTICIPANTS WHERE participant_id = (SELECT participant_id FROM TESTS WHERE test_code = '"+testCode+"')",null);

        return cursor;
    }

    public Cursor GetParticipantsByRoom(SQLiteConnectionHelper conn, String roomId) {
        int IntRoomId = Integer.parseInt(roomId);

        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM TESTS WHERE room_id = "+IntRoomId+"",null);

        return cursor;
    }

    public Cursor GetPresentParticipantsByRoom(SQLiteConnectionHelper conn, String roomId) {
        int IntRoomId = Integer.parseInt(roomId);

        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM TESTS WHERE status_id = 5 AND room_id = "+IntRoomId+"",null);

        return cursor;
    }
}

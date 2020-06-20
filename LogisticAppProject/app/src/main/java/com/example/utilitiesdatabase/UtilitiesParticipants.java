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

        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name)VALUES(1,'CC',1024510107,'Juan David Suarez')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name)VALUES(2,'CC',1024632548,'Ediwn Jaime')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name)VALUES(3,'CC',1030245862,'Juan David Sarmiento')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name)VALUES(4,'CC',1018424585,'Jhon Jairo Monroy')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name)VALUES(5,'CC',1074787841,'Oscar Ivan Rincon Gonzalez')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name)VALUES(6,'CC',51236526,'Yenny ANdre Castro')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name)VALUES(7,'CC',10245365563,'Ivonne Lopez')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name)VALUES(8,'CC',1024215526,'Camilo Rincon Fernandez')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name)VALUES(9,'CC',1024365589,'Jeisson Fabian Ramos')");

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
}

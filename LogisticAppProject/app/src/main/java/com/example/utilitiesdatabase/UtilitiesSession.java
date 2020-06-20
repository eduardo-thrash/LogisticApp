package com.example.utilitiesdatabase;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class UtilitiesSession {

    public static final String CREATE_TABLE_SESSION = "CREATE TABLE SESSION (session_id INTEGER PRIMARY KEY, session_user_id INTEGER)";

    public void RegisterSessionPostLogin(SQLiteConnectionHelper conn, int userIdentification){

    }

    public boolean InsertSession(SQLiteConnectionHelper conn, String userIdentification) {

        int sessionUserId = Integer.parseInt(userIdentification);

        SQLiteDatabase db = conn.getWritableDatabase();

        ArrayList<String> InsertSession;
        InsertSession = new ArrayList<>();

        InsertSession.add("INSERT INTO SESSION (session_user_id) VALUES ((SELECT user_id FROM USERS WHERE user_identification = "+sessionUserId+"))");

        for (int i = 0; i<InsertSession.size();i++){
            db.execSQL(InsertSession.get(i));
        }

        db.close();

        return true;
    }

    public Cursor GetSession(SQLiteConnectionHelper conn, String userIdentification) {
        SQLiteDatabase db = conn.getReadableDatabase();

        int sessionUserId = Integer.parseInt(userIdentification);

        Cursor cursor = db.rawQuery("SELECT session_user_id FROM SESSION WHERE session_user_id = (SELECT user_id FROM USERS WHERE user_identification = "+sessionUserId+")",null);

        return cursor;
    }

    public Cursor GetSessionActive(SQLiteConnectionHelper conn) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT session_user_id FROM SESSION WHERE session_user_id",null);

        return cursor;
    }
}

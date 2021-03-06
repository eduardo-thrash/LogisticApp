package com.example.businessrules;

import android.database.Cursor;
import android.widget.Toast;

import com.example.utilitiesdatabase.SQLiteConnectionHelper;
import com.example.utilitiesdatabase.UtilitiesSession;

public class SessionBusinessRules {

    UtilitiesSession _utilitiesSession = new UtilitiesSession();


    public void CreateSession(SQLiteConnectionHelper conn, String userIdentification) {
        _utilitiesSession.InsertSession(conn, userIdentification);
    }

    public int ValidateSessionActive(SQLiteConnectionHelper conn, String userIdentification) {
        Cursor cursorValidateSessionActive = _utilitiesSession.GetSession(conn, userIdentification);

        int sessionUserId = 0;

        if (cursorValidateSessionActive.moveToFirst()) {
            sessionUserId = cursorValidateSessionActive.getInt(0);
        }

        return sessionUserId;
    }

    public int ValidateSessionActive(SQLiteConnectionHelper conn) {
        Cursor cursorValidateSessionActive = _utilitiesSession.GetSessionActive(conn);

        int sessionUserId = 0;

        if (cursorValidateSessionActive.moveToFirst()) {
            sessionUserId = cursorValidateSessionActive.getInt(0);
        }

        return sessionUserId;
    }

    public boolean DestroySession(SQLiteConnectionHelper conn){

        int sessions = ValidateSessionActive(conn);

        if(_utilitiesSession.DeleteSession(conn)){

            if(ValidateSessionActive(conn) == 0){
                return true;
            }else{
                return false;
            }
        }

        return false;
    }
}

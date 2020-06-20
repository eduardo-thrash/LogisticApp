package com.example.businessrules;

import android.database.Cursor;

import com.example.utilitiesdatabase.SQLiteConnectionHelper;
import com.example.utilitiesdatabase.UtilitiesUsers;

import java.util.ArrayList;

public class UserBusinessRules {
    UtilitiesUsers _utilitiesUsers = new UtilitiesUsers();

    public int UserId;
    public String UserIdentification;
    public String UserPassword;
    public String UserName;
    public int UserRole;

    public boolean ValidateSession(SQLiteConnectionHelper conn, String userIdentification, String password){
        Cursor cursorValidateSession = _utilitiesUsers.getUsernameAndPassword(conn, Integer.parseInt(userIdentification) , password);

        String user = null;

        if (cursorValidateSession.moveToFirst()) {
            user = String.valueOf(cursorValidateSession.getString(0));
        }

        if (user!=null) {
            return true;
        }else{
            return false;
        }
    }

    public void UserUpdate(){}

    public String TestRoomBossByMaterialCode(SQLiteConnectionHelper conn, String materialCode) {

        Cursor cursorTestRoomBossByMaterialCode = _utilitiesUsers.GetTestRoomBossByMaterialCode(conn, materialCode);

        String testRoomBossByMaterialCode = null;

        if (cursorTestRoomBossByMaterialCode.moveToFirst()) {
            testRoomBossByMaterialCode = String.valueOf(cursorTestRoomBossByMaterialCode.getString(0));
        }

        return testRoomBossByMaterialCode;
    }
}

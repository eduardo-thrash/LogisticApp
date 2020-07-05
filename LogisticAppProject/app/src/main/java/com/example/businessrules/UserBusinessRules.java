package com.example.businessrules;

import android.database.Cursor;
import android.widget.Toast;

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
        try{
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
        }catch(Exception e){
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


    public void PasswordChange(SQLiteConnectionHelper conn, int userIdSession, String newPassword) {
        _utilitiesUsers.UpdateUserPassword(conn, userIdSession, newPassword);
    }

    public String UserNameByUser(SQLiteConnectionHelper conn, int userId) {
        Cursor cursorUserNameByUser = _utilitiesUsers.GetUserNameByUser(conn, userId);

        String UserName = null;

        if (cursorUserNameByUser.moveToFirst()) {
            UserName = String.valueOf(cursorUserNameByUser.getString(0));
        }

        return UserName;
    }
}

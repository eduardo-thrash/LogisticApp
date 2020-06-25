package com.example.utilitiesdatabase;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class UtilitiesRoles {
    public static final String UsersTable = "ROLES";
    public static final String fieldRoleId = "role_id";
    public static final String fieldRoleName = "role_name";

    public static final String CREATE_TABLE_ROLES = "CREATE TABLE ROLES (role_id INTEGER PRIMARY KEY, role_name TEXT, FOREIGN KEY(role_id) REFERENCES USERS(role_id))";

    public void RegisterDataDefaultRoles(SQLiteConnectionHelper conn){

        SQLiteDatabase db = conn.getWritableDatabase();

        ArrayList<String> InsertRoles;
        InsertRoles = new ArrayList<>();

        InsertRoles.add("INSERT INTO ROLES (role_id, role_name) VALUES (1, 'distributor')");
        InsertRoles.add("INSERT INTO ROLES (role_id, role_name) VALUES (2, 'delegado')");
        InsertRoles.add("INSERT INTO ROLES (role_id, role_name) VALUES (3, 'jefe de salón')");
        InsertRoles.add("INSERT INTO ROLES (role_id, role_name) VALUES (4, 'coordinador')");

        for (int i = 0; i<InsertRoles.size();i++){
            db.execSQL(InsertRoles.get(i));
        }

        db.close();
    }


    public String GetRole(SQLiteConnectionHelper conn, String userIdentification) {

        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursorRole = db.rawQuery("SELECT role_name FROM ROLES WHERE role_id = (SELECT role_id FROM USERS WHERE user_identification = "+userIdentification+")",null);

        String roleName = null;

        if (cursorRole.moveToFirst()) {
            roleName = String.valueOf(cursorRole.getString(0));
        }

        return roleName;
    }

    public String GetRole(SQLiteConnectionHelper conn, int userIdSession) {

        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursorRole = db.rawQuery("SELECT role_name FROM ROLES WHERE role_id = (SELECT role_id FROM USERS WHERE user_id = "+userIdSession+")",null);

        String roleName = null;

        if (cursorRole.moveToFirst()) {
            roleName = String.valueOf(cursorRole.getString(0));
        }

        return roleName;
    }
}

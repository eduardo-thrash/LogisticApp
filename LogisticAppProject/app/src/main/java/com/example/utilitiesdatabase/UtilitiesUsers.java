package com.example.utilitiesdatabase;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class UtilitiesUsers {
    public static final String UsersTable = "USERS";
    public static final String fieldUserId = "user_id";
    public static final String user_type_identification = "user_type_identification";
    public static final String user_identification = "user_identification";
    public static final String user_name = "user_name";
    public static final String user_password = "user_password";
    public static final String user_phone = "user_phone";
    public static final String role_id = "role_id";
    public static final String site_id = "site_id";

    public static final String CREATE_TABLE_USERS = "CREATE TABLE USERS (user_id INTEGER PRIMARY KEY, user_type_identification TEXT, user_identification INTEGER, user_name TEXT, user_password TEXT, user_phone TEXT, role_id INTEGER, site_id INTEGER, FOREIGN KEY(user_id) REFERENCES MATERIALS(user_id), FOREIGN KEY(user_id) REFERENCES DEPARTURES(user_id), FOREIGN KEY(user_id) REFERENCES SESSION(session_user_id))";

    public void RegisterDataDefaultUsers(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getWritableDatabase();

        ArrayList<String> InsertUsers;
        InsertUsers = new ArrayList<>();

        InsertUsers.add("INSERT INTO USERS (user_id, user_type_identification, user_identification, user_name, user_password, user_phone, role_id, site_id) VALUES (1,'CC',51023654,'Edwin Diaz','123456','7654321',1,1)");
        InsertUsers.add("INSERT INTO USERS (user_id, user_type_identification, user_identification, user_name, user_password, user_phone, role_id, site_id) VALUES (2,'CC',79254130,'Eduardo Montenegro','123456','6254103',2,2)");
        InsertUsers.add("INSERT INTO USERS (user_id, user_type_identification, user_identification, user_name, user_password, user_phone, role_id, site_id) VALUES (3,'CC',1030564789,'Ruben Rubio','123456','4735612',3,3)");
        InsertUsers.add("INSERT INTO USERS (user_id, user_type_identification, user_identification, user_name, user_password, user_phone, role_id, site_id) VALUES (4,'CC',45789651,'Sandra Celis','123456','9410251',4,4)");
        InsertUsers.add("INSERT INTO USERS (user_id, user_type_identification, user_identification, user_name, user_password, user_phone, role_id, site_id) VALUES (5,'CC',53041941,'Leidi Bernal','123456','7841002',4,4)");


        for (int i = 0; i<InsertUsers.size();i++){
            db.execSQL(InsertUsers.get(i));
        }

        db.close();
    }

    public Cursor GetTestRoomBossByMaterialCode(SQLiteConnectionHelper conn, String materialCode) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT user_name FROM USERS WHERE user_id = (SELECT material_user_room FROM MATERIALS  WHERE material_code = '"+materialCode+"')",null);

        return cursor;
    }

    public Cursor getUsernameAndPassword(SQLiteConnectionHelper conn, int userIdentification, String password) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT user_identification FROM USERS WHERE user_identification = "+userIdentification+" AND user_password = '"+password+"'",null);

        return cursor;
    }

    public void UpdateUserPassword(SQLiteConnectionHelper conn, int userIdSession, String newPassword) {
        SQLiteDatabase db = conn.getWritableDatabase();

        db.execSQL("PRAGMA foreign_keys = OFF");
        db.execSQL("UPDATE USERS SET user_password = '"+newPassword+"' WHERE user_id = "+userIdSession+"");
    }

    public Cursor GetUserNameByUser(SQLiteConnectionHelper conn, int userId) {
        SQLiteDatabase db = conn.getWritableDatabase();

        Cursor cursor = db.rawQuery("SELECT user_name FROM USERS WHERE user_id = "+userId+"",null);

        return cursor;
    }
}

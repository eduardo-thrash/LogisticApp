package com.example.utilitiesdatabase;

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

    public static final String CREATE_TABLE_USERS = "CREATE TABLE USERS (user_id INTEGER PRIMARY KEY, user_type_identification TEXT, user_identification TEXT, user_name TEXT, user_password TEXT, user_phone TEXT, role_id INTEGER, site_id INTEGER, FOREIGN KEY(user_id) REFERENCES MATERIALS(user_id), FOREIGN KEY(user_id) REFERENCES DEPARTURES(user_id))";

    public void RegisterDataDefaultUsers(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getWritableDatabase();

        ArrayList<String> InsertUsers;
        InsertUsers = new ArrayList<>();

        InsertUsers.add("INSERT INTO USERS (user_id, user_type_identification, user_identification, user_name, user_password, user_phone, role_id, site_id) VALUES (1, 'CC', '1030265663', 'Laura Zabaleta', '123456', '7192479', 1,1)");
        InsertUsers.add("INSERT INTO USERS (user_id, user_type_identification, user_identification, user_name, user_password, user_phone, role_id, site_id) VALUES (2, 'CC', '19301325', 'Isabella Rodriguez Zabaleta', '123456', '7192479', 2,1)");
        InsertUsers.add("INSERT INTO USERS (user_id, user_type_identification, user_identification, user_name, user_password, user_phone, role_id, site_id) VALUES (3, 'CC', '13644221', 'Lina Avila', 123456, '7192479', 3,1)");
        InsertUsers.add("INSERT INTO USERS (user_id, user_type_identification, user_identification, user_name, user_password, user_phone, role_id, site_id) VALUES (4, 'CC', '19301335', 'Felipe Hernandez', '123456', '7192479', 1,1)");
        InsertUsers.add("INSERT INTO USERS (user_id, user_type_identification, user_identification, user_name, user_password, user_phone, role_id, site_id) VALUES (5, 'CC', '51235541', 'Mario Avendaño', '123456', '7192479', 4,1)");
        InsertUsers.add("INSERT INTO USERS (user_id, user_type_identification, user_identification, user_name, user_password, user_phone, role_id, site_id) VALUES (6, 'CC', '1024536857', 'Hair Gonzalez', '123456', '7192479', 2,1)");
        InsertUsers.add("INSERT INTO USERS (user_id, user_type_identification, user_identification, user_name, user_password, user_phone, role_id, site_id) VALUES (7, 'CC', '1030457411', 'Edwin Quitora', '123456', '7192479', 3,1)");
        InsertUsers.add("INSERT INTO USERS (user_id, user_type_identification, user_identification, user_name, user_password, user_phone, role_id, site_id) VALUES (8, 'CC', '1014257222', 'Felix Gutierrez', '123456', '7192479', 2,1)");
        InsertUsers.add("INSERT INTO USERS (user_id, user_type_identification, user_identification, user_name, user_password, user_phone, role_id, site_id) VALUES (9, 'CC', '1014985452', 'Cristian Luna', '123456', '7192479', 2,1)");

        for (int i = 0; i<InsertUsers.size();i++){
            db.execSQL(InsertUsers.get(i));
        }

        db.close();
    }
}

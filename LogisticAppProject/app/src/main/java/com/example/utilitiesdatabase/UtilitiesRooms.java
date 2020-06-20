package com.example.utilitiesdatabase;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class UtilitiesRooms {


    public static final String RoomTable = "ROOMS";
    public static final String fieldRoomId = "room_id";
    public static final String fieldRoomName = "room_name";
    public static final String fieldRoomSiteId = "site_id";

    public static final String CREATE_TABLE_ROOMS = "CREATE TABLE ROOMS (room_id INTEGER PRIMARY KEY, room_name TEXT, site_id INTEGER)";

    public void RegisterDataDefaultRooms(SQLiteConnectionHelper conn){

        SQLiteDatabase db = conn.getWritableDatabase();

        ArrayList<String> InsertRooms;
        InsertRooms = new ArrayList<>();
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (1,'salón 101',1)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (2,'salón 102',1)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (3,'salón 103',1)");

        for (int i = 0; i<InsertRooms.size();i++){
            db.execSQL(InsertRooms.get(i));
        }

        db.close();
    }

    public Cursor GetRoomsBySite(SQLiteConnectionHelper conn){

        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM ROOMS",null);

        return cursor;
    }
}

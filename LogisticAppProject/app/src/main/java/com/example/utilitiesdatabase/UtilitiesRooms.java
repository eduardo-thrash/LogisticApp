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

        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (1,'A010',1)");

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

    public Cursor GetRoomNameByUser(SQLiteConnectionHelper conn, int userRoomBossIdSession) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT room_name FROM ROOMS R JOIN SITES S ON R.site_id = S.site_id WHERE S.site_id = (SELECT M.site_id FROM MATERIALS M WHERE material_user_room = "+userRoomBossIdSession+")",null);

        return cursor;
    }

    public Cursor GetRoomIdByUser(SQLiteConnectionHelper conn, int userRoomBossIdSession) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT room_id FROM ROOMS R JOIN SITES S ON R.site_id = S.site_id WHERE S.site_id = (SELECT M.site_id FROM MATERIALS M WHERE material_user_room = "+userRoomBossIdSession+")",null);

        return cursor;
    }
    public Cursor SelectRoomIdByName(SQLiteConnectionHelper conn, String roomNameSelected) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT room_id FROM ROOMS WHERE room_name = '"+roomNameSelected+"'",null);

        return cursor;
    }

    public ArrayList<String> SelectRoomListBySiteName(SQLiteConnectionHelper conn, String siteName) {
        ArrayList<String> RoomsResult = new ArrayList<String>();

        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor c = db.rawQuery("SELECT room_name FROM ROOMS WHERE site_id = (SELECT site_id FROM SITES WHERE site_name = '"+siteName+"')",null);

        while(c.moveToNext()){
            RoomsResult.add(c.getString(0));
        }

        return RoomsResult;
    }

}


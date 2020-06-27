package com.example.businessrules;

import android.database.Cursor;

import com.example.utilitiesdatabase.SQLiteConnectionHelper;
import com.example.utilitiesdatabase.UtilitiesRooms;

public class RoomBusinessRules {
    public int NumberTest;
    public int MissingTest;
    public int AdditionalTest;
    public int ParticipantsNumber;
    public int PresentParticipants;
    public int MissingParticipants;
    public int CanceledTest;

    public void GetSRoomResume(){}

    UtilitiesRooms _utilitiesRooms = new UtilitiesRooms();

    public int CountRoomsBySite(SQLiteConnectionHelper conn){
        return _utilitiesRooms.GetRoomsBySite(conn).getCount();
    }

    public String RoomNameByUser(SQLiteConnectionHelper conn, int userRoomBossIdSession) {
        Cursor cursorGetRoomNameByUser = _utilitiesRooms.GetRoomNameByUser(conn, userRoomBossIdSession);

        String roomName = null;

        if (cursorGetRoomNameByUser.moveToFirst()) {
            roomName = String.valueOf(cursorGetRoomNameByUser.getString(0));
        }

        return roomName;
    }

    public String RoomIdByUser(SQLiteConnectionHelper conn, int userRoomBossIdSession) {
        Cursor cursorGetRoomIdByUser = _utilitiesRooms.GetRoomIdByUser(conn, userRoomBossIdSession);

        String roomId = null;

        if (cursorGetRoomIdByUser.moveToFirst()) {
            roomId = String.valueOf(cursorGetRoomIdByUser.getString(0));
        }

        return roomId;
    }

    public String GetRoomIdByName(SQLiteConnectionHelper conn, String roomNameSelected) {
        Cursor cursorRoomIdByName = _utilitiesRooms.SelectRoomIdByName(conn, roomNameSelected);

        String roomName = null;

        if (cursorRoomIdByName.moveToFirst()) {
            roomName = String.valueOf(cursorRoomIdByName.getString(0));
        }

        return roomName;
    }
}

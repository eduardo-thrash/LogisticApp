package com.example.businessrules;

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
}

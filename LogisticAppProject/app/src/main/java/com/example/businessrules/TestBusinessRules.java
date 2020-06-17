package com.example.businessrules;

import com.example.utilitiesdatabase.SQLiteConnectionHelper;
import com.example.utilitiesdatabase.UtilitiesTests;

public class TestBusinessRules {
    public int IdSite;
    public String RoomUser;
    public String RoomName;
    public String TestCode;
    public int TestStatus;
    public int ParticipantId;
    public String ParticipantName;

    public void GetTest(){}
    public void GetTestDetails(){}
    public void TestStatusUpdate(){}

    UtilitiesTests _utilitiesTests = new UtilitiesTests();

    public int CountPresentParticipants(SQLiteConnectionHelper conn){
        return _utilitiesTests.GetPresentParticipants(conn).getCount();
    }
}

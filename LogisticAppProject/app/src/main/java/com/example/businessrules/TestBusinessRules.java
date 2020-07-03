package com.example.businessrules;

import android.database.Cursor;

import com.example.utilitiesdatabase.SQLiteConnectionHelper;
import com.example.utilitiesdatabase.UtilitiesNotificationTestType;
import com.example.utilitiesdatabase.UtilitiesTests;

import java.util.ArrayList;

public class TestBusinessRules {

    UtilitiesTests _utilitiesTests = new UtilitiesTests();

    ArrayList<String> TestInfo;

    public int IdSite;
    public String RoomUser;
    public String RoomName;
    public String TestCode;
    public int TestStatus;
    public String TestStatusName;
    public int ParticipantId;
    public String ParticipantName;

    public String getTestStatusName() {
        return TestStatusName;
    }

    public void setTestStatusName(String testStatusName) {
        TestStatusName = testStatusName;
    }

    public int getIdSite() {
        return IdSite;
    }

    public void setIdSite(int idSite) {
        IdSite = idSite;
    }

    public String getRoomUser() {
        return RoomUser;
    }

    public void setRoomUser(String roomUser) {
        RoomUser = roomUser;
    }

    public String getRoomName() {
        return RoomName;
    }

    public void setRoomName(String roomName) {
        RoomName = roomName;
    }

    public String getTestCode() {
        return TestCode;
    }

    public void setTestCode(String testCode) {
        TestCode = testCode;
    }

    public int getTestStatus() {
        return TestStatus;
    }

    public void setTestStatus(int testStatus) {
        TestStatus = testStatus;
    }

    public int getParticipantId() {
        return ParticipantId;
    }

    public void setParticipantId(int participantId) {
        ParticipantId = participantId;
    }

    public String getParticipantName() {
        return ParticipantName;
    }

    public void setParticipantName(String participantName) {
        ParticipantName = participantName;
    }


    UtilitiesNotificationTestType _utilitiesNotificationTestType = new UtilitiesNotificationTestType();

    public int CountPresentParticipants(SQLiteConnectionHelper conn) {
        return _utilitiesTests.GetPresentParticipants(conn).getCount();
    }

    public ArrayList<String> ListTestCode(SQLiteConnectionHelper conn) {
        ArrayList<String> DepartmentsResult = new ArrayList<String>();

        Cursor cursorTestCode = _utilitiesTests.GetTestCode(conn);

        DepartmentsResult.add("Seleccione");
        while (cursorTestCode.moveToNext()) {
            DepartmentsResult.add(cursorTestCode.getString(0));
        }

        return DepartmentsResult;
    }



    public String InfoStatusTest(SQLiteConnectionHelper conn, String statusCode) {
        Cursor cursorTestCode = _utilitiesTests.GetTestStatus(conn, statusCode);

        String codeStatus = null;

        if (cursorTestCode.moveToFirst()) {
            codeStatus = String.valueOf(cursorTestCode.getString(0));
        }

        return codeStatus;
    }

    public String InfoTestId(SQLiteConnectionHelper conn, String testCode) {
        Cursor cursorTestId = _utilitiesTests.GetTestId(conn, testCode);

        String codeId = null;

        if (cursorTestId.moveToFirst()) {
            codeId = String.valueOf(cursorTestId.getString(0));
        }

        return codeId;
    }

    public String TestNumberByMaterialCode(SQLiteConnectionHelper conn, String materialCode) {
        Cursor cursorTestNumberByMaterialCode = _utilitiesTests.GetTestNumberByMaterialCode(conn, materialCode);

        return String.valueOf(cursorTestNumberByMaterialCode.getCount());
    }


    public String SearchTestByCode(SQLiteConnectionHelper conn, String contents) {
        Cursor cursorSearchTestByCode = _utilitiesTests.GetTestByCode(conn, contents);

        String testCode = null;

        if (cursorSearchTestByCode.moveToFirst()) {
            testCode = String.valueOf(cursorSearchTestByCode.getString(0));
        }

        return testCode;
    }

    public ArrayList<String> TestListByUser(SQLiteConnectionHelper conn, int userRoomBossIdSession) {
        ArrayList<TestBusinessRules> testList = _utilitiesTests.GetTestListByUser(conn, userRoomBossIdSession);

        TestInfo = new ArrayList<String>();

        for (int i=0; i<testList.size(); i++){
            TestInfo.add("Codigo Examen: "+testList.get(i).getTestCode()+"\nEstado: "+testList.get(i).getTestStatusName());
        }

        return TestInfo;
    }

    public int TestQuantityByRoom(SQLiteConnectionHelper conn, String roomId) {
        return _utilitiesTests.TestQuantityByRoom(conn, roomId).getCount();
    }

    public void TestStatusUpdateByScan(SQLiteConnectionHelper conn, String testCode) {
        _utilitiesTests.TestStatusUpdateByScan(conn, testCode);
    }
}

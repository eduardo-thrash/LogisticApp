package com.example.businessrules;

import android.database.Cursor;

import com.example.utilitiesdatabase.SQLiteConnectionHelper;
import com.example.utilitiesdatabase.UtilitiesNotificationTestType;
import com.example.utilitiesdatabase.UtilitiesTests;

import java.util.ArrayList;

public class TestBusinessRules {

    public int IdSite;
    public String RoomUser;
    public String RoomName;
    public String TestCode;
    public int TestStatus;
    public int ParticipantId;
    public String ParticipantName;

    public void GetTest() {
    }

    public void GetTestDetails() {
    }

    public void TestStatusUpdate() {
    }

    UtilitiesTests _utilitiesTests = new UtilitiesTests();
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


}

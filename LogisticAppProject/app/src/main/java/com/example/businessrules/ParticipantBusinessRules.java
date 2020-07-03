package com.example.businessrules;

import android.database.Cursor;

import com.example.utilitiesdatabase.SQLiteConnectionHelper;
import com.example.utilitiesdatabase.UtilitiesParticipants;

public class ParticipantBusinessRules {

    UtilitiesParticipants _utilitiesParticipants = new UtilitiesParticipants();

    public int ParticipantId;
    public String ParticipantIdentificationType;
    public String ParticipantIdentification;
    public String ParticipantName;
    public int TestId;

    public int CountParticipantsBySite(SQLiteConnectionHelper conn){
        return _utilitiesParticipants.GetParticipantsBySite(conn).getCount();
    }

    public String ParticipantDocumentTypeByTestCode(SQLiteConnectionHelper conn, String testCode) {
        Cursor cursorParticipantDocumentTypeByTestCode = _utilitiesParticipants.GetParticipantDocumentTypeByTestCode(conn, testCode);

        String participantDocumentTypeByTestCode = null;

        if (cursorParticipantDocumentTypeByTestCode.moveToFirst()) {
            participantDocumentTypeByTestCode = String.valueOf(cursorParticipantDocumentTypeByTestCode.getString(0));
        }

        return participantDocumentTypeByTestCode;
    }

    public String ParticipantDocumentIdByTestCode(SQLiteConnectionHelper conn, String testCode) {
        Cursor cursorParticipantDocumentIdByTestCode = _utilitiesParticipants.GetParticipantDocumentIdByTestCode(conn, testCode);

        String participantDocumentIdByTestCode = null;

        if (cursorParticipantDocumentIdByTestCode.moveToFirst()) {
            participantDocumentIdByTestCode = String.valueOf(cursorParticipantDocumentIdByTestCode.getString(0));
        }

        return participantDocumentIdByTestCode;
    }

    public String ParticipantNameByTestCode(SQLiteConnectionHelper conn, String testCode) {
        Cursor cursorParticipantNameByTestCode = _utilitiesParticipants.GetParticipantNameByTestCode(conn, testCode);

        String participantNameByTestCodee = null;

        if (cursorParticipantNameByTestCode.moveToFirst()) {
            participantNameByTestCodee = String.valueOf(cursorParticipantNameByTestCode.getString(0));
        }

        return participantNameByTestCodee;
    }

    public int ParticipantsByRoom(SQLiteConnectionHelper conn, String roomId) {
        return _utilitiesParticipants.GetParticipantsByRoom(conn, roomId).getCount();
    }

    public int PresentParticipantsByRoom(SQLiteConnectionHelper conn, String roomId) {
        return _utilitiesParticipants.GetPresentParticipantsByRoom(conn, roomId).getCount();
    }

    public int CountParticipantsBySiteName(SQLiteConnectionHelper conn, String siteNameSiteDetail) {
        return _utilitiesParticipants.GetParticipantsBySiteName(conn, siteNameSiteDetail).getCount();
    }
}

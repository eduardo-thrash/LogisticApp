package com.example.businessrules;

import android.database.Cursor;

import com.example.utilitiesdatabase.SQLiteConnectionHelper;
import com.example.utilitiesdatabase.UtilitiesNotificationMaterial;
import com.example.utilitiesdatabase.UtilitiesNotificationTest;
import com.example.utilitiesdatabase.UtilitiesNotificationTestType;

import java.util.ArrayList;

public class NotificationBusinessRules {
    public String MaterialCode;
    public String NotificationTypeName;
    public String NotificationTypeDescription;
    public String TestCode;

    public void NotificationMaterialCreate(){}
    public void NotificationTestCreate(){}
    public void GetNotificationByRoom(){}
    public void GetNotificationBySite(){}

    UtilitiesNotificationMaterial _utilitiesNotificationMaterial = new UtilitiesNotificationMaterial();
    UtilitiesNotificationTest _utilitiesNotificationTest = new UtilitiesNotificationTest();

    UtilitiesNotificationTestType _utilitiesNotificationTestType = new UtilitiesNotificationTestType();

    public int CountMissingMaterialBySite(SQLiteConnectionHelper conn){
        return _utilitiesNotificationMaterial.GetMissingMaterialBySite(conn).getCount();
    }

    public int CountAdditionalMaterialBySite(SQLiteConnectionHelper conn){
        return _utilitiesNotificationMaterial.GetAdditionalMaterialBySite(conn).getCount();
    }

    public int CountMissingPersonalBySite(SQLiteConnectionHelper conn){
        return _utilitiesNotificationMaterial.GetMissingPersonalBySite(conn).getCount();
    }

    ;

    public int CountMissingParticipants(SQLiteConnectionHelper conn){
        return _utilitiesNotificationTest.GetMissingParticipants(conn).getCount();
    }

    public int CountCancelTest(SQLiteConnectionHelper conn){
        return _utilitiesNotificationTest.GetCancelTest(conn).getCount();
    }

    public ArrayList<String> ListTestNotificationType(SQLiteConnectionHelper conn){
        ArrayList<String> NotificationTypeResult = new ArrayList<String>();

        Cursor cursorTestNotificationType = _utilitiesNotificationTestType.GetNotificationTestType(conn);

        NotificationTypeResult.add("Seleccione");
        while (cursorTestNotificationType.moveToNext()) {
            NotificationTypeResult.add(cursorTestNotificationType.getString(0));
        }

        return NotificationTypeResult;
    }

    public String InfoTestNotificationTypeId(SQLiteConnectionHelper conn, String testNotificationTypeName) {
        Cursor cursorTestNotificationTypeId = _utilitiesNotificationTestType.GetTestNotificationTypeId(conn, testNotificationTypeName);

        String codeId = null;

        if (cursorTestNotificationTypeId.moveToFirst()) {
            codeId = String.valueOf(cursorTestNotificationTypeId.getString(0));
        }

        return codeId;
    }

    public boolean SaveTestNotification(SQLiteConnectionHelper conn, String testId, String testNotificationType, String testDescription) {

        if(testId!=null && testNotificationType!=null && testDescription!=null){
            return _utilitiesNotificationTest.CreateNotificationTest(conn,testId,testNotificationType,testDescription);
        }else{
            return false;
        }
    }
}

package com.example.businessrules;

import android.database.Cursor;

import com.example.utilitiesdatabase.SQLiteConnectionHelper;
import com.example.utilitiesdatabase.UtilitiesNotificationMaterial;
import com.example.utilitiesdatabase.UtilitiesNotificationTest;

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

    public int CountMissingMaterialBySite(SQLiteConnectionHelper conn){
        return _utilitiesNotificationMaterial.GetMissingMaterialBySite(conn).getCount();
    }

    public int CountAdditionalMaterialBySite(SQLiteConnectionHelper conn){
        return _utilitiesNotificationMaterial.GetAdditionalMaterialBySite(conn).getCount();
    }

    public int CountMissingPersonalBySite(SQLiteConnectionHelper conn){
        return _utilitiesNotificationMaterial.GetMissingPersonalBySite(conn).getCount();
    }

    UtilitiesNotificationTest _utilitiesNotificationTest = new UtilitiesNotificationTest();

    public int CountMissingParticipants(SQLiteConnectionHelper conn){
        return _utilitiesNotificationTest.GetMissingParticipants(conn).getCount();
    }

    public int CountCancelTest(SQLiteConnectionHelper conn){
        return _utilitiesNotificationTest.GetCancelTest(conn).getCount();
    }
}

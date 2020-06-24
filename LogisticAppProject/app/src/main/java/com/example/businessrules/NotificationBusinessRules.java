package com.example.businessrules;

import android.database.Cursor;

import com.example.utilitiesdatabase.SQLiteConnectionHelper;
import com.example.utilitiesdatabase.UtilitiesNotificationMaterial;
import com.example.utilitiesdatabase.UtilitiesNotificationMaterialType;
import com.example.utilitiesdatabase.UtilitiesNotificationTest;
import com.example.utilitiesdatabase.UtilitiesNotificationTestType;

import java.util.ArrayList;

public class NotificationBusinessRules {

    ArrayList<String> NotificationTestInfo;
    public String MaterialCode;
    public String NotificationTestTypeName;
    public String NotificationTestTypeDescription;
    public String TestCode;

    public String getNotificationTestTypeName() {
        return NotificationTestTypeName;
    }

    public void setNotificationTestTypeName(String notificationTestTypeName) {
        NotificationTestTypeName = notificationTestTypeName;
    }

    public String getNotificationTestTypeDescription() {
        return NotificationTestTypeDescription;
    }

    public void setNotificationTestTypeDescription(String notificationTestTypeDescription) {
        NotificationTestTypeDescription = notificationTestTypeDescription;
    }

    public String getTestCode() {
        return TestCode;
    }

    public void setTestCode(String testCode) {
        TestCode = testCode;
    }

    public void NotificationMaterialCreate(){}
    public void NotificationTestCreate(){}
    public void GetNotificationByRoom(){}
    public void GetNotificationBySite(){}

    UtilitiesNotificationMaterial _utilitiesNotificationMaterial = new UtilitiesNotificationMaterial();
    UtilitiesNotificationTest _utilitiesNotificationTest = new UtilitiesNotificationTest();

    UtilitiesNotificationTestType _utilitiesNotificationTestType = new UtilitiesNotificationTestType();
    UtilitiesNotificationMaterialType _utilitiesNotificationMaterialType = new UtilitiesNotificationMaterialType();

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

    public ArrayList<String> MaterialNotificationTypeList(SQLiteConnectionHelper conn) {
        ArrayList<String> MaterialNotificationTypeListResult = new ArrayList<String>();

        Cursor cursorMaterialNotificationTypeListResult = _utilitiesNotificationMaterialType.GetMaterialNotificationTypeList(conn);

        MaterialNotificationTypeListResult.add("Seleccione");
        while (cursorMaterialNotificationTypeListResult.moveToNext()) {
            MaterialNotificationTypeListResult.add(cursorMaterialNotificationTypeListResult.getString(0));
        }

        return MaterialNotificationTypeListResult;
    }

    public String InfoMaterialNotificationTypeId(SQLiteConnectionHelper conn, String materialNotificationType) {
        Cursor cursorInfoMaterialNotificationTypeId = _utilitiesNotificationMaterialType.GetInfoMaterialNotificationTypeId(conn, materialNotificationType);

        String TypeId = null;

        if (cursorInfoMaterialNotificationTypeId.moveToFirst()) {
            TypeId = String.valueOf(cursorInfoMaterialNotificationTypeId.getString(0));
        }

        return TypeId;
    }

    public boolean SaveMaterialNotification(SQLiteConnectionHelper conn, String materialId, String materialNotificationType, String materialDescription) {
        if(materialId!=null && materialNotificationType!=null && materialDescription!=null){
            return _utilitiesNotificationMaterial.CreateMaterialNotification(conn,materialId,materialNotificationType,materialDescription);
        }else{
            return false;
        }
    }

    public ArrayList<String> ListTestNotificationByRoom(SQLiteConnectionHelper conn, int userRoomBossIdSession) {
        ArrayList<NotificationBusinessRules> testNotificationList = _utilitiesNotificationTest.GetListTestNotificationByRoom(conn, userRoomBossIdSession);

        NotificationTestInfo = new ArrayList<String>();

        for (int i=0; i<testNotificationList.size(); i++){
            NotificationTestInfo.add("Codigo Examen: "+testNotificationList.get(i).getTestCode()+"\n\nTipo de novedad: "+testNotificationList.get(i).getNotificationTestTypeName()+"\nDescripción: "+testNotificationList.get(i).getNotificationTestTypeDescription()+"\n");
        }

        return NotificationTestInfo;
    }
}

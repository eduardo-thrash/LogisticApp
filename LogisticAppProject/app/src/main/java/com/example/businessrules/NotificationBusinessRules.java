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
    RoomBusinessRules _roomBusinessRules = new RoomBusinessRules();
    SiteBusinessRules _siteBusinessRules = new SiteBusinessRules();

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

    public ArrayList<String> ListTestNotificationByRoom(SQLiteConnectionHelper conn, String RoomName) {

        final String RoomId = _roomBusinessRules.GetRoomIdByName(conn, RoomName);

        ArrayList<NotificationBusinessRules> testNotificationList = _utilitiesNotificationTest.GetListNotificationByRoom(conn, Integer.parseInt(RoomId));

        NotificationTestInfo = new ArrayList<String>();

        for (int i=0; i<testNotificationList.size(); i++){
            NotificationTestInfo.add("Codigo Examen: "+testNotificationList.get(i).getTestCode()+"\n\nTipo de novedad: "+testNotificationList.get(i).getNotificationTestTypeName()+"\nDescripción: "+testNotificationList.get(i).getNotificationTestTypeDescription()+"\n");
        }

        return NotificationTestInfo;
    }



    public int NotificationMissingTestQuantityByRoom(SQLiteConnectionHelper conn, String roomId) {
        return _utilitiesNotificationTest.GetNotificationMissingTestQuantityByRoom(conn, roomId).getCount();
    }

    public int NotificationAdditionalTestQuantityByRoom(SQLiteConnectionHelper conn, String roomId) {
        return _utilitiesNotificationTest.GetNotificationAdditionalTestQuantityByRoom(conn, roomId).getCount();
    }

    public int NotificationMissingParticipantsQuantityByRoom(SQLiteConnectionHelper conn, String roomId) {
        return _utilitiesNotificationTest.GetNotificationMissingParticipantsQuantityByRoom(conn, roomId).getCount();
    }

    public int NotificationCancelTestQuantityByRoom(SQLiteConnectionHelper conn, String roomId) {
        return _utilitiesNotificationTest.GetNotificationCancelTestQuantityByRoom(conn, roomId).getCount();
    }

    public ArrayList<String> ListTestNotification(SQLiteConnectionHelper conn, String siteName) {
        final String SiteId = _siteBusinessRules.GetSiteIdByName(conn, siteName);

        ArrayList<NotificationBusinessRules> testNotificationList = _utilitiesNotificationTest.GetListNotificationBySite(conn, Integer.parseInt(SiteId));

        NotificationTestInfo = new ArrayList<String>();

        for (int i=0; i<testNotificationList.size(); i++){
            NotificationTestInfo.add(testNotificationList.get(i).getTestCode());
        }

        return NotificationTestInfo;
    }

    public NotificationBusinessRules GetNotificationDetail(SQLiteConnectionHelper conn, String testCodeNotification) {

        NotificationBusinessRules notificationTest = new NotificationBusinessRules();
        NotificationBusinessRules NotificationDetail = new NotificationBusinessRules();

        Cursor cursorNotificationTestDetail = _utilitiesNotificationTest.SelectNotificationTestDetail(conn, testCodeNotification);

        while (cursorNotificationTestDetail.moveToNext()){
            notificationTest = new NotificationBusinessRules();

            notificationTest.setTestCode(cursorNotificationTestDetail.getString(0));
            notificationTest.setNotificationTestTypeName(cursorNotificationTestDetail.getString(1));
            notificationTest.setNotificationTestTypeDescription(cursorNotificationTestDetail.getString(2));

        }

        return notificationTest;
    }

    public int CountMissingMaterialBySiteName(SQLiteConnectionHelper conn, String siteNameSiteDetail) {
        return _utilitiesNotificationMaterial.SelectMissingMaterialBySite(conn, siteNameSiteDetail).getCount();
    }

    public int CountAdditionalMaterialBySiteName(SQLiteConnectionHelper conn, String siteNameSiteDetail) {
        return _utilitiesNotificationMaterial.SelectAdditionalMaterialBySiteName(conn, siteNameSiteDetail).getCount();
    }
}

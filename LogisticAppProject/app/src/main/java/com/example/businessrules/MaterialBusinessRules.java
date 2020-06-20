package com.example.businessrules;

import android.database.Cursor;

import com.example.utilitiesdatabase.SQLiteConnectionHelper;
import com.example.utilitiesdatabase.UtilitiesMaterials;

public class MaterialBusinessRules {

    UtilitiesMaterials _utilitiesMaterials = new UtilitiesMaterials();

    public int IdSite;
    public int IdUser;
    public String MaterialCode;
    public String MaterialStatus;
    public String SiteName;
    public String RoomUser;
    public int PackageQuantity;

    public void GetMaterial(){}
    public void GetMaterialDetails(){}
    public void MaterialStatusUpdate(){}

    public int getIdSite() {
        return IdSite;
    }

    public void setIdSite(int idSite) {
        IdSite = idSite;
    }

    public int getIdUser() {
        return IdUser;
    }

    public void setIdUser(int idUser) {
        IdUser = idUser;
    }

    public String getMaterialCode() {
        return MaterialCode;
    }

    public void setMaterialCode(String materialCode) {
        MaterialCode = materialCode;
    }

    public String getMaterialStatus() {
        return MaterialStatus;
    }

    public void setMaterialStatus(String materialStatus) {
        MaterialStatus = materialStatus;
    }

    public String getSiteName() {
        return SiteName;
    }

    public void setSiteName(String siteName) {
        SiteName = siteName;
    }

    public String getRoomUser() {
        return RoomUser;
    }

    public void setRoomUser(String roomUser) {
        RoomUser = roomUser;
    }

    public int getPackageQuantity() {
        return PackageQuantity;
    }

    public void setPackageQuantity(int packageQuantity) {
        PackageQuantity = packageQuantity;
    }

    public String SearchMaterialByCode(SQLiteConnectionHelper conn, String contents) {

        Cursor cursorMaterialByCode = _utilitiesMaterials.GetMaterialCode(conn, contents);

        String materialCode = null;

        if (cursorMaterialByCode.moveToFirst()) {
            materialCode = String.valueOf(cursorMaterialByCode.getString(0));
        }

        return materialCode;
    }

    public String PackageNumberByMaterialCode(SQLiteConnectionHelper conn, String materialCode) {
        Cursor cursorPackageNumberByMaterialCode = _utilitiesMaterials.GetPackageNumberByMaterialCode(conn, materialCode);

        String PackageNumber = null;

        if (cursorPackageNumberByMaterialCode.moveToFirst()) {
            PackageNumber = String.valueOf(cursorPackageNumberByMaterialCode.getString(0));
        }

        return PackageNumber;
    }

    public void MaterialStatusUpdateByScan(SQLiteConnectionHelper conn, String materialCode){

        _utilitiesMaterials.MaterialStatusUpdateByScan(conn, materialCode);
    }

    public String MaterialStatusByMaterialCode(SQLiteConnectionHelper conn, String materialCode) {
        Cursor cursorTestStatusByMaterialCode = _utilitiesMaterials.GetMaterialStatusByMaterialCode(conn, materialCode);

        String testStatusByMaterialCode = null;

        if (cursorTestStatusByMaterialCode.moveToFirst()) {
            testStatusByMaterialCode = String.valueOf(cursorTestStatusByMaterialCode.getString(0));
        }

        return testStatusByMaterialCode;
    }
}

package com.example.businessrules;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.utilitiesdatabase.SQLiteConnectionHelper;
import com.example.utilitiesdatabase.UtilitiesDepartments;
import com.example.utilitiesdatabase.UtilitiesDepartures;

import java.util.ArrayList;

public class DepartureBusinessRules {

    UtilitiesDepartures utilDeparture = new UtilitiesDepartures();

    public int DepartureId;
    public int DepartmentId;
    public int CityId;
    public int MaterialId;
    public int UserId;

    ArrayList<String> DepartureResult;
    ArrayList<String> MaterialInfo;

    public String MaterialStatusUpdate(){
        return "Material Status update";
    }

    public ArrayList<String> GetDepartures(SQLiteConnectionHelper conn, String cityName){

        ArrayList<MaterialBusinessRules> materialList = utilDeparture.getDepartureInfo(conn, cityName);

        MaterialInfo = new ArrayList<String>();

        for (int i=0; i<materialList.size(); i++){
            MaterialInfo.add("Codigo Material: "+materialList.get(i).getMaterialCode()+"\nEstado: "+materialList.get(i).getMaterialStatus());
        }

        return MaterialInfo;
    }

    public int getDepartureId() {
        return DepartureId;
    }

    public void setDepartureId(int departureId) {
        DepartureId = departureId;
    }

    public int getDepartmentId() {
        return DepartmentId;
    }

    public void setDepartmentId(int departmentId) {
        DepartmentId = departmentId;
    }

    public int getCityId() {
        return CityId;
    }

    public void setCityId(int cityId) {
        CityId = cityId;
    }

    public int getMaterialId() {
        return MaterialId;
    }

    public void setMaterialId(int materialId) {
        MaterialId = materialId;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }
}

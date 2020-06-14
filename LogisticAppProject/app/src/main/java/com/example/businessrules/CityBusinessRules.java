package com.example.businessrules;

import com.example.utilitiesdatabase.SQLiteConnectionHelper;
import com.example.utilitiesdatabase.UtilitiesCities;

import java.util.ArrayList;

public class CityBusinessRules {

    UtilitiesCities utilCity = new UtilitiesCities();

    ArrayList<String> CityNameResult;
    ArrayList<String> CityList = new ArrayList<String>();


    public ArrayList<String> getCitiesByName(SQLiteConnectionHelper conn, String departmentName){

        CityNameResult = utilCity.getCitiesNameByDepartment(conn, departmentName);

        CityList.add("Seleccione");
        for (int i=0; i<CityNameResult.size();i++){
            CityList.add(CityNameResult.get(i));
        }

        return CityList;
    }
}

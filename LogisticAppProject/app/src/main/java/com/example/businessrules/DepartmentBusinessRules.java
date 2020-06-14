package com.example.businessrules;

import com.example.utilitiesdatabase.SQLiteConnectionHelper;
import com.example.utilitiesdatabase.UtilitiesDepartments;

import java.util.ArrayList;

public class DepartmentBusinessRules {

    UtilitiesDepartments utilDepartment = new UtilitiesDepartments();

    ArrayList<String> DepartmentNameResult;
    ArrayList<String> DepartmentList = new ArrayList<String>();


    public ArrayList<String> getDepartmentByName(SQLiteConnectionHelper conn){

        DepartmentNameResult = utilDepartment.getDepartmentsName(conn);

        DepartmentList.add("Seleccione");
        for (int i=0; i<DepartmentNameResult.size();i++){
            DepartmentList.add(DepartmentNameResult.get(i));
        }

        return DepartmentList;
    }
}

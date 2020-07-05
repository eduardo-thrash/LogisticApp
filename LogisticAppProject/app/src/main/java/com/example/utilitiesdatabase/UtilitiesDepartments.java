package com.example.utilitiesdatabase;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.example.utilitiesdatabase.SQLiteConnectionHelper;
import java.util.ArrayList;

public class UtilitiesDepartments {

    public static final String CREATE_TABLE_DEPARTMENTS = "CREATE TABLE DEPARTMENTS (department_id INTEGER PRIMARY KEY, department_name TEXT, FOREIGN KEY(department_id) REFERENCES DEPARTURES(department_id), FOREIGN KEY(department_id) REFERENCES CITIES(department_id))";

    public void RegisterDataDefaultDepartures(SQLiteConnectionHelper conn){

        SQLiteDatabase db = conn.getWritableDatabase();

        ArrayList<String> InsertDepartments;
        InsertDepartments = new ArrayList<>();

        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_id, 	department_name) VALUES (1,'Antioquia')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_id, 	department_name) VALUES (2,'Cundinamarca')");

        for (int i = 0; i<InsertDepartments.size();i++){
            db.execSQL(InsertDepartments.get(i));
        }

        db.close();
    }

    public ArrayList<String> getDepartmentsName(SQLiteConnectionHelper conn){

        ArrayList<String> DepartmentsResult = new ArrayList<String>();

        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor c = db.rawQuery("SELECT department_name FROM DEPARTMENTS",null);

        while(c.moveToNext()){
            DepartmentsResult.add(c.getString(0));
        }

        return DepartmentsResult;
    }
}

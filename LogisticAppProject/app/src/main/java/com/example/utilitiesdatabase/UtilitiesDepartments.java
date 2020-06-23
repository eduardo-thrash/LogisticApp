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

        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('Antioquia')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('Atlantico')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('Amazonas')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('Arauca')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('Bogota')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('Bolivar')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('Boyaca')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('Caldas')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('Caqueta')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('Cauca')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('Casanare')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('Cesar')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('Cordoba')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('Cundinamarca')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('Choco')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('Guainia')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('Guaviare')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('Huila')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('La Guajira')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('Magdalena')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('Meta')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('Nariño')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('Norte de Santander')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('Putumayo')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('Quindio')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('Risaralda')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('Santander')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('Sucre')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('Tolima')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('Valle del Cauca')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('Vaupes')");
        InsertDepartments.add("INSERT INTO DEPARTMENTS (department_name) VALUES ('Vichada')");



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

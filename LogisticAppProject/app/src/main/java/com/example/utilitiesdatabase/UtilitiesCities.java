package com.example.utilitiesdatabase;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class UtilitiesCities {

    public static final String CREATE_TABLE_CITIES = "CREATE TABLE CITIES (city_id INTEGER PRIMARY KEY, city_name TEXT, department_id INTEGER, FOREIGN KEY(city_id) REFERENCES DEPARTURES(city_id), FOREIGN KEY(city_id) REFERENCES SITES(city_id))";

    public void RegisterDataDefaultCities(SQLiteConnectionHelper conn){

        SQLiteDatabase db = conn.getWritableDatabase();

        ArrayList<String> InsertCities;
        InsertCities = new ArrayList<>();

        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (1, 'Bogota', 1)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (2, 'Soacha', 1)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (3, 'Medellin', 2)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (4, 'Chia', 1)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (5, 'RioNegro', 2)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (6, 'Madrid', 1)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (7, 'Cali', 3)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (8, 'Barranquilla', 6)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (9, 'Cartagena', 5)");

        for (int i = 0; i<InsertCities.size();i++){
            db.execSQL(InsertCities.get(i));
        }

        db.close();
    }

    public ArrayList<String> getCitiesName(SQLiteConnectionHelper conn){

        ArrayList<String> CitiesResult = new ArrayList<String>();

        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor c = db.rawQuery("SELECT city_name FROM CITIES",null);

        while(c.moveToNext()){

            CitiesResult.add(c.getString(0));

            String fr = c.getString(0);
        }

        return CitiesResult;
    }

    public ArrayList<String> getCitiesNameByDepartment(SQLiteConnectionHelper conn, String departmentName){

        ArrayList<String> CitiesResult = new ArrayList<String>();

        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor c = db.rawQuery("SELECT city_name FROM CITIES WHERE department_id = (SELECT department_id FROM DEPARTMENTS WHERE department_name = '"+departmentName+"')",null);

        while(c.moveToNext()){

            CitiesResult.add(c.getString(0));

            String fr = c.getString(0);
        }

        return CitiesResult;
    }


}

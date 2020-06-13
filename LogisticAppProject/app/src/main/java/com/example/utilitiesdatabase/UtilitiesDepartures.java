package com.example.utilitiesdatabase;

import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class UtilitiesDepartures {

    public static final String DepartureTable = "DEPARTURES";
    public static final String fieldDepartureId = "departure_id";
    public static final String fieldDepartmentId = "department_id";
    public static final String fieldCityId = "city_id";
    public static final String fieldMaterialId = "material_id";
    public static final String fieldUserIs = "user_id";

    public static final String CREATE_TABLE_DEPARTURES = "CREATE TABLE DEPARTURES (departure_id INTEGER PRIMARY KEY, department_id INTEGER, city_id INTEGER, material_id INTEGER, user_id INTEGER)";

    public void RegisterDataDefaultDepartures(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getWritableDatabase();

        ArrayList<String> InsertDepartures;
        InsertDepartures = new ArrayList<>();

        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (1, 1, 1, 1, 1)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (2, 1, 1, 2, 1)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (3, 1, 1, 3, 1)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (4, 1, 1, 4, 1)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (5, 1, 1, 5, 1)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (6, 1, 1, 6, 1)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (7, 1, 1, 7, 1)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (8, 1, 1, 8, 1)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (9, 1, 1, 9, 1)");

        for (int i = 0; i<InsertDepartures.size();i++){
            db.execSQL(InsertDepartures.get(i));
        }

        db.close();
    }
}

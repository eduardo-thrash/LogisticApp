package com.example.utilitiesdatabase;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.businessrules.DepartureBusinessRules;
import com.example.businessrules.MaterialBusinessRules;

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

        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (1,1,1,1,1)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (2,2,2,2,2)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (3,3,3,3,3)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (4,4,4,4,4)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (5,5,5,5,5)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (6,6,6,6,1)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (7,7,7,7,2)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (8,8,8,8,3)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (9,9,9,9,4)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (10,10,10,10,5)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (11,11,11,11,1)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (12,12,12,12,2)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (13,13,13,13,3)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (14,14,14,14,4)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (15,15,15,15,5)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (16,16,16,16,1)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (17,17,17,17,2)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (18,18,18,18,3)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (19,19,19,19,4)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (20,20,20,20,5)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (21,21,21,21,1)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (22,22,22,22,2)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (23,23,23,23,3)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (24,24,24,24,4)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (25,25,25,25,5)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (26,26,26,26,1)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (27,27,27,27,2)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (28,28,28,28,3)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (29,29,29,29,4)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (30,30,30,30,5)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (31,31,31,31,1)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (32,32,32,32,2)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (33,1,33,33,3)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (34,2,34,34,4)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (35,3,35,35,5)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (36,4,36,36,1)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (37,5,37,37,2)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (38,6,38,38,3)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (39,7,39,39,4)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (40,8,40,40,5)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (41,9,41,41,1)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (42,10,42,42,2)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (43,11,43,43,3)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (44,12,44,44,4)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (45,13,45,45,5)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (46,14,46,46,1)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (47,15,47,47,2)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (48,16,48,48,3)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (49,17,49,49,4)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (50,18,50,50,5)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (51,5,6,51,1)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (52,5,6,52,2)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (53,5,6,53,3)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (54,5,6,54,4)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (55,5,6,55,5)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (56,30,10,56,3)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (57,5,6,57,4)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (58,5,6,58,5)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (59,5,6,59,1)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (60,1,26,60,2)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (61,5,6,61,3)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (62,5,6,62,4)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (63,1,26,63,5)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (64,1,26,64,3)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (65,14,17,65,1)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (66,14,17,66,2)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (67,1,26,67,3)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (68,5,6,68,4)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (69,5,6,69,5)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (70,5,6,70,1)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (71,5,6,71,2)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (72,5,6,72,3)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (73,5,6,73,4)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (74,5,6,74,5)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (75,5,6,75,1)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (76,5,6,76,2)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (77,5,6,77,3)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (78,5,6,78,4)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (79,5,6,79,5)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (80,1,26,80,1)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (81,1,26,81,2)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (82,1,26,82,3)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (83,1,26,83,4)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (84,5,6,84,5)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (85,1,26,85,1)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (86,5,6,86,2)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (87,5,6,87,3)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (88,30,10,88,3)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (89,5,6,89,4)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (90,5,6,90,5)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (91,1,26,91,3)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (92,5,6,92,1)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (93,21,48,93,3)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (94,5,6,94,2)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (95,5,6,95,4)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (96,5,6,96,3)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (97,5,6,96,1)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (98,5,6,98,2)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (99,5,6,99,3)");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES (100,5,6,100,4)");


        for (int i = 0; i<InsertDepartures.size();i++){
            db.execSQL(InsertDepartures.get(i));
        }

        db.close();
    }

    public ArrayList<MaterialBusinessRules> getDepartureInfo(SQLiteConnectionHelper conn, String cityName){

        MaterialBusinessRules material = new MaterialBusinessRules();
        ArrayList<MaterialBusinessRules> MaterialDepartures = new ArrayList<MaterialBusinessRules>();

        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT M.material_code, S.status_name FROM DEPARTURES D " +
                "INNER JOIN MATERIALS M ON D.material_id = M.material_id " +
                "INNER JOIN STATUS S ON M.status_id = S.status_id " +
                "WHERE D.city_id = (SELECT city_id FROM CITIES WHERE city_name = '" + cityName + "')",null);

        while (cursor.moveToNext()){
            material = new MaterialBusinessRules();

            material.setMaterialCode(cursor.getString(0));
            material.setMaterialStatus(cursor.getString(1));

            MaterialDepartures.add(material);
        }

        return MaterialDepartures;
    }

    public void DepartureUpdateByMaterial(SQLiteConnectionHelper conn, String materialCode){

        SQLiteDatabase db = conn.getWritableDatabase();

        db.execSQL("PRAGMA foreign_keys = OFF");
        db.execSQL("UPDATE MATERIALS SET status_id = 2 WHERE material_code = '" + materialCode + "'");

        //Cursor cursor = db.rawQuery("PRAGMA foreign_keys = OFF",null);
        //Cursor cursor2 = db.rawQuery("UPDATE MATERIALS SET status_id = 2 WHERE material_code = 'MT00000002'",null);
    }
}

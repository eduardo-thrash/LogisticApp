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


        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('1','16','6', '1', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('1','16','6', '1', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('1','16','6', '1', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('1','16','6', '1', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('1','16','6', '1', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('1','8','23', '10', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('1','8','23', '10', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('1','8','23', '10', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('1','8','23', '10', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('1','8','23', '10', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('1','16','6', '11', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('1','16','6', '11', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('1','16','6', '11', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('1','16','6', '11', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('1','16','6', '12', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('1','16','6', '12', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('1','16','6', '12', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('1','16','6', '12', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('2','16','6', '13', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('2','16','6', '13', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('2','16','6', '13', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('2','16','6', '13', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('2','16','6', '14', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('2','16','6', '14', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('2','16','6', '14', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('2','16','6', '14', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('2','15','29', '15', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('2','15','29', '15', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('2','15','29', '15', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('2','15','29', '15', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('2','16','6', '16', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('2','16','6', '16', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('2','16','6', '16', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('2','16','6', '16', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('3','16','6', '17', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('3','16','6', '17', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('3','16','6', '17', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('3','16','6', '17', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('3','8','23', '18', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('3','8','23', '18', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('3','8','23', '18', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('3','8','23', '18', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('3','16','6', '19', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('3','16','6', '19', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('3','16','6', '19', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('3','16','6', '19', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('3','8','23', '2', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('3','8','23', '2', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('3','8','23', '2', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('3','8','23', '2', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('3','8','23', '2', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('4','16','6', '20', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('4','16','6', '20', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('4','16','6', '20', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('4','16','6', '20', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('4','16','6', '3', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('4','16','6', '3', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('4','16','6', '3', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('4','16','6', '3', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('4','16','6', '3', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('4','16','6', '4', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('4','16','6', '4', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('4','16','6', '4', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('4','16','6', '4', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('4','16','6', '4', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('4','16','6', '5', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('4','16','6', '5', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('4','16','6', '5', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('4','16','6', '5', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('4','16','6', '5', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('5','16','6', '6', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('5','16','6', '6', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('5','16','6', '6', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('5','16','6', '6', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('5','16','6', '6', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('5','15','29', '7', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('5','15','29', '7', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('5','15','29', '7', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('5','15','29', '7', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('5','15','29', '7', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('5','16','6', '8', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('5','16','6', '8', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('5','16','6', '8', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('5','16','6', '8', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('5','16','6', '8', '1')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('6','16','6', '9', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('6','16','6', '9', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('6','16','6', '9', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('6','16','6', '9', '7')");
        InsertDepartures.add("INSERT INTO DEPARTURES (departure_id, department_id, city_id, material_id, user_id) VALUES ('6','16','6', '9', '7')");


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

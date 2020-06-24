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

        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (1,'Apartado',1)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (2,'Armenia',25)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (3,'Barrancabermeja',27)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (4,'Barranquilla',2)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (5,'Bello',1)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (6,'Bogota',14)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (7,'Bucaramanga',27)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (8,'Buenaventura',30)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (9,'Buga',30)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (10,'Cali',30)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (11,'Cartagena',6)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (12,'Cienaga',20)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (13,'Chía',14)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (14,'Cucuta',23)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (15,'Duitama',7)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (16,'Envigado',1)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (17,'Facatativa',14)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (18,'Floridablanca',27)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (19,'Florencia',9)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (20,'Girardot',14)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (21,'Ibague',29)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (22,'Itagui',1)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (23,'Ipiales',22)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (24,'Jamundi',30)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (25,'Manizales',8)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (26,'Medellin',1)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (27,'Mocoa',24)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (28,'Monteria',13)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (29,'Mompos',6)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (30,'Neiva',18)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (31,'Leticia',3)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (32,'Pamplona',23)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (33,'Palmira',30)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (34,'Pasto',22)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (35,'Pereira',26)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (36,'Popayan',10)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (37,'Puerto Colombia',2)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (38,'Quibdo',15)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (39,'Rioacha',19)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (40,'Rionegro',27)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (41,'Santa Marta',20)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (42,'Sincelejo',28)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (43,'Soacha',14)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (44,'Tulua',30)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (45,'Tumaco',22)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (46,'Tunja',7)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (47,'Valledupar',12)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (48,'Villavicencio',21)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (49,'Villa Soledad',2)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (50,'Yopal',11)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (51,'Yumbo',30)");
        InsertCities.add("INSERT INTO CITIES (city_id, city_name, department_id) VALUES (52,'Zipaquira',14)");



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

package com.example.utilitiesdatabase;

public class UtilitiesCities {

    public static final String CREATE_TABLE_CITIES = "CREATE TABLE CITIES (city_id INTEGER PRIMARY KEY, city_name TEXT, departament_id INTEGER, FOREIGN KEY(city_id) REFERENCES DEPARTURES(city_id), FOREIGN KEY(city_id) REFERENCES SITES(city_id))";
}

package com.example.utilitiesdatabase;

public class UtilitiesDepartments {

    public static final String CREATE_TABLE_DEPARTMENTS = "CREATE TABLE DEPARTMENTS (department_id INTEGER PRIMARY KEY, department_name TEXT, FOREIGN KEY(department_id) REFERENCES DEPARTURES(department_id), FOREIGN KEY(department_id) REFERENCES CITIES(department_id))";

}

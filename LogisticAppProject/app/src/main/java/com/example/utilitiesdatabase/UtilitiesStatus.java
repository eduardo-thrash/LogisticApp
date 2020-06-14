package com.example.utilitiesdatabase;

public class UtilitiesStatus {
    public static final String CREATE_TABLE_STATUS = "CREATE TABLE STATUS (status_id INTEGER PRIMARY KEY, status_name TEXT, FOREIGN KEY(status_id) REFERENCES MATERIALS(status_id), FOREIGN KEY(status_id) REFERENCES TESTS(status_id))";
}

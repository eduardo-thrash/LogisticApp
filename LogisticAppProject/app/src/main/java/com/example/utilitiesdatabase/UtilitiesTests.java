package com.example.utilitiesdatabase;

public class UtilitiesTests {

    public static final String CREATE_TABLE_TESTS = "CREATE TABLE TESTS (test_id INTEGER PRIMARY KEY, test_code TEXT, status_id INTEGER participant_id INTEGER, room_id INTEGER, FOREIGN KEY(test_id) REFERENCES NOTIFICATION_TEST(test_id))";
}

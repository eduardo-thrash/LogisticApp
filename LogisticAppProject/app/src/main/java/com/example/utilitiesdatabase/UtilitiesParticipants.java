package com.example.utilitiesdatabase;

public class UtilitiesParticipants {
    public static final String CREATE_TABLE_PARTICIPANTS = "CREATE TABLE PARTICIPANTS (participant_id INTEGER PRIMARY KEY, participant_identification_type TEXT, participant_identification_id INTEGER, participant_name TEXT, FOREIGN KEY(participant_id) REFERENCES TESTS(participant_id))";
}

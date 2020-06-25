package com.example.utilitiesdatabase;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class UtilitiesParticipants {
    public static final String CREATE_TABLE_PARTICIPANTS = "CREATE TABLE PARTICIPANTS (participant_id INTEGER PRIMARY KEY, participant_identification_type TEXT, participant_identification_id INTEGER, participant_name TEXT, FOREIGN KEY(participant_id) REFERENCES TESTS(participant_id))";

    public void RegisterDataDefaultParticipant(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getWritableDatabase();

        ArrayList<String> InsertParticipants;
        InsertParticipants = new ArrayList<>();

        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (1, 'CC',1018456321, 'Juan Perez')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (2, 'CC',79856412, 'Pedro Martinez')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (3, 'CC',18456320, 'Luis Gutierrez')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (4, 'CC',54789610, 'Manuel Molina')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (5, 'CC',41123654, 'Jhon Perez ')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (6,'CC',51236526,'Yenny ANdre Castro')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (51, 'CC',1021475361, 'Edisson Florez')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (7, 'CC',1010793524, 'Daniel Cifuentes')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (8, 'CC',47632147, 'Diego Torres')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (9, 'CC',51023695, 'Leonardo Montenegro')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (10, 'CC',35874320, 'Ferley Medina')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (11, 'CC',17684137, 'Ricardo Pardo')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (12, 'CC',79652840, 'John Triana')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (13, 'CC',1000742365, 'David Suarez')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (14, 'CC',1001952364, 'Jorge Posada')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (15, 'CC',52746931, 'Angie Choachi ')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (16, 'CC',36985247, 'Brandon Robles')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (17, 'CC',48963725, 'Daniela Rocha')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (18, 'CC',1008147639, 'Cristian Parra')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (19, 'CC',50743115, 'Alexander Medina')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (20, 'CC',96741358, 'David Romero')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (21, 'CC',27963541, 'Orlinda Wilchez')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (22, 'CC',85412397, 'Paola Salazar')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (23, 'CC',56743956, 'Gabriela Olarte')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (24, 'CC',1015742395, 'Nelson Garcia')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (25, 'CC',76385421, 'Luz Olarte')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (26, 'CC',1101757060, 'Fernando Gordillo')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (27, 'CC',20365970, 'Gustavo Mendoza')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (28, 'CC',43652871, 'Dolly Chacon')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (29, 'CC',1052754382, 'Diana Rodriguez')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (30, 'CC',51632874, 'Liliana Agudelo')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (31, 'CC',1012456317, 'Manuel Bonilla')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (32, 'CC',1018456301, 'Luis Torres')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (33, 'CC',1032478963, 'Diana Niño')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (34, 'CC',1028481090, 'Daniel Salazar')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (35, 'CC',847539603, 'Juan Carlos Restrepo')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (36, 'CC',77931045, 'Freddy Ortiz')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (37, 'CC',50194736, 'Carolina Moncaleano')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (38, 'CC',35478962, 'Jenny Lopez')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (39, 'CC',1041658206, 'Lorena Alvarez')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (40, 'CC',80456321, 'Rodrigo Cardenas')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (41, 'CC',93254178, 'Julio Niño')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (42, 'CC',1101451734, 'Jackson Castro')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (43, 'CC',63254879, 'Emilce Riaño')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (44, 'CC',80456932, 'Camilo Cadena')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (45, 'CC',52743968, 'Karen Renteria ')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (46, 'CC',1075439624, 'Martha Villamil')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (47, 'CC',80634965, 'Andres Urrego')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (48, 'CC',79836501, 'Cesar Ortiz')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (49, 'CC',54836202, 'Mayra Devia')");
        InsertParticipants.add("INSERT INTO PARTICIPANTS(participant_id,participant_identification_type,participant_identification_id,participant_name) VALUES (50, 'CC',1010745830, 'Brayan Mosquera')");


        for (int i = 0; i<InsertParticipants.size();i++){
            db.execSQL(InsertParticipants.get(i));
        }

        db.close();
    }


    public Cursor GetParticipantsBySite(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM PARTICIPANTS",null);

        return cursor;
    }

    public Cursor GetPresentParticipants(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM ROOMS",null);

        return cursor;
    }

    public Cursor GetParticipantDocumentTypeByTestCode(SQLiteConnectionHelper conn, String testCode) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT participant_identification_type FROM PARTICIPANTS WHERE participant_id = (SELECT participant_id FROM TESTS WHERE test_code = '"+testCode+"')",null);

        return cursor;
    }

    public Cursor GetParticipantDocumentIdByTestCode(SQLiteConnectionHelper conn, String testCode) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT participant_identification_id FROM PARTICIPANTS WHERE participant_id = (SELECT participant_id FROM TESTS WHERE test_code = '"+testCode+"')",null);

        return cursor;
    }

    public Cursor GetParticipantNameByTestCode(SQLiteConnectionHelper conn, String testCode) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT participant_name FROM PARTICIPANTS WHERE participant_id = (SELECT participant_id FROM TESTS WHERE test_code = '"+testCode+"')",null);

        return cursor;
    }

    public Cursor GetParticipantsByRoom(SQLiteConnectionHelper conn, String roomId) {
        int IntRoomId = Integer.parseInt(roomId);

        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM TESTS WHERE room_id = "+IntRoomId+"",null);

        return cursor;
    }

    public Cursor GetPresentParticipantsByRoom(SQLiteConnectionHelper conn, String roomId) {
        int IntRoomId = Integer.parseInt(roomId);

        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM TESTS WHERE status_id = 5 AND room_id = "+IntRoomId+"",null);

        return cursor;
    }
}

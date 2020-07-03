package com.example.utilitiesdatabase;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.businessrules.MaterialBusinessRules;
import com.example.businessrules.TestBusinessRules;

import java.util.ArrayList;

public class UtilitiesTests {

    public static final String CREATE_TABLE_TESTS = "CREATE TABLE TESTS (test_id INTEGER PRIMARY KEY, test_code TEXT, test_status_id INTEGER, participant_id INTEGER, room_id INTEGER, test_material_id INTEGER, FOREIGN KEY(test_id) REFERENCES NOTIFICATION_TEST(test_id))";

    public void RegisterDataDefaultTest(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getWritableDatabase();

        ArrayList<String> InsertTest;
        InsertTest = new ArrayList<>();


        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(1,'TS00001',1,1,1,1)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(2,'TS00002',1,2,1,1)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(3,'TS00003',1,3,1,1)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(4,'TS00004',1,4,1,1)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(5,'TS00005',1,5,1,1)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(6,'TS00006',1,6,1,1)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(7,'TS00007',1,7,1,1)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(8,'TS00008',1,8,1,1)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(9,'TS00009',1,9,1,1)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(10,'TS00010',1,10,1,1)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(11,'TS00011',1,11,1,1)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(12,'TS00012',1,12,1,1)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(13,'TS00013',1,13,2,2)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(14,'TS00014',1,14,2,2)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(15,'TS00015',1,15,2,2)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(16,'TS00016',1,16,2,2)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(17,'TS00017',1,17,2,2)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(18,'TS00018',1,18,2,2)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(19,'TS00019',1,19,2,2)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(20,'TS00020',1,20,2,2)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(21,'TS00021',1,21,2,2)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(22,'TS00022',1,22,2,2)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(23,'TS00023',1,23,2,2)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(24,'TS00024',1,24,2,2)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(25,'TS00025',1,25,5,3)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(26,'TS00026',1,26,5,3)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(27,'TS00027',1,27,5,3)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(28,'TS00028',1,28,5,3)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(29,'TS00029',1,29,5,3)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(30,'TS00030',1,30,5,3)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(31,'TS00031',1,31,5,3)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(32,'TS00032',1,32,5,3)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(33,'TS00033',1,33,5,3)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(34,'TS00034',1,34,3,4)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(35,'TS00035',1,35,3,4)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(36,'TS00036',1,36,3,4)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(37,'TS00037',1,37,3,4)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(38,'TS00038',1,38,3,4)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(39,'TS00039',1,39,3,4)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(40,'TS00040',1,40,3,4)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(41,'TS00041',1,41,3,4)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(42,'TS00042',1,42,3,4)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(43,'TS00043',1,43,4,5)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(44,'TS00044',1,44,4,5)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(45,'TS00045',1,45,4,5)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(46,'TS00046',1,46,4,5)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(47,'TS00047',1,47,4,5)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(48,'TS00048',1,48,4,5)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(49,'TS00049',1,49,4,5)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,test_status_id,participant_id,room_id,test_material_id)VALUES(50,'TS00050',1,50,4,5)");


        for (int i = 0; i<InsertTest.size();i++){
            db.execSQL(InsertTest.get(i));
        }

        db.close();
    }

    public Cursor GetPresentParticipants(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT test_code FROM TESTS WHERE test_status_id = 4",null);

        return cursor;
    }

    public Cursor GetTestCode(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT test_code FROM TESTS",null);

        return cursor;
    }

    public Cursor GetTestStatus(SQLiteConnectionHelper conn, String statusCode){
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT status_name FROM STATUS WHERE status_id = (SELECT test_status_id FROM TESTS WHERE test_code = '"+statusCode+"')",null);

        return cursor;
    }

    public Cursor GetTestId(SQLiteConnectionHelper conn, String testCode) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT test_id FROM TESTS WHERE test_code = '"+testCode+"'",null);

        return cursor;

    }

    public Cursor GetTestNumberByMaterialCode(SQLiteConnectionHelper conn, String materialCode) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM TESTS WHERE test_material_id = (SELECT material_id FROM MATERIALS WHERE material_code = '"+materialCode+"')",null);

        return cursor;
    }


    public Cursor GetTestByCode(SQLiteConnectionHelper conn, String testCode) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT test_code FROM TESTS WHERE test_code = '"+testCode+"'",null);

        return cursor;
    }

    public ArrayList<TestBusinessRules> GetTestListByUser(SQLiteConnectionHelper conn, int userRoomBossIdSession) {

        TestBusinessRules test = new TestBusinessRules();
        ArrayList<TestBusinessRules> TestList = new ArrayList<TestBusinessRules>();

        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT T.test_code, S.status_name FROM TESTS T, STATUS S ON T.test_status_id = S.status_id WHERE test_material_id = (SELECT material_id FROM MATERIALS WHERE material_user_room = "+userRoomBossIdSession+")",null);

        while (cursor.moveToNext()){
            test = new TestBusinessRules();

            test.setTestCode(cursor.getString(0));
            test.setTestStatusName(cursor.getString(1));

            TestList.add(test);
        }

        return TestList;
    }

    public Cursor TestQuantityByRoom(SQLiteConnectionHelper conn, String roomId) {

        int IntRoomId = Integer.parseInt(roomId);

        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM TESTS WHERE room_id = "+IntRoomId+"",null);

        return cursor;
    }

    public void TestStatusUpdateByScan(SQLiteConnectionHelper conn, String testCodeUpdate) {
        SQLiteDatabase db = conn.getWritableDatabase();

        db.execSQL("PRAGMA foreign_keys = OFF");
        db.execSQL("UPDATE TESTS SET test_status_id = 4 WHERE test_code = '" + testCodeUpdate + "'");
    }
}



package com.example.utilitiesdatabase;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.businessrules.MaterialBusinessRules;
import com.example.businessrules.TestBusinessRules;

import java.util.ArrayList;

public class UtilitiesTests {

    public static final String CREATE_TABLE_TESTS = "CREATE TABLE TESTS (test_id INTEGER PRIMARY KEY, test_code TEXT, status_id INTEGER, participant_id INTEGER, room_id INTEGER, test_material_id INTEGER, FOREIGN KEY(test_id) REFERENCES NOTIFICATION_TEST(test_id))";

    public void RegisterDataDefaultTest(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getWritableDatabase();

        ArrayList<String> InsertTest;
        InsertTest = new ArrayList<>();

       
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(1,'TS000001',1,1,1,1)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(2,'TS000002',1,2,1,9)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(3,'TS000003',1,3,1,17)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(4,'TS000004',1,4,1,1)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(5,'TS000005',1,5,1,9)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(6,'TS000006',1,6,1,17)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(7,'TS000007',1,7,1,1)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(8,'TS000008',1,8,1,9)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(9,'TS000009',1,9,1,17)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(10,'TS000010',1,10,1,1)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(11,'TS000011',1,11,1,9)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(12,'TS000012',1,12,1,17)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(13,'TS000013',1,13,1,1)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(14,'TS000014',1,14,1,9)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(15,'TS000015',1,15,1,17)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(16,'TS000016',1,16,61,1)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(17,'TS000017',1,17,61,9)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(18,'TS000018',1,18,61,17)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(19,'TS000019',1,19,61,1)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(20,'TS000020',1,20,61,9)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(21,'TS000021',1,21,61,17)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(22,'TS000022',1,22,61,1)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(23,'TS000023',1,23,61,9)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(24,'TS000024',1,24,61,17)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(25,'TS000025',1,25,61,1)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(26,'TS000026',1,26,61,9)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(27,'TS000027',1,27,61,17)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(28,'TS000028',1,28,61,1)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(29,'TS000029',1,29,61,9)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(30,'TS000030',1,30,61,17)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(31,'TS000031',1,31,61,1)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(32,'TS000032',1,32,61,9)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(33,'TS000033',1,33,61,17)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(34,'TS000034',1,34,61,17)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(35,'TS000035',2,35,61,17)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(36,'TS000036',2,36,2,2)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(37,'TS000037',2,37,2,10)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(38,'TS000038',2,38,2,18)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(39,'TS000039',2,39,2,2)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(40,'TS000040',2,40,2,10)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(41,'TS000041',2,41,2,18)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(42,'TS000042',2,42,2,2)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(43,'TS000043',2,43,2,10)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(44,'TS000044',2,44,2,18)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(45,'TS000045',3,45,2,2)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(46,'TS000046',3,46,2,10)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(47,'TS000047',3,47,2,18)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(48,'TS000048',3,48,2,2)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(49,'TS000049',3,49,2,10)");
        InsertTest.add("INSERT INTO TESTS(test_id,test_code,status_id,participant_id,room_id,test_material_id)VALUES(50,'TS000050',3,50,2,18)");


        for (int i = 0; i<InsertTest.size();i++){
            db.execSQL(InsertTest.get(i));
        }

        db.close();
    }

    public Cursor GetPresentParticipants(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT test_code FROM TESTS WHERE status_id = 5",null);

        return cursor;
    }

    public Cursor GetTestCode(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT test_code FROM TESTS",null);

        return cursor;
    }

    public Cursor GetTestStatus(SQLiteConnectionHelper conn, String statusCode){
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT status_name FROM STATUS WHERE status_id = (SELECT status_id FROM TESTS WHERE test_code = '"+statusCode+"')",null);

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

        Cursor cursor = db.rawQuery("SELECT T.test_code, S.status_name FROM TESTS T, STATUS S ON T.status_id = S.status_id WHERE test_material_id = (SELECT material_id FROM MATERIALS WHERE material_id = 2 AND material_user_room = "+userRoomBossIdSession+") ",null);

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
}



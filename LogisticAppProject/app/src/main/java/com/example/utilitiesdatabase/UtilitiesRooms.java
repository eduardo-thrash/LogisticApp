package com.example.utilitiesdatabase;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class UtilitiesRooms {


    public static final String RoomTable = "ROOMS";
    public static final String fieldRoomId = "room_id";
    public static final String fieldRoomName = "room_name";
    public static final String fieldRoomSiteId = "site_id";

    public static final String CREATE_TABLE_ROOMS = "CREATE TABLE ROOMS (room_id INTEGER PRIMARY KEY, room_name TEXT, site_id INTEGER)";

    public void RegisterDataDefaultRooms(SQLiteConnectionHelper conn){

        SQLiteDatabase db = conn.getWritableDatabase();

        ArrayList<String> InsertRooms;
        InsertRooms = new ArrayList<>();

        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (1,'A010',1)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (2,'A020',2)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (3,'A030',3)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (4,'A040',4)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (5,'A050',5)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (6,'B010',6)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (7,'B020',7)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (8,'B030',8)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (9,'B040',9)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (10,'B050',10)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (11,'C010',11)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (12,'C020',12)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (13,'C030',13)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (14,'C040',14)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (15,'C050',15)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (16,'D010',16)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (17,'D020',17)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (18,'D030',18)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (19,'D040',19)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (20,'D050',20)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (21,'E010',21)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (22,'E020',22)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (23,'E030',23)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (24,'E040',24)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (25,'E050',25)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (26,'F010',26)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (27,'F020',27)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (28,'F030',28)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (29,'F040',29)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (30,'F050',30)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (31,'G010',31)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (32,'G020',32)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (33,'G030',33)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (34,'G040',34)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (35,'G050',35)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (36,'H010',36)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (37,'H020',37)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (38,'H030',38)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (39,'H040',39)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (40,'H050',40)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (41,'I010',41)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (42,'I020',42)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (43,'I030',43)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (44,'I040',44)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (45,'I050',45)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (46,'J010',46)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (47,'J020',47)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (48,'J030',48)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (49,'J040',49)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (50,'J050',50)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (51,'K010',51)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (52,'K020',52)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (53,'K030',53)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (54,'K040',54)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (55,'K050',55)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (56,'L010',56)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (57,'L020',57)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (58,'L030',58)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (59,'L040',59)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (60,'L050',60)");



        for (int i = 0; i<InsertRooms.size();i++){
            db.execSQL(InsertRooms.get(i));
        }

        db.close();
    }

    public Cursor GetRoomsBySite(SQLiteConnectionHelper conn){

        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM ROOMS",null);

        return cursor;
    }
}

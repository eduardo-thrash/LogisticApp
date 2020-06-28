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
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (61,'A011',1)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (421,'C110',1)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (431,'E110',1)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (481,'G110',1)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (141,'I110',1)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (161,'A211',1)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (171,'C211',1)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (261,'I211',1)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (252,'K211',1)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (2,'A020',2)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (62,'A021',2)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (412,'A120',2)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (422,'C120',2)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (432,'E120',2)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (438,'F130',2)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (482,'G120',2)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (142,'I120',2)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (162,'A221',2)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (172,'C221',2)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (182,'E221',2)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (262,'I221',2)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (202,'K221',2)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (3,'A030',3)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (63,'A031',3)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (411,'A110',3)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (413,'A130',3)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (433,'E130',3)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (430,'F150',3)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (483,'G130',3)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (143,'I130',3)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (163,'A231',3)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (173,'C231',3)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (183,'E231',3)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (260,'I231',3)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (203,'K231',3)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (4,'A040',4)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (64,'A041',4)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (414,'A140',4)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (434,'E140',4)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (484,'G140',4)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (440,'H150',4)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (164,'A241',4)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (174,'C241',4)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (194,'G241',4)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (259,'I241',4)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (204,'K241',4)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (5,'A050',5)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (65,'A051',5)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (415,'A150',5)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (435,'E150',5)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (485,'G150',5)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (144,'I140',5)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (145,'I150',5)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (150,'J150',5)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (152,'K120',5)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (155,'K150',5)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (165,'A251',5)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (166,'B211',5)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (175,'C251',5)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (195,'G251',5)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (258,'I251',5)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (205,'K251',5)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (6,'B010',6)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (66,'B011',6)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (416,'B110',6)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (426,'D110',6)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (436,'F110',6)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (486,'H110',6)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (146,'J110',6)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (151,'K110',6)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (153,'K130',6)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (156,'L110',6)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (170,'B251',6)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (176,'D211',6)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (179,'D241',6)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (180,'D251',6)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (181,'E211',6)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (184,'E241',6)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (185,'E251',6)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (186,'F211',6)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (190,'F251',6)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (191,'G211',6)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (192,'G221',6)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (193,'G231',6)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (196,'H211',6)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (490,'H251',6)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (257,'J211',6)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (253,'J251',6)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (206,'L211',6)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (250,'L251',6)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (7,'B020',7)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (67,'B021',7)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (417,'B120',7)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (427,'D120',7)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (437,'F120',7)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (487,'H120',7)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (147,'J120',7)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (154,'K140',7)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (157,'L120',7)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (167,'B221',7)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (177,'D221',7)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (187,'F221',7)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (197,'H221',7)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (256,'J221',7)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (207,'L221',7)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (8,'B030',8)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (68,'B031',8)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (418,'B130',8)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (128,'D130',8)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (488,'H130',8)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (148,'J130',8)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (158,'L130',8)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (168,'B231',8)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (178,'D231',8)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (188,'F231',8)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (198,'H231',8)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (255,'J231',8)");
        InsertRooms.add("INSERT INTO ROOMS (room_id,room_name,site_id) VALUES (208,'L231',8)");




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

    public Cursor GetRoomNameByUser(SQLiteConnectionHelper conn, int userRoomBossIdSession) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT room_name FROM ROOMS R JOIN SITES S ON R.site_id = S.site_id WHERE S.site_id = (SELECT M.site_id FROM MATERIALS M WHERE material_user_room = "+userRoomBossIdSession+")",null);

        return cursor;
    }

    public Cursor GetRoomIdByUser(SQLiteConnectionHelper conn, int userRoomBossIdSession) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT room_id FROM ROOMS R JOIN SITES S ON R.site_id = S.site_id WHERE S.site_id = (SELECT M.site_id FROM MATERIALS M WHERE material_user_room = "+userRoomBossIdSession+")",null);

        return cursor;
    }
    public Cursor SelectRoomIdByName(SQLiteConnectionHelper conn, String roomNameSelected) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT room_id FROM ROOMS WHERE room_name = '"+roomNameSelected+"'",null);

        return cursor;
    }

    public ArrayList<String> SelectRoomListBySiteName(SQLiteConnectionHelper conn, String siteName) {
        ArrayList<String> RoomsResult = new ArrayList<String>();

        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor c = db.rawQuery("SELECT room_name FROM ROOMS WHERE site_id = (SELECT site_id FROM SITES WHERE site_name = '"+siteName+"')",null);

        while(c.moveToNext()){
            RoomsResult.add(c.getString(0));
        }

        return RoomsResult;
    }

}


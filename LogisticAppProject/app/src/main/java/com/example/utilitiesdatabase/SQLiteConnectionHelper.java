package com.example.utilitiesdatabase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteConnectionHelper extends SQLiteOpenHelper {

    public SQLiteConnectionHelper(Context context, String databaseName, SQLiteDatabase.CursorFactory factory, int databaseVersion) {
        super(context, databaseName, factory, databaseVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(UtilitiesRooms.CREATE_TABLE_ROOMS);
        db.execSQL(UtilitiesDepartures.CREATE_TABLE_DEPARTURES);
        db.execSQL(UtilitiesNotificationMaterial.CREATE_TABLE_NOTIFICATION_MATERIAL);
        db.execSQL(UtilitiesNotificationTest.CREATE_TABLE_NOTIFICATION_TEST);
        db.execSQL(UtilitiesNotificationMaterialType.CREATE_TABLE_NOTIFICATION_MATERIAL_TYPE);
        db.execSQL(UtilitiesNotificationTestType.CREATE_TABLE_NOTIFICATION_TEST_TYPE);
        db.execSQL(UtilitiesMaterials.CREATE_TABLE_MATERIALS);
        db.execSQL(UtilitiesUsers.CREATE_TABLE_USERS);
        db.execSQL(UtilitiesRoles.CREATE_TABLE_ROLES);
        db.execSQL(UtilitiesSites.CREATE_TABLE_SITES);
        db.execSQL(UtilitiesCities.CREATE_TABLE_CITIES);
        db.execSQL(UtilitiesDepartments.CREATE_TABLE_DEPARTMENTS);
        db.execSQL(UtilitiesStatus.CREATE_TABLE_STATUS);
        db.execSQL(UtilitiesParticipants.CREATE_TABLE_PARTICIPANTS);
        db.execSQL(UtilitiesTests.CREATE_TABLE_TESTS);
        db.execSQL(UtilitiesSession.CREATE_TABLE_SESSION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS ROOMS");
        db.execSQL("DROP TABLE IF EXISTS DEPARTURES");
        db.execSQL("DROP TABLE IF EXISTS NOTIFICATION_MATERIAL");
        db.execSQL("DROP TABLE IF EXISTS NOTIFICATION_TEST");
        db.execSQL("DROP TABLE IF EXISTS NOTIFICATION_MATERIAL_TYPE");
        db.execSQL("DROP TABLE IF EXISTS NOTIFICATION_TEST_TYPE");
        db.execSQL("DROP TABLE IF EXISTS MATERIALS");
        db.execSQL("DROP TABLE IF EXISTS USERS");
        db.execSQL("DROP TABLE IF EXISTS ROLES");
        db.execSQL("DROP TABLE IF EXISTS SITES");
        db.execSQL("DROP TABLE IF EXISTS CITIES");
        db.execSQL("DROP TABLE IF EXISTS DEPARTMENTS");
        db.execSQL("DROP TABLE IF EXISTS STATUS");
        db.execSQL("DROP TABLE IF EXISTS PARTICIPANTS");
        db.execSQL("DROP TABLE IF EXISTS TESTS");

        onCreate(db);
    }
}

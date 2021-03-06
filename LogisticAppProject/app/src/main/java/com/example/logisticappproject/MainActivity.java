package com.example.logisticappproject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.preference.PreferenceManager;

import androidx.appcompat.app.AppCompatActivity;

import com.example.utilitiesdatabase.SQLiteConnectionHelper;
import com.example.utilitiesdatabase.UtilitiesCities;
import com.example.utilitiesdatabase.UtilitiesDepartments;
import com.example.utilitiesdatabase.UtilitiesDepartures;
import com.example.utilitiesdatabase.UtilitiesMaterials;
import com.example.utilitiesdatabase.UtilitiesNotificationMaterial;
import com.example.utilitiesdatabase.UtilitiesNotificationMaterialType;
import com.example.utilitiesdatabase.UtilitiesNotificationTest;
import com.example.utilitiesdatabase.UtilitiesNotificationTestType;
import com.example.utilitiesdatabase.UtilitiesParticipants;
import com.example.utilitiesdatabase.UtilitiesRoles;
import com.example.utilitiesdatabase.UtilitiesRooms;
import com.example.utilitiesdatabase.UtilitiesSites;
import com.example.utilitiesdatabase.UtilitiesStatus;
import com.example.utilitiesdatabase.UtilitiesTests;
import com.example.utilitiesdatabase.UtilitiesUsers;

public class MainActivity extends AppCompatActivity {

    SQLiteConnectionHelper conn = new SQLiteConnectionHelper(this,"bd_LogisticApp",null,1);

    UtilitiesRooms utilRooms = new UtilitiesRooms();
    UtilitiesDepartures utilDepartures = new UtilitiesDepartures();
    UtilitiesNotificationMaterial utilNotificationMaterial = new UtilitiesNotificationMaterial();
    UtilitiesNotificationTest utilNotificationTest = new UtilitiesNotificationTest();
    UtilitiesNotificationMaterialType utilNotificationMaterialType = new UtilitiesNotificationMaterialType();
    UtilitiesNotificationTestType utilNotificationTestType = new UtilitiesNotificationTestType();
    UtilitiesMaterials utilMaterials = new UtilitiesMaterials();
    UtilitiesUsers utilUsers = new UtilitiesUsers();
    UtilitiesDepartments utilDepartments = new UtilitiesDepartments();
    UtilitiesCities utilCities = new UtilitiesCities();
    UtilitiesStatus utilStatus = new UtilitiesStatus();
    UtilitiesTests utilitiesTests = new UtilitiesTests();
    UtilitiesSites utilitiesSites = new UtilitiesSites();
    UtilitiesParticipants _utilitiesParticipants = new UtilitiesParticipants();
    UtilitiesRoles _utilitiesRoles = new UtilitiesRoles();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        Intent launcherActivity = new Intent(this, LoginActivity.class);
        startActivity(launcherActivity);

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if (prefs.getBoolean("firstTime", true)) {
            SQLiteDatabase db = conn.getWritableDatabase();

            utilRooms.RegisterDataDefaultRooms(conn);
            utilDepartures.RegisterDataDefaultDepartures(conn);
            utilNotificationMaterial.RegisterDataDefaultNotificationMaterial(conn);
            utilNotificationTest.RegisterDataDefaultNotificationTest(conn);
            utilNotificationMaterialType.RegisterDataDefaultNotificationMaterialType(conn);
            utilNotificationTestType.RegisterDataDefaultNotificationTestType(conn);
            utilMaterials.RegisterDataDefaultMaterial(conn);
            utilUsers.RegisterDataDefaultUsers(conn);
            utilitiesTests.RegisterDataDefaultTest(conn);
            utilDepartments.RegisterDataDefaultDepartures(conn);
            utilCities.RegisterDataDefaultCities(conn);
            utilStatus.RegisterDataDefaultStatus(conn);
            utilitiesSites.RegisterDataDefaultSite(conn);
            _utilitiesParticipants.RegisterDataDefaultParticipant(conn);
            _utilitiesRoles.RegisterDataDefaultRoles(conn);

            db.close();

            SharedPreferences.Editor editor = prefs.edit();
            editor.putBoolean("firstTime", false);
            editor.commit();
        }
    }
}

package com.example.businessrules;

import android.database.Cursor;

import com.example.utilitiesdatabase.SQLiteConnectionHelper;
import com.example.utilitiesdatabase.UtilitiesMaterials;
import com.example.utilitiesdatabase.UtilitiesParticipants;
import com.example.utilitiesdatabase.UtilitiesRooms;
import com.example.utilitiesdatabase.UtilitiesSites;
import com.example.utilitiesdatabase.UtilitiesTests;

public class SiteBusinessRules {

    public int SiteId;
    public String SiteName;
    public String SiteCity;
    public int TotalRooms;
    public int PendingMaterial;
    public int AdditionalMaterial;
    public int TotalParticipants;
    public int PresentParticipants;
    public int MissingParticipants;
    public int CancelTests;

    UtilitiesRooms _utilitiesRooms = new UtilitiesRooms();
    UtilitiesSites _utilitiesSites = new UtilitiesSites();

    public void GetSiteResume()
    {
    }

    public void GetSites()
    {
    }

    public int CountRoomsBySite(SQLiteConnectionHelper conn){
        return _utilitiesRooms.GetRoomsBySite(conn).getCount();
    }

    public String SiteNameByMaterialCode(SQLiteConnectionHelper conn, String materialCode) {

        Cursor cursorSiteName = _utilitiesSites.GetSiteNameByMaterialCode(conn, materialCode);

        String siteName = null;

        if (cursorSiteName.moveToFirst()) {
            siteName = String.valueOf(cursorSiteName.getString(0));
        }

        return siteName;
    }

    public String SiteNameByTestCode(SQLiteConnectionHelper conn, String testCode) {

        Cursor cursorSiteName = _utilitiesSites.GetSiteNameByTestCode(conn, testCode);

        String siteName = null;

        if (cursorSiteName.moveToFirst()) {
            siteName = String.valueOf(cursorSiteName.getString(0));
        }

        return siteName;
    }

    public String SiteNameByUser(SQLiteConnectionHelper conn, int userIdSession){
        Cursor cursorGetSiteNameByUserIdentification = _utilitiesSites.GetSiteNameByUserIdentification(conn, userIdSession);

        String siteName = null;

        if (cursorGetSiteNameByUserIdentification.moveToFirst()) {
            siteName = String.valueOf(cursorGetSiteNameByUserIdentification.getString(0));
        }

        return siteName;
    }
}
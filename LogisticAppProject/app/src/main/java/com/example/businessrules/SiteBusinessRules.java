package com.example.businessrules;

import android.database.Cursor;

import com.example.utilitiesdatabase.SQLiteConnectionHelper;
import com.example.utilitiesdatabase.UtilitiesMaterials;
import com.example.utilitiesdatabase.UtilitiesParticipants;
import com.example.utilitiesdatabase.UtilitiesRooms;
import com.example.utilitiesdatabase.UtilitiesSites;
import com.example.utilitiesdatabase.UtilitiesTests;

import java.util.ArrayList;

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

    public int getSiteId() {
        return SiteId;
    }

    public void setSiteId(int siteId) {
        SiteId = siteId;
    }

    public String getSiteName() {
        return SiteName;
    }

    public void setSiteName(String siteName) {
        SiteName = siteName;
    }

    public String getSiteCity() {
        return SiteCity;
    }

    public void setSiteCity(String siteCity) {
        SiteCity = siteCity;
    }

    UtilitiesRooms _utilitiesRooms = new UtilitiesRooms();
    UtilitiesSites _utilitiesSites = new UtilitiesSites();

    ArrayList<String> SiteInfo;



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

    public ArrayList<String> SitesListByCity(SQLiteConnectionHelper conn, String cityName) {

        ArrayList<SiteBusinessRules> siteList = _utilitiesSites.GetSitesByCity(conn, cityName);

        SiteInfo = new ArrayList<String>();

        for (int i=0; i<siteList.size(); i++){
            SiteInfo.add(siteList.get(i).getSiteName());
        }

        return SiteInfo;
    }

    public String GetSiteIdByName(SQLiteConnectionHelper conn, String siteName) {
        Cursor cursorSiteIdByName = _utilitiesSites.SelectSiteIdByName(conn, siteName);

        String siteId = null;

        if (cursorSiteIdByName.moveToFirst()) {
            siteId = String.valueOf(cursorSiteIdByName.getString(0));
        }

        return siteId;
    }

    public int CountRoomsBySite(SQLiteConnectionHelper conn){
        return _utilitiesRooms.GetRoomsBySite(conn).getCount();
    }

    public int CountRoomsBySiteName(SQLiteConnectionHelper conn, String siteNameSiteDetail) {
        return _utilitiesRooms.SelectRoomsBySiteName(conn, siteNameSiteDetail).getCount();
    }
}
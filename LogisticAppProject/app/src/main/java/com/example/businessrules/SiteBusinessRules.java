package com.example.businessrules;

import com.example.utilitiesdatabase.SQLiteConnectionHelper;
import com.example.utilitiesdatabase.UtilitiesMaterials;
import com.example.utilitiesdatabase.UtilitiesParticipants;
import com.example.utilitiesdatabase.UtilitiesRooms;
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

    public void GetSiteResume()
    {
    }

    public void GetSites()
    {
    }

    public int CountRoomsBySite(SQLiteConnectionHelper conn){
        return _utilitiesRooms.GetRoomsBySite(conn).getCount();
    }
}
//comentario//
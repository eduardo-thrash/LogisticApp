package com.example.utilitiesdatabase;

public class UtilitiesSites {
    public static final String CREATE_TABLE_SITES = "CREATE TABLE SITES (site_id INTEGER PRIMARY KEY, site_name TEXT, city_id INTEGER, FOREIGN KEY(site_id) REFERENCES USERS(site_id), FOREIGN KEY(site_id) REFERENCES MATERIALS(site_id), FOREIGN KEY(site_id) REFERENCES ROOMS(site_id))";

}

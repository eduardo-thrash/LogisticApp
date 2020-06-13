package com.example.utilitiesdatabase;

public class UtilitiesRoles {
    public static final String UsersTable = "ROLES";
    public static final String fieldRoleId = "role_id";
    public static final String fieldRoleName = "role_name";

    public static final String CREATE_TABLE_ROLES = "CREATE TABLE ROLES (role_id INTEGER PRIMARY KEY, role_name TEXT, FOREIGN KEY(role_id) REFERENCES USERS(role_id))";

}

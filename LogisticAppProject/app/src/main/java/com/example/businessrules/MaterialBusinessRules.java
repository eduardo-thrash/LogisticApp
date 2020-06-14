package com.example.businessrules;

public class MaterialBusinessRules {
    public int IdSite;
    public int IdUser;
    public String MaterialCode;
    public String MaterialStatus;
    public String SiteName;
    public String RoomUser;
    public int PackageQuantity;

    public void GetMaterial(){}
    public void GetMaterialDetails(){}
    public void MaterialStatusUpdate(){}

    public int getIdSite() {
        return IdSite;
    }

    public void setIdSite(int idSite) {
        IdSite = idSite;
    }

    public int getIdUser() {
        return IdUser;
    }

    public void setIdUser(int idUser) {
        IdUser = idUser;
    }

    public String getMaterialCode() {
        return MaterialCode;
    }

    public void setMaterialCode(String materialCode) {
        MaterialCode = materialCode;
    }

    public String getMaterialStatus() {
        return MaterialStatus;
    }

    public void setMaterialStatus(String materialStatus) {
        MaterialStatus = materialStatus;
    }

    public String getSiteName() {
        return SiteName;
    }

    public void setSiteName(String siteName) {
        SiteName = siteName;
    }

    public String getRoomUser() {
        return RoomUser;
    }

    public void setRoomUser(String roomUser) {
        RoomUser = roomUser;
    }

    public int getPackageQuantity() {
        return PackageQuantity;
    }

    public void setPackageQuantity(int packageQuantity) {
        PackageQuantity = packageQuantity;
    }
}

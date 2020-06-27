package com.example.utilitiesdatabase;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.businessrules.SiteBusinessRules;

import java.util.ArrayList;

public class UtilitiesSites {
    public static final String CREATE_TABLE_SITES = "CREATE TABLE SITES (site_id INTEGER PRIMARY KEY, site_name TEXT, city_id INTEGER, FOREIGN KEY(site_id) REFERENCES USERS(site_id), FOREIGN KEY(site_id) REFERENCES MATERIALS(site_id), FOREIGN KEY(site_id) REFERENCES ROOMS(site_id))";

    public void RegisterDataDefaultSite(SQLiteConnectionHelper conn){
        SQLiteDatabase db = conn.getWritableDatabase();

        ArrayList<String> InsertSites;
        InsertSites = new ArrayList<>();

        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (1,'Universidad Nacional de Colombia',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (2,'Universidad de Antioquia',25)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (3,'Pontificia Universidad Javeriana',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (4,'Universidad de los Andes',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (5,'Universidad Nacional Abierta y a Distancia',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (6,'Corporacion Universitaria Minuto de Dios',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (7,'Universidad Pedagogica y Tecnologica de Colombia',46)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (8,'Universidad Catolica de Colombia',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (9,'Universidad del Bosque',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (10,'Universidad del Atlantico',4)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (11,'Institucion Universitaria Politecnico Gran Colombiano',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (12,'Universidad Sergio Arboleda',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (13,'Universidad Central',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (14,'Fundacion Universitaria Los Libertadores',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (15,'Universidad de la Costa',4)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (16,'Universidad Externado de Colombia',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (17,'Universidad Militar Nueva Granada',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (18,'Universidad del Tolima',21)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (19,'Universidad del Norte',4)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (20,'Universidad del Rosario',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (21,'Universidad de Pamplona',32)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (22,'Universidad Distrital Francisco Jose de Caldas',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (23,'Intituto Tecnologico Metropolitano de Medellin',26)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (24,'Universidad Simon Bolivar',11)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (25,'Universidad EAN',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (26,'Universidad Libre de Colombia',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (27,'Universidad Autonoma de Occidente',10)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (28,'Universidad del Sinu',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (29,'Universidad Tecnologica de Pereira',35)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (30,'Universidad de la Sabana',13)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (31,'Corporacion Universitaria Republicana',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (32,'Fundacion Universitaria Maria Cano',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (33,'Universidad Piloto de Colombia',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (34,'Universidad Santo Tomas',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (35,'Universidad de Medellin',26)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (36,'Fundacion Universitaria Juan N Corpas',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (37,'Universidad Antonio Nariño',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (38,'Universidad del Valle',10)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (39,'Universidad colegio mayor de cundinamarca',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (40,'Universidad de Bogota Jorge Tadeo Lozano',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (41,'Universidad industrial de Santander',7)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (42,'Politecnico Colombiano Jaime Isaza Cadavid',5)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (43,'Universidad de santander',7)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (44,'Universidad de  la salle',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (45,'Instituto Superior  Mariano Moreno',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (46,'Politecnico internacional',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (47,'Fundacion universitaria San Mateo',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (48,'Fundacion Universitaria Monserrate',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (49,'Fundacion Universitaria Sanitas',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (50,'Universidad Autonoma de Colombia ',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (51,'Ecopetrol',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (52,'Seguros Del Estado',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (53,'Grupo Bolivar',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (54,'Empresa Distribuidora del Pacífico DISPAC',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (55,'SaludTotal',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (56,'Riopaila Castilla S.A',10)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (57,'Avianca',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (58,'Banco De Bogota',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (59,'Davivienda',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (60,'Rio Claro',26)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (61,'Compensar',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (62,'Famisanar',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (63,'Exito',26)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (64,'Alkosto',26)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (65,'Alqueria',17)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (66,'Alpina',17)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (67,'Postobon',26)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (68,'Cafam',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (69,'Sodimac Corona',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (70,'Teradata',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (71,'Db_system',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (72,'Adecco',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (73,'Temporal LTDA',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (74,'Mampower',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (75,'Mudanzas En Bogota',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (76,'Almacen El Condor',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (77,'Jugos California',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (78,'Corpocampo',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (79,'Maderformas',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (80,'Bancolombia',26)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (81,'Grupo Nutresa',26)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (82,'Grupo Epm',26)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (83,'Grupo Sura',26)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (84,'Bavaria',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (85,'Argos',26)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (86,'Nestle',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (87,'Colsubsidio',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (88,'Colombina',10)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (89,'Organización Corona',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (90,'Refineria De Cartagena ',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (91,'Isa',26)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (92,'Olimpica',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (93,'Primax Colombia',48)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (94,'Telefonica Movistar',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (95,'Comapan',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (96,'Cencosud',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (97,'Claro Fijo',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (98,'Grupo Bios',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (99,'Coca- Cola Femsa ',6)");
        InsertSites.add("INSERT INTO SITES (site_id,site_name, city_id) VALUES (100,'Vanti Gas Natural',6)");



        for (int i = 0; i<InsertSites.size();i++){
            db.execSQL(InsertSites.get(i));
        }

        db.close();
    }

    public Cursor GetSiteNameByMaterialCode(SQLiteConnectionHelper conn, String materialCode) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT site_name FROM SITES WHERE site_id = (SELECT site_id FROM MATERIALS WHERE material_code = '"+materialCode+"')",null);

        return cursor;
    }

    public Cursor GetSiteNameByTestCode(SQLiteConnectionHelper conn, String testCode) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT site_name FROM SITES WHERE site_id = (SELECT site_id FROM MATERIALS WHERE material_id = (SELECT test_material_id FROM TESTS WHERE test_code = '"+testCode+"'))",null);

        return cursor;
    }

    public Cursor GetSiteNameByUserIdentification(SQLiteConnectionHelper conn, int userId) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT site_name FROM SITES WHERE site_id = (SELECT site_id FROM USERS WHERE user_id = "+userId+")",null);

        return cursor;
    }

    public ArrayList<SiteBusinessRules> GetSitesByCity(SQLiteConnectionHelper conn, String cityName) {

        SiteBusinessRules site = new SiteBusinessRules();
        ArrayList<SiteBusinessRules> siteList = new ArrayList<SiteBusinessRules>();

        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT site_name FROM SITES WHERE city_id = (SELECT city_id FROM CITIES WHERE city_name = '"+cityName+"')",null);

        while (cursor.moveToNext()){
            site = new SiteBusinessRules();

            site.setSiteName(cursor.getString(0));

            siteList.add(site);
        }

        return siteList;

    }

    public Cursor SelectSiteIdByName(SQLiteConnectionHelper conn, String siteNameSelected) {
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT site_id FROM SITES WHERE site_name = '"+siteNameSelected+"'",null);

        return cursor;
    }
}

package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.businessrules.CityBusinessRules;
import com.example.businessrules.DepartmentBusinessRules;
import com.example.businessrules.DepartureBusinessRules;
import com.example.businessrules.SiteBusinessRules;
import com.example.utilitiesdatabase.SQLiteConnectionHelper;

import java.util.ArrayList;

public class SiteSearchActivity extends AppCompatActivity {

    String CityGeneralName;

    SQLiteConnectionHelper conn = new SQLiteConnectionHelper(this,"bd_LogisticApp",null,1);

    DepartmentBusinessRules department = new DepartmentBusinessRules();
    SiteBusinessRules _siteBusinessRules = new SiteBusinessRules();
    CityBusinessRules city;

    ArrayList<String> DepartmentList = new ArrayList<String>();
    ArrayList<String> CityList;

    Spinner SiteDepartment;
    Spinner SiteCity;
    ListView SiteList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site_search);

        SiteDepartment = findViewById(R.id.sp_site_department);
        SiteCity = findViewById(R.id.sp_site_city);
        SiteList = findViewById(R.id.lvw_site_list);

        DepartmentList();

    }

    private void DepartmentList() {

        DepartmentList = department.getDepartmentByName(conn);

        ArrayAdapter<String> DepartmentAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, DepartmentList);

        SiteDepartment.setAdapter(DepartmentAdapter);

        SiteDepartment.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String departmentOptionName = SiteDepartment.getSelectedItem().toString();

                CityList(departmentOptionName);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void CityList(String departmentOption) {

        city = new CityBusinessRules();

        if(departmentOption!="Seleccione")
        {
            SiteCity.setEnabled(true);

            CityList = city.getCitiesByName(conn, departmentOption);

            ArrayAdapter<String> CityAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, CityList);

            SiteCity.setAdapter(CityAdapter);
        }else{
            SiteCity.setEnabled(false);

            SiteCity.setAdapter(null);
        }

        SiteCity.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String cityOptionName = SiteCity.getSelectedItem().toString();

                if(cityOptionName!="Seleccione" || cityOptionName!=null || cityOptionName!=""){
                    SiteList(cityOptionName);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


    private void SiteList(String cityOption) {

        CityGeneralName = cityOption;

        final ArrayList<String> SiteInformationList = _siteBusinessRules.SitesListByCity(conn, cityOption);

        ArrayAdapter adapterSitesByCity = new ArrayAdapter(this,android.R.layout.simple_list_item_1,SiteInformationList);
        SiteList.setAdapter(adapterSitesByCity);
    }
}

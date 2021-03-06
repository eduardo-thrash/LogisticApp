package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.businessrules.CityBusinessRules;
import com.example.businessrules.DepartmentBusinessRules;
import com.example.businessrules.DepartureBusinessRules;
import com.example.businessrules.MaterialBusinessRules;
import com.example.utilitiesdatabase.SQLiteConnectionHelper;

import java.util.ArrayList;

public class DepartureRegisterActivity extends AppCompatActivity implements DepartureRegisterModal.ActionListener {

    String CityGeneralName;
    String GeneralMaterialCode;

    SQLiteConnectionHelper conn = new SQLiteConnectionHelper(this,"bd_LogisticApp",null,1);

    DepartmentBusinessRules department = new DepartmentBusinessRules();
    DepartureBusinessRules departure = new DepartureBusinessRules();
    MaterialBusinessRules _materialBusinessRules = new MaterialBusinessRules();
    CityBusinessRules city;

    ArrayList<String> DepartmentList = new ArrayList<String>();
    ArrayList<String> CityList;

    Spinner SpDepartment;
    Spinner SpCity;
    ListView ListViewMaterial;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departure_register);

        SpDepartment =(Spinner)findViewById(R.id.sp_department);
        ListViewMaterial = (ListView) findViewById(R.id.lvw_departure_material_list);

        DepartmentList();
    }

    private void DepartmentList() {

        DepartmentList = department.getDepartmentByName(conn);

        ArrayAdapter<String> DepartmentAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, DepartmentList);

        SpDepartment.setAdapter(DepartmentAdapter);

        SpDepartment.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String departmentOptionName = SpDepartment.getSelectedItem().toString();

                CityList(departmentOptionName);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void CityList(String departmentOption) {

        city = new CityBusinessRules();

        SpCity =(Spinner)findViewById(R.id.sp_city);

        if(departmentOption!="Seleccione")
        {
            SpCity.setEnabled(true);

            CityList = city.getCitiesByName(conn, departmentOption);

            ArrayAdapter<String> CityAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, CityList);

            SpCity.setAdapter(CityAdapter);
        }else{
            SpCity.setEnabled(false);

            SpCity.setAdapter(null);
        }

        SpCity.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String cityOptionName = SpCity.getSelectedItem().toString();

                if(cityOptionName!="Seleccione" || cityOptionName!=null || cityOptionName!=""){
                    DepartureList(cityOptionName);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void DepartureList(String cityOption) {

        CityGeneralName = cityOption;

        final ArrayList<String> InformationLIst = departure.GetDepartures(conn, cityOption);

        ArrayAdapter adapterDepartureMaterial = new ArrayAdapter(this,android.R.layout.simple_list_item_1,InformationLIst);
        ListViewMaterial.setAdapter(adapterDepartureMaterial);

        ListViewMaterial.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                DepartureRegisterModal modalBottomSheet = new DepartureRegisterModal();
                modalBottomSheet.setmActionListener(DepartureRegisterActivity.this);
                modalBottomSheet.show(getSupportFragmentManager(),"");

                ArrayList<String> InformationMaterialCodeList = departure.GetDepartureMaterialsCode(conn, CityGeneralName);

                GeneralMaterialCode = InformationMaterialCodeList.get(position);

            }
        });
    }

    @Override
    public void onButtonClick(int id) {
        if(id == R.id.btn_accept){
            String statusCodeName = _materialBusinessRules.MaterialStatusByMaterialCode(conn, GeneralMaterialCode);

            if(statusCodeName.equals("En despacho")){
                departure.MaterialStatusUpdate(conn, GeneralMaterialCode);
                DepartureList(CityGeneralName);
                Toast.makeText(getApplicationContext(),GeneralMaterialCode + " actualizado.",Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(getApplicationContext(),GeneralMaterialCode + " fue despachado anteriormente.",Toast.LENGTH_LONG).show();
            }
        }
        if(id == R.id.btn_cancel){
        }
    }
}
package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.example.businessrules.MaterialBusinessRules;
import com.example.businessrules.SessionBusinessRules;
import com.example.businessrules.SiteBusinessRules;
import com.example.businessrules.UserBusinessRules;
import com.example.utilitiesdatabase.SQLiteConnectionHelper;

import java.util.ArrayList;

public class MaterialSearchActivity extends AppCompatActivity {

    SQLiteConnectionHelper conn = new SQLiteConnectionHelper(this,"bd_LogisticApp",null,1);

    SiteBusinessRules _siteBusinessRules = new SiteBusinessRules();
    SessionBusinessRules _sessionBusinessRules = new SessionBusinessRules();
    UserBusinessRules _userBusinessRules = new UserBusinessRules();
    MaterialBusinessRules _materialBusinessRules = new MaterialBusinessRules();

    EditText MaterialsSiteDescription;
    EditText MaterialsDelegateDescription;
    ListView ListViewMaterial;

    int userIdSession = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_search);

        userIdSession = _sessionBusinessRules.ValidateSessionActive(conn);

        MaterialsSiteDescription = findViewById(R.id.txt_materials_site_description);
        MaterialsDelegateDescription = findViewById(R.id.txt_materials_delegate_description);
        ListViewMaterial = findViewById(R.id.lvw_material_list);

        String siteName = _siteBusinessRules.SiteNameByUser(conn, userIdSession);
        String delegateName = _userBusinessRules.UserNameByUser(conn, userIdSession);

        ListMaterialByUser(conn, userIdSession);

        MaterialsSiteDescription.setText(siteName);
        MaterialsDelegateDescription.setText(delegateName);
    }

    private void ListMaterialByUser(SQLiteConnectionHelper conn, int userIdSession) {

        final ArrayList<String> materialList = _materialBusinessRules.MaterialListByUser(conn, userIdSession);

        ArrayAdapter adapterMaterialList = new ArrayAdapter(this,android.R.layout.simple_list_item_1,materialList);

        ListViewMaterial.setAdapter(adapterMaterialList);
    }
}
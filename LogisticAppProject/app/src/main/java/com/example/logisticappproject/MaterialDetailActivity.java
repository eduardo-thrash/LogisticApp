package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.businessrules.MaterialBusinessRules;
import com.example.businessrules.SiteBusinessRules;
import com.example.businessrules.TestBusinessRules;
import com.example.businessrules.UserBusinessRules;
import com.example.utilitiesdatabase.SQLiteConnectionHelper;

public class MaterialDetailActivity extends AppCompatActivity {

    SQLiteConnectionHelper conn = new SQLiteConnectionHelper(this,"bd_LogisticApp",null,1);

    SiteBusinessRules _siteBusinessRules = new SiteBusinessRules();
    MaterialBusinessRules _materialBusinessRules = new MaterialBusinessRules();
    TestBusinessRules _testBusinessRules = new TestBusinessRules();
    UserBusinessRules _userBusinessRules = new UserBusinessRules();

    String MaterialCode;

    TextView MaterialDetailSiteNameDescription;
    TextView MaterialDetailMaterialCodeDescription;
    TextView MaterialDetailPackagesDescription;
    TextView MaterialDetailTestNumberDescription;
    TextView MaterialDetailStatusDescription;
    TextView MaterialDetailRoomBossDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_detail);

        MaterialCode = getIntent().getStringExtra("materialCode");

        MaterialDetailSiteNameDescription = findViewById(R.id.lbl_material_detail_site_name_description);
        MaterialDetailMaterialCodeDescription = findViewById(R.id.lbl_material_detail_material_code_description);
        MaterialDetailPackagesDescription = findViewById(R.id.lbl_material_detail_packages_description);
        MaterialDetailTestNumberDescription = findViewById(R.id.lbl_material_detail_test_number_description);
        MaterialDetailStatusDescription = findViewById(R.id.lbl_material_detail_status_description);
        MaterialDetailRoomBossDescription = findViewById(R.id.lbl_material_detail_room_boss_description);

        MaterialDetailSiteNameDescription.setText(_siteBusinessRules.SiteNameByMaterialCode(conn, MaterialCode));
        MaterialDetailMaterialCodeDescription.setText(MaterialCode);
        MaterialDetailPackagesDescription.setText(_materialBusinessRules.PackageNumberByMaterialCode(conn, MaterialCode));
        MaterialDetailTestNumberDescription.setText(_testBusinessRules.TestNumberByMaterialCode(conn, MaterialCode));


        _materialBusinessRules.MaterialStatusUpdateByScan(conn, MaterialCode);

        MaterialDetailStatusDescription.setText(_materialBusinessRules.MaterialStatusByMaterialCode(conn, MaterialCode));



        MaterialDetailRoomBossDescription.setText(_userBusinessRules.TestRoomBossByMaterialCode(conn, MaterialCode));




    }



    public void NotificationMaterialActivity (View view){
        Intent NotificationMaterialActivity = new Intent(this, NotificationMaterialActivity.class);
        startActivity(NotificationMaterialActivity);
    }


}

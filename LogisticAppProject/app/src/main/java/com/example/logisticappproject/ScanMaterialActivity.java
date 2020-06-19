package com.example.logisticappproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.businessrules.MaterialBusinessRules;
import com.example.utilitiesdatabase.SQLiteConnectionHelper;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class ScanMaterialActivity extends AppCompatActivity {

    SQLiteConnectionHelper conn = new SQLiteConnectionHelper(this,"bd_LogisticApp",null,1);

    MaterialBusinessRules _materialBusinessRules = new MaterialBusinessRules();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_material);

        new IntentIntegrator(ScanMaterialActivity.this).initiateScan();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);

        if(_materialBusinessRules.SearchMaterialByCode(conn, result.getContents())!= null){
            Intent MaterialDetailActivity = new Intent(this, MaterialDetailActivity.class);
            MaterialDetailActivity.putExtra("materialCode", result.getContents());

            startActivity(MaterialDetailActivity);
        }else{
            Toast.makeText(getApplicationContext(),"QR incorrecto",Toast.LENGTH_SHORT).show();
        }
    }

    public void MaterialDetailActivity (View view){
        Intent MaterialDetailActivity = new Intent(this, MaterialDetailActivity.class);
        startActivity(MaterialDetailActivity);
    }
}

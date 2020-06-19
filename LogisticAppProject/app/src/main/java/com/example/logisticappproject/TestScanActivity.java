package com.example.logisticappproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.businessrules.MaterialBusinessRules;
import com.example.businessrules.TestBusinessRules;
import com.example.utilitiesdatabase.SQLiteConnectionHelper;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;


public class TestScanActivity extends AppCompatActivity {

    SQLiteConnectionHelper conn = new SQLiteConnectionHelper(this,"bd_LogisticApp",null,1);

    TestBusinessRules _testBusinessRules = new TestBusinessRules();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_scan);

        new IntentIntegrator(TestScanActivity.this).initiateScan();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);

        if(_testBusinessRules.SearchTestByCode(conn, result.getContents())!= null){
            Intent TestDetailActivity = new Intent(this, TestDetailActivity.class);
            TestDetailActivity.putExtra("testCode", result.getContents());

            startActivity(TestDetailActivity);
        }else{
            Toast.makeText(getApplicationContext(),"QR incorrecto",Toast.LENGTH_SHORT).show();
        }
    }

    public void TestDetailActivity (View view){
        Intent TestDetailActivity = new Intent(this, TestDetailActivity.class);
        startActivity(TestDetailActivity);

    }



}

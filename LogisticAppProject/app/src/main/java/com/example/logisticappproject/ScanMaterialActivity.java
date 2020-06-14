package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ScanMaterialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_material);
    }

    public void MaterialDetailActivity (View view){
        Intent MaterialDetailActivity = new Intent(this, MaterialDetailActivity.class);
        startActivity(MaterialDetailActivity);
    }

}

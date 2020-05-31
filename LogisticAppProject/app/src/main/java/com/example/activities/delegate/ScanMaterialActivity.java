package com.example.activities.delegate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.example.logisticappproject.R;

public class ScanMaterialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_material);
    }

    public void DetalleMaterialView (View view){
        Intent MaterilDetail = new Intent(this, MaterialDetailActivity.class);
        startActivity(MaterilDetail);
    }

}

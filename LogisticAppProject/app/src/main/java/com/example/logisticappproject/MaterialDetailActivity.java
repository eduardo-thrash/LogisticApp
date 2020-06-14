package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MaterialDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_detail);
    }
	public void NotificationMaterialActivity (View view){
        Intent NotificationMaterialActivity = new Intent(this, NotificationMaterialActivity.class);
        startActivity(NotificationMaterialActivity);
    }
}

package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SiteDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site_detail);
    }

    public void RoomResumen (View view){
        Intent ResumenSalon = new Intent(this, RoomResumeActivity.class);
        startActivity(ResumenSalon);

    }
    public void NotificationSite (View view){
        Intent NovedadesSitio = new Intent(this, NotificationBySiteActivity.class);
        startActivity(NovedadesSitio);

    }
}

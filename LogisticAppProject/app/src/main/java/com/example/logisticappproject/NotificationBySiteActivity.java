package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NotificationBySiteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_by_site);
    }

    public void SiteNotificationsDetailsActivity (View view){
        Intent SiteNotificationsDetailsActivity = new Intent(this, SiteNotificationsDetailsActivity.class);
        startActivity(SiteNotificationsDetailsActivity);

    }
}

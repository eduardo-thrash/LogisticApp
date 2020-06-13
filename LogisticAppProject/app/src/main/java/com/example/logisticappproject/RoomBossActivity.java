package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.logisticappproject.R;

public class RoomBossActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_boss);
    }

    public void PasswordChangeActivity (View view){
        Intent PasswordChangeActivity = new Intent(this, com.example.logisticappproject.PasswordChangeActivity.class);
        startActivity(PasswordChangeActivity);
    }

    public void HelpActivity (View view){
        Intent HelpActivity = new Intent(this, com.example.logisticappproject.HelpActivity.class);
        startActivity(HelpActivity); }

    public void TestSearchActivity (View view){
        Intent TestSearchActivity = new Intent(this, TestSearchActivity.class);
        startActivity(TestSearchActivity);

    }

    public void TestScanActivity (View view){
        Intent TestScanActivity = new Intent(this, TestScanActivity.class);
        startActivity(TestScanActivity);
    }

    public void SiteNotificationDetailByRoomActivity (View view){
        Intent SiteNotificationDetailByRoomActivity = new Intent(this, SiteNotificationDetailByRoomActivity.class);
        startActivity(SiteNotificationDetailByRoomActivity);

    }

    public void SiteNotificationsDetailsActivity (View view){
        Intent SiteNotificationsDetailsActivity = new Intent(this, SiteNotificationsDetailsActivity.class);
        startActivity(SiteNotificationsDetailsActivity);

    }

    public void RoomResumeActivity (View view){
        Intent RoomResumeActivity = new Intent(this, RoomResumeActivity.class);
        startActivity(RoomResumeActivity);

    }

}

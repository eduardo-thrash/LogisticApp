package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RoomResumeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_resume);
    }
    public void SiteNotificationDetailByRoomActivity (View view){
        Intent SiteNotificationDetailByRoomActivity = new Intent(this, SiteNotificationDetailByRoomActivity.class);
        startActivity(SiteNotificationDetailByRoomActivity);

    }
}
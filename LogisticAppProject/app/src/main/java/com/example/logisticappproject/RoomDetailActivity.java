package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RoomDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_detail);
    }

    public void RoomNotification (View view){
        Intent RoomNotification = new Intent(this, RoomNotificationActivity.class);
        startActivity(RoomNotification);

    }
}


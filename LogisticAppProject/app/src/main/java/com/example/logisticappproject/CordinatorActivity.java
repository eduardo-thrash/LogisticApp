package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.logisticappproject.HelpActivity;
import com.example.logisticappproject.R;
import com.example.logisticappproject.RoomNotificationActivity;
import com.example.logisticappproject.SiteSearchActivity;

public class CordinatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cordinator);
    }

    public void PasswordChangeActivity (View view){
        Intent PasswordChangeActivity = new Intent(this, com.example.logisticappproject.PasswordChangeActivity.class);
        startActivity(PasswordChangeActivity);

    }

    public void HelpActivity (View view){
        Intent HelpActivity = new Intent(this, com.example.logisticappproject.HelpActivity.class);
        startActivity(HelpActivity);

    }

    public void SiteSearchActivity (View view){
        Intent SiteSearchActivity = new Intent(this, com.example.logisticappproject.SiteSearchActivity.class);
        startActivity(SiteSearchActivity);

    }

    public void RoomNotification (View view){
        Intent RoomNotification = new Intent(this, com.example.logisticappproject.RoomNotificationActivity.class);
        startActivity(RoomNotification);

    }


}

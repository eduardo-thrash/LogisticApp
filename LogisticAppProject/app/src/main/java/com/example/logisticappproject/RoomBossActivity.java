package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.businessrules.SessionBusinessRules;
import com.example.logisticappproject.R;
import com.example.utilitiesdatabase.SQLiteConnectionHelper;

public class RoomBossActivity extends AppCompatActivity {

    SQLiteConnectionHelper conn = new SQLiteConnectionHelper(this,"bd_LogisticApp",null,1);

    SessionBusinessRules _sessionBusinessRules = new SessionBusinessRules();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_boss);
    }

    //Conexiones layouts Room Boss

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

    public void NotificationTestActivity (View view){
        Intent NotificationTestActivityLauncher = new Intent(this, NotificationTestActivity.class);
        startActivity(NotificationTestActivityLauncher);

    }

    public void PageRoomNotificationActivity (View view){
        Intent LauncherRoomNotificationActivity = new Intent(this, RoomNotificationActivity.class);
        startActivity(LauncherRoomNotificationActivity);

    }

    public void SiteNotificationsDetailsActivity (View view){
        Intent SiteNotificationsDetailsActivity = new Intent(this, SiteNotificationsDetailsActivity.class);
        startActivity(SiteNotificationsDetailsActivity);

    }

    public void RoomResumeActivity (View view){
        Intent RoomResumeActivity = new Intent(this, RoomResumeActivity.class);
        startActivity(RoomResumeActivity);

    }

    public void RoomBossLogout (View view){

        if(_sessionBusinessRules.DestroySession(conn)){
            Intent LauncherActivity = new Intent(this, com.example.logisticappproject.LoginActivity.class);
            startActivity(LauncherActivity);
        }else{
            Toast.makeText(getApplicationContext(),"Error al cerrar sesión, intente de nuevo.",Toast.LENGTH_LONG).show();
        }
    }

}

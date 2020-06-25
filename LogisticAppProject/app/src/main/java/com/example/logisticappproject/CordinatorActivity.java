package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.businessrules.SessionBusinessRules;
import com.example.logisticappproject.HelpActivity;
import com.example.logisticappproject.R;
import com.example.logisticappproject.RoomNotificationActivity;
import com.example.logisticappproject.SiteSearchActivity;
import com.example.utilitiesdatabase.SQLiteConnectionHelper;

public class CordinatorActivity extends AppCompatActivity {

    SQLiteConnectionHelper conn = new SQLiteConnectionHelper(this,"bd_LogisticApp",null,1);

    SessionBusinessRules _sessionBusinessRules = new SessionBusinessRules();

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

    public void CoordinatorLogout (View view){

        if(_sessionBusinessRules.DestroySession(conn)){
            Intent LauncherActivity = new Intent(this, com.example.logisticappproject.LoginActivity.class);
            startActivity(LauncherActivity);
        }else{
            Toast.makeText(getApplicationContext(),"Error al cerrar sesión, intente de nuevo.",Toast.LENGTH_LONG).show();
        }
    }
}

package com.example.logisticappproject;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.businessrules.SessionBusinessRules;
import com.example.logisticappproject.R;
import com.example.utilitiesdatabase.SQLiteConnectionHelper;

public class DistributorActivity extends AppCompatActivity {

    SQLiteConnectionHelper conn = new SQLiteConnectionHelper(this,"bd_LogisticApp",null,1);

    SessionBusinessRules _sessionBusinessRules = new SessionBusinessRules();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distributor);
    }
    public void PasswordChangeActivity (View view){
        Intent PasswordChangeActivity = new Intent(this, com.example.logisticappproject.PasswordChangeActivity.class);
        startActivity(PasswordChangeActivity);
    }

    public void DepartureRegisterActivity (View view){
        Intent DepartureRegisterActivity = new Intent(this, DepartureRegisterActivity.class);
        startActivity(DepartureRegisterActivity);

    }

    public void HelpActivity (View view){
        Intent HelpActivity = new Intent(this, com.example.logisticappproject.HelpActivity.class);
        startActivity(HelpActivity);

    }

    public void DistributorLogout (View view){

        if(_sessionBusinessRules.DestroySession(conn)){
            Intent LauncherActivity = new Intent(this, com.example.logisticappproject.LoginActivity.class);
            startActivity(LauncherActivity);
        }else{
            Toast.makeText(getApplicationContext(),"Error al cerrar sesión, intente de nuevo.",Toast.LENGTH_LONG).show();
        }
    }
}


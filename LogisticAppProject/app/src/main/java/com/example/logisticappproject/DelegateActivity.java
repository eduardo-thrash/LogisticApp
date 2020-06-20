package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.logisticappproject.R;

public class DelegateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delegate);
    }

    public void PasswordChangeActivity (View view){
        Intent PasswordChangeActivity = new Intent(this, com.example.logisticappproject.PasswordChangeActivity.class);
        startActivity(PasswordChangeActivity);

    }
    public void HelpActivity (View view){
        Intent HelpActivity = new Intent(this, com.example.logisticappproject.HelpActivity.class);
        startActivity(HelpActivity);

    }

    public void MaterialSearchActivity (View view){
        Intent MaterialSearchActivity = new Intent(this, MaterialSearchActivity.class);
        startActivity(MaterialSearchActivity);

    }
    public void ScanMaterialActivity (View view){
        Intent ScanMaterialActivity = new Intent(this, ScanMaterialActivity.class);
        startActivity(ScanMaterialActivity);
    }

    public void NotificationMaterialActivity (View view){
        Intent NotificationMaterialActivity = new Intent(this, NotificationMaterialActivity.class);
        startActivity(NotificationMaterialActivity);
    }

    public void SiteResumeActivity (View view){
        Intent SiteResumeActivity = new Intent(this, SiteResumeActivity.class);
        startActivity(SiteResumeActivity);
    }


}

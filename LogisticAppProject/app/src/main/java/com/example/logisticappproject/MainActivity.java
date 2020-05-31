package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.activities.delegate.MaterialDetailActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        Intent launcherActivity = new Intent(this, MaterialDetailActivity.class);
        startActivity(launcherActivity);
    }
}

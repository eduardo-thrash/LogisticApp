package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TestDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_detail);
    }
	
	 public void NotificationTestActivity (View view){
        Intent NotificationTestActivity = new Intent(this, NotificationTestActivity.class);
        startActivity(NotificationTestActivity);

    }
}

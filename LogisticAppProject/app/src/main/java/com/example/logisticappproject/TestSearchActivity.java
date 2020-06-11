package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TestSearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_search);
    }
    public void TestDetailActivity (View view){
        Intent TestDetailActivity = new Intent(this, TestDetailActivity.class);
        startActivity(TestDetailActivity);

    }
}

package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.businessrules.MaterialBusinessRules;
import com.example.businessrules.ParticipantBusinessRules;
import com.example.businessrules.SiteBusinessRules;
import com.example.businessrules.TestBusinessRules;
import com.example.businessrules.UserBusinessRules;
import com.example.utilitiesdatabase.SQLiteConnectionHelper;

public class TestDetailActivity extends AppCompatActivity {

    SQLiteConnectionHelper conn = new SQLiteConnectionHelper(this,"bd_LogisticApp",null,1);

    SiteBusinessRules _siteBusinessRules = new SiteBusinessRules();
    ParticipantBusinessRules _participantBusinessRules = new ParticipantBusinessRules();

    String TestCode;

    TextView TestDetailSiteNameDescription;
    TextView TestDetailDocumentDescription;
    TextView TestDetailParticipantNameDescription;
    TextView TestDetailCodeDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_detail);

        TestCode = getIntent().getStringExtra("testCode");

        TestDetailCodeDescription = findViewById(R.id.lbl_test_detail_code_description);
        TestDetailSiteNameDescription = findViewById(R.id.lbl_test_detail_site_name_description);
        TestDetailDocumentDescription = findViewById(R.id.lbl_test_detail_document_description);
        TestDetailParticipantNameDescription = findViewById(R.id.lbl_test_detail_participant_name_description);

        TestDetailCodeDescription.setText(TestCode);
        TestDetailSiteNameDescription.setText(_siteBusinessRules.SiteNameByTestCode(conn,TestCode));
        TestDetailDocumentDescription.setText(_participantBusinessRules.ParticipantDocumentTypeByTestCode(conn,TestCode)+" - "+_participantBusinessRules.ParticipantDocumentIdByTestCode(conn,TestCode));
        TestDetailParticipantNameDescription.setText(_participantBusinessRules.ParticipantNameByTestCode(conn,TestCode));
    }

    public void NotificationTestActivity (View view){
        Intent NotificationTestActivity = new Intent(this, NotificationTestActivity.class);
        startActivity(NotificationTestActivity);
    }
}

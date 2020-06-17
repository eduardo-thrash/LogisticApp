package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.businessrules.NotificationBusinessRules;
import com.example.businessrules.ParticipantBusinessRules;
import com.example.businessrules.RoomBusinessRules;
import com.example.businessrules.SiteBusinessRules;
import com.example.businessrules.TestBusinessRules;
import com.example.utilitiesdatabase.SQLiteConnectionHelper;

public class SiteResumeActivity extends AppCompatActivity {

    SQLiteConnectionHelper conn = new SQLiteConnectionHelper(this,"bd_LogisticApp",null,1);

    TextView SiteResumeRoomQuantityDetail;
    TextView SiteResumeMissingMaterialDetail;
    TextView SiteResumeAdditionalMaterialDetail;
    TextView SiteResumeRoomNumberDetail;
    TextView SiteResumeParticipants;
    TextView SiteResumeParticipantsPresentDetail;
    TextView SiteResumeMissingParticipantsDetail;
    TextView SiteResumeCancelTestDetail;
    TextView SiteResumeMissingPersonalDetail;

    SiteBusinessRules _siteBusinessRules = new SiteBusinessRules();
    NotificationBusinessRules _notificationBusinessRules = new NotificationBusinessRules();
    RoomBusinessRules _roomBusinessRules = new RoomBusinessRules();
    ParticipantBusinessRules _participantBusinessRules = new ParticipantBusinessRules();
    TestBusinessRules _testBusinessRules = new TestBusinessRules();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site_resume);

        ShowSiteResume();
    }

    public void ShowSiteResume(){
        SiteResumeRoomQuantityDetail = findViewById(R.id.lbl_site_resume_room_quantity_detail);
        SiteResumeMissingMaterialDetail = findViewById(R.id.lbl_site_resume_missing_material_detail);
        SiteResumeAdditionalMaterialDetail = findViewById(R.id.lbl_site_resume_additional_material_detail);
        SiteResumeRoomNumberDetail = findViewById(R.id.lbl_site_resume_room_number_detail);
        SiteResumeParticipants= findViewById(R.id.lbl_site_resume_participants_detail);
        SiteResumeParticipantsPresentDetail= findViewById(R.id.lbl_site_resume_present_participants_detail);
        SiteResumeMissingParticipantsDetail = findViewById(R.id.lbl_site_missing_participant_detail);
        SiteResumeCancelTestDetail = findViewById(R.id.lbl_site_cancel_test_detail);
        SiteResumeMissingPersonalDetail = findViewById(R.id.lbl_site_resume_missing_personal_detail);

        SiteResumeRoomQuantityDetail.setText(String.valueOf(_siteBusinessRules.CountRoomsBySite(conn)));
        SiteResumeMissingMaterialDetail.setText(String.valueOf(_notificationBusinessRules.CountMissingMaterialBySite(conn)));
        SiteResumeAdditionalMaterialDetail.setText(String.valueOf(_notificationBusinessRules.CountAdditionalMaterialBySite(conn)));
        SiteResumeRoomNumberDetail.setText(String.valueOf(_roomBusinessRules.CountRoomsBySite(conn)));
        SiteResumeParticipants.setText(String.valueOf(_participantBusinessRules.CountParticipantsBySite(conn)));
        SiteResumeParticipantsPresentDetail.setText(String.valueOf(_testBusinessRules.CountPresentParticipants(conn)));
        SiteResumeMissingParticipantsDetail.setText(String.valueOf(_notificationBusinessRules.CountMissingParticipants(conn)));
        SiteResumeCancelTestDetail.setText(String.valueOf(_notificationBusinessRules.CountCancelTest(conn)));
        SiteResumeMissingPersonalDetail.setText(String.valueOf(_notificationBusinessRules.CountMissingPersonalBySite(conn)));
    }
}

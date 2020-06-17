package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.businessrules.NotificationBusinessRules;
import com.example.businessrules.ParticipantBusinessRules;
import com.example.businessrules.RoomBusinessRules;
import com.example.businessrules.SiteBusinessRules;
import com.example.businessrules.TestBusinessRules;
import com.example.utilitiesdatabase.SQLiteConnectionHelper;

public class SiteDetailActivity extends AppCompatActivity {

    SQLiteConnectionHelper conn = new SQLiteConnectionHelper(this,"bd_LogisticApp",null,1);

    TextView SiteDetailRoomQuantityDetail;
    TextView SiteDetailMissingMaterialDetail;
    TextView SiteDetailAdditionalMaterialDetail;
    TextView SiteDetailRoomNumberDetail;
    TextView SiteDetailParticipants;
    TextView SiteDetailParticipantsPresentDetail;
    TextView SiteDetailMissingParticipantsDetail;
    TextView SiteDetailCancelTestDetail;
    TextView SiteDetailMissingPersonalDetail;
    Button SiteDetailViewResumeByRoom;
    Button SiteDetailViewNotificationBySite;

    SiteBusinessRules _siteBusinessRules = new SiteBusinessRules();
    NotificationBusinessRules _notificationBusinessRules = new NotificationBusinessRules();
    RoomBusinessRules _roomBusinessRules = new RoomBusinessRules();
    ParticipantBusinessRules _participantBusinessRules = new ParticipantBusinessRules();
    TestBusinessRules _testBusinessRules = new TestBusinessRules();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site_detail);

        final Intent NotificationBySiteActivity = new Intent(this,NotificationBySiteActivity.class);
        final Intent RoomResumeActivity = new Intent(this,RoomResumeActivity.class);

        ShowSiteDetail();

        SiteDetailViewResumeByRoom = findViewById(R.id.btn_site_detail_view_resume_by_room);
        SiteDetailViewNotificationBySite = findViewById(R.id.btn_site_detail_view_notification_by_site);

        SiteDetailViewResumeByRoom.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"addressing to ViewResumeByRoom",Toast.LENGTH_SHORT).show();
                startActivity(NotificationBySiteActivity);
            }
        });

        SiteDetailViewNotificationBySite.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"addressing to ViewNotificationBySite",Toast.LENGTH_SHORT).show();
                startActivity(RoomResumeActivity);
            }
        });
    }

    public void ShowSiteDetail(){
        SiteDetailRoomQuantityDetail = findViewById(R.id.lbl_site_detail_room_quantity_detail);
        SiteDetailMissingMaterialDetail = findViewById(R.id.lbl_site_detail_missing_material_detail);
        SiteDetailAdditionalMaterialDetail = findViewById(R.id.lbl_site_detail_additional_material_detail);
        SiteDetailRoomNumberDetail = findViewById(R.id.lbl_site_detail_room_number_detail);
        SiteDetailParticipants= findViewById(R.id.lbl_site_detail_participants_detail);
        SiteDetailParticipantsPresentDetail= findViewById(R.id.lbl_site_detail_present_participants_detail);
        SiteDetailMissingParticipantsDetail = findViewById(R.id.lbl_site_missing_participant_detail);
        SiteDetailCancelTestDetail = findViewById(R.id.lbl_site_cancel_test_detail);
        SiteDetailMissingPersonalDetail = findViewById(R.id.lbl_site_detail_missing_personal_detail);

        SiteDetailRoomQuantityDetail.setText(String.valueOf(_siteBusinessRules.CountRoomsBySite(conn)));
        SiteDetailMissingMaterialDetail.setText(String.valueOf(_notificationBusinessRules.CountMissingMaterialBySite(conn)));
        SiteDetailAdditionalMaterialDetail.setText(String.valueOf(_notificationBusinessRules.CountAdditionalMaterialBySite(conn)));
        SiteDetailRoomNumberDetail.setText(String.valueOf(_roomBusinessRules.CountRoomsBySite(conn)));
        SiteDetailParticipants.setText(String.valueOf(_participantBusinessRules.CountParticipantsBySite(conn)));
        SiteDetailParticipantsPresentDetail.setText(String.valueOf(_testBusinessRules.CountPresentParticipants(conn)));
        SiteDetailMissingParticipantsDetail.setText(String.valueOf(_notificationBusinessRules.CountMissingParticipants(conn)));
        SiteDetailCancelTestDetail.setText(String.valueOf(_notificationBusinessRules.CountCancelTest(conn)));
        SiteDetailMissingPersonalDetail.setText(String.valueOf(_notificationBusinessRules.CountMissingPersonalBySite(conn)));
    }
}

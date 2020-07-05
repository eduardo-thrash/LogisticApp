package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.businessrules.NotificationBusinessRules;
import com.example.businessrules.ParticipantBusinessRules;
import com.example.businessrules.RoomBusinessRules;
import com.example.businessrules.SessionBusinessRules;
import com.example.businessrules.TestBusinessRules;
import com.example.utilitiesdatabase.SQLiteConnectionHelper;


public class RoomResumeActivity extends AppCompatActivity {

    SQLiteConnectionHelper conn = new SQLiteConnectionHelper(this,"bd_LogisticApp",null,1);

    RoomBusinessRules _roomBusinessRules = new RoomBusinessRules();
    TestBusinessRules _testBusinessRules = new TestBusinessRules();
    SessionBusinessRules _sessionBusinessRules = new SessionBusinessRules();
    NotificationBusinessRules _notificationBusinessRules = new NotificationBusinessRules();
    ParticipantBusinessRules _participantBusinessRules = new ParticipantBusinessRules();

    int userRoomBossIdSession = 0;

    EditText RoomResumeName;
    TextView RoomResumeTestQuantityDetail;
    TextView RoomResumeMissingTestDetail;
    TextView RoomResumeAdditionalTestDetail;
    TextView RoomResumeParticipantsDetail;
    TextView RoomResumePresentParticipantsDetail;
    TextView RoomResumeMissingParticipantsDetail;
    TextView RoomCancelTestDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_resume);

        RoomResumeName = findViewById(R.id.txt_room_resume_name);
        RoomResumeTestQuantityDetail = findViewById(R.id.lbl_room_resume_test_quantity_detail);
        RoomResumeMissingTestDetail = findViewById(R.id.lbl_room_resume_missing_test_detail);
        RoomResumeAdditionalTestDetail = findViewById(R.id.lbl_room_resume_additional_test_detail);
        RoomResumeParticipantsDetail = findViewById(R.id.lbl_room_resume_room_number_detail);
        RoomResumePresentParticipantsDetail = findViewById(R.id.lbl_room_resume_participants_detail);
        RoomResumeMissingParticipantsDetail = findViewById(R.id.lbl_room_resume_missing_participants_detail);
        RoomCancelTestDetail = findViewById(R.id.lbl_room_cancel_test_detail);

        userRoomBossIdSession = _sessionBusinessRules.ValidateSessionActive(conn);

        ShowRoomResume();
    }

    private void ShowRoomResume() {
        String RoomName = _roomBusinessRules.RoomNameByUser(conn, userRoomBossIdSession);
        String RoomId = _roomBusinessRules.RoomIdByUser(conn, userRoomBossIdSession);

        RoomResumeName.setText(String.valueOf(RoomName));

        RoomResumeTestQuantityDetail.setText(String.valueOf(_testBusinessRules.TestQuantityByRoom(conn, RoomId)));
        RoomResumeMissingTestDetail.setText(String.valueOf(_notificationBusinessRules.NotificationMissingTestQuantityByRoom(conn, RoomId)));
        RoomResumeAdditionalTestDetail.setText(String.valueOf(_notificationBusinessRules.NotificationAdditionalTestQuantityByRoom(conn, RoomId)));
        RoomResumeParticipantsDetail.setText(String.valueOf(_participantBusinessRules.ParticipantsByRoom(conn, RoomId)));
        RoomResumePresentParticipantsDetail.setText(String.valueOf(_participantBusinessRules.PresentParticipantsByRoom(conn, RoomId)));
        RoomResumeMissingParticipantsDetail.setText(String.valueOf(_notificationBusinessRules.NotificationMissingParticipantsQuantityByRoom(conn, RoomId)));
        RoomCancelTestDetail.setText(String.valueOf(_notificationBusinessRules.NotificationCancelTestQuantityByRoom(conn, RoomId)));
    }

    public void SiteNotificationDetailByRoomActivity (View view){
        Intent SiteNotificationDetailByRoomActivity = new Intent(this, SiteNotificationDetailByRoomActivity.class);
        startActivity(SiteNotificationDetailByRoomActivity);
    }
}
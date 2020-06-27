package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.businessrules.NotificationBusinessRules;
import com.example.businessrules.ParticipantBusinessRules;
import com.example.businessrules.RoomBusinessRules;
import com.example.businessrules.TestBusinessRules;
import com.example.utilitiesdatabase.SQLiteConnectionHelper;

import java.util.ArrayList;

public class RoomDetailActivity extends AppCompatActivity {

    SQLiteConnectionHelper conn = new SQLiteConnectionHelper(this,"bd_LogisticApp",null,1);

    RoomBusinessRules _roomBusinessRules = new RoomBusinessRules();
    TestBusinessRules _testBusinessRules = new TestBusinessRules();
    NotificationBusinessRules _notificationBusinessRules = new NotificationBusinessRules();
    ParticipantBusinessRules _participantBusinessRules = new ParticipantBusinessRules();

    String siteNameForRoomDetailActivity;
    ArrayList<String> RoomList = new ArrayList<String>();

    EditText RoomDetailSiteNameDescription;
    TextView RoomDetailTestQuantityDetail;
    TextView RoomDetailMissingTestDetail;
    TextView RoomDetailAdditionalTestDetail;
    TextView RoomDetailParticipantsDetail;
    TextView RoomDetailPresentParticipantsDetail;
    TextView RoomDetailMissingParticipantsDetail;
    TextView RoomCancelTestDetail;
    Spinner SpRoomDetailRoomSelectionDescription;
    Button ViewRoomDetailNotificationByRoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_detail);

        RoomDetailSiteNameDescription = findViewById(R.id.txt_room_detail_site_name_description);

        RoomDetailTestQuantityDetail = findViewById(R.id.lbl_room_detail_test_quantity_detail);
        RoomDetailMissingTestDetail = findViewById(R.id.lbl_room_detail_missing_test_detail);
        RoomDetailAdditionalTestDetail = findViewById(R.id.lbl_room_detail_additional_test_detail);
        RoomDetailParticipantsDetail = findViewById(R.id.lbl_room_detail_room_number_detail);
        RoomDetailPresentParticipantsDetail = findViewById(R.id.lbl_room_detail_participants_detail);
        RoomDetailMissingParticipantsDetail = findViewById(R.id.lbl_room_detail_missing_participants_detail);
        RoomCancelTestDetail = findViewById(R.id.lbl_room_cancel_test_detail);

        ViewRoomDetailNotificationByRoom = findViewById(R.id.btn_room_detail_notification_by_room);
        SpRoomDetailRoomSelectionDescription = findViewById(R.id.sp_room_detail_room_selection_description);

        siteNameForRoomDetailActivity = getIntent().getStringExtra("siteNameForRoomResume");

        RoomDetailSiteNameDescription.setText(siteNameForRoomDetailActivity);

        RoomListBySite();
    }

    private void RoomListBySite() {

        final Intent siteNotificationDetailByRoomActivityLauncher = new Intent(this,SiteNotificationDetailByRoomActivity.class);

        String siteNameRoomListBySite = siteNameForRoomDetailActivity;

        RoomList = _roomBusinessRules.GetRoomListBySiteName(conn, siteNameRoomListBySite);

        ArrayAdapter<String> DepartmentAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, RoomList);

        SpRoomDetailRoomSelectionDescription.setAdapter(DepartmentAdapter);

        SpRoomDetailRoomSelectionDescription.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                final String RoomNameSelected = SpRoomDetailRoomSelectionDescription.getSelectedItem().toString();

                if(RoomNameSelected != "Seleccione"){
                    final String RoomId = _roomBusinessRules.GetRoomIdByName(conn, RoomNameSelected);

                    RoomDetailTestQuantityDetail.setText(String.valueOf(_testBusinessRules.TestQuantityByRoom(conn, RoomId)));
                    RoomDetailMissingTestDetail.setText(String.valueOf(_notificationBusinessRules.NotificationMissingTestQuantityByRoom(conn, RoomId)));
                    RoomDetailAdditionalTestDetail.setText(String.valueOf(_notificationBusinessRules.NotificationAdditionalTestQuantityByRoom(conn, RoomId)));
                    RoomDetailParticipantsDetail.setText(String.valueOf(_participantBusinessRules.ParticipantsByRoom(conn, RoomId)));
                    RoomDetailPresentParticipantsDetail.setText(String.valueOf(_participantBusinessRules.PresentParticipantsByRoom(conn, RoomId)));
                    RoomDetailMissingParticipantsDetail.setText(String.valueOf(_notificationBusinessRules.NotificationMissingParticipantsQuantityByRoom(conn, RoomId)));
                    RoomCancelTestDetail.setText(String.valueOf(_notificationBusinessRules.NotificationCancelTestQuantityByRoom(conn, RoomId)));

                    ViewRoomDetailNotificationByRoom.setBackgroundResource(R.color.colorPrimaryDark);
                    ViewRoomDetailNotificationByRoom.setEnabled(true);

                    ViewRoomDetailNotificationByRoom.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v) {
                            //Toast.makeText(getApplicationContext(),RoomNameSelected,Toast.LENGTH_LONG).show();

                            siteNotificationDetailByRoomActivityLauncher.putExtra("RoomIdForSiteNotificationDetailByRoomActivity", RoomNameSelected);
                            startActivity(siteNotificationDetailByRoomActivityLauncher);
                        }
                    });
                }else{
                    ViewRoomDetailNotificationByRoom.setBackgroundResource(R.color.colorBlockOption);
                    ViewRoomDetailNotificationByRoom.setEnabled(false);

                    RoomDetailTestQuantityDetail.setText("_");
                    RoomDetailMissingTestDetail.setText("_");
                    RoomDetailAdditionalTestDetail.setText( "_");
                    RoomDetailParticipantsDetail.setText("_");
                    RoomDetailPresentParticipantsDetail.setText("_");
                    RoomDetailMissingParticipantsDetail.setText("_");
                    RoomCancelTestDetail.setText("_");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }

}


package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.example.businessrules.NotificationBusinessRules;
import com.example.businessrules.RoomBusinessRules;
import com.example.utilitiesdatabase.SQLiteConnectionHelper;

import java.util.ArrayList;

public class SiteNotificationDetailByRoomActivity extends AppCompatActivity {

    SQLiteConnectionHelper conn = new SQLiteConnectionHelper(this,"bd_LogisticApp",null,1);

    NotificationBusinessRules _notificationBusinessRules = new NotificationBusinessRules();
    RoomBusinessRules _roomBusinessRules = new RoomBusinessRules();

    EditText RoomNotificationBySiteRoomNameDescription;
    ListView RoomNotificationBySiteListView;
    TextView RoomNotificationBySiteEmptyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site_notification_detail_by_room);

        String RoomNameForNotificationList = getIntent().getStringExtra("RoomIdForSiteNotificationDetailByRoomActivity");

        RoomNotificationBySiteRoomNameDescription =  findViewById(R.id.txt_room_notification_by_site_room_name_description);
        RoomNotificationBySiteListView = findViewById(R.id.lvw_room_notification_by_site_list);
        RoomNotificationBySiteEmptyList = findViewById(R.id.lbl_room_notification_by_site_empty_list);

        RoomNotificationBySiteRoomNameDescription.setText(RoomNameForNotificationList);

        ListNotificationTestByRoom(conn, RoomNameForNotificationList);
    }

    private void ListNotificationTestByRoom(SQLiteConnectionHelper conn, String RoomName) {

        final ArrayList<String> notificationTestList = _notificationBusinessRules.ListTestNotificationByRoom(conn, RoomName);

        if(notificationTestList.size() != 0){
            ArrayAdapter adapterNotificationTestList = new ArrayAdapter(this,android.R.layout.simple_list_item_1,notificationTestList);

            RoomNotificationBySiteListView.setAdapter(adapterNotificationTestList);
        }else{
            RoomNotificationBySiteListView.setVisibility(View.GONE);

            RoomNotificationBySiteEmptyList.setVisibility(View.VISIBLE);
        }
    }
}
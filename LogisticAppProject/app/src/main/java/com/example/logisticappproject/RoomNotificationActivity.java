package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.example.businessrules.NotificationBusinessRules;
import com.example.businessrules.RoomBusinessRules;
import com.example.businessrules.SessionBusinessRules;
import com.example.utilitiesdatabase.SQLiteConnectionHelper;

import java.util.ArrayList;

public class RoomNotificationActivity extends AppCompatActivity {

    SQLiteConnectionHelper conn = new SQLiteConnectionHelper(this,"bd_LogisticApp",null,1);

    RoomBusinessRules _roomBusinessRules = new RoomBusinessRules();
    SessionBusinessRules _sessionBusinessRules = new SessionBusinessRules();
    NotificationBusinessRules _notificationBusinessRules = new NotificationBusinessRules();

    int userRoomBossIdSession = 0;

    EditText RoomsSiteDescription;
    ListView TestNotificationListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_notification);

        RoomsSiteDescription = findViewById(R.id.txt_rooms_site_description);
        TestNotificationListView = findViewById(R.id.lvw_test_notification_list);

        userRoomBossIdSession = _sessionBusinessRules.ValidateSessionActive(conn);
        String RoomName = _roomBusinessRules.RoomNameByUser(conn, userRoomBossIdSession);

        RoomsSiteDescription.setText(RoomName);

        ListNotificationTestByRoom(conn, userRoomBossIdSession);
    }

    private void ListNotificationTestByRoom(SQLiteConnectionHelper conn, int userRoomBossIdSession) {

        final ArrayList<String> notificationTestList = _notificationBusinessRules.ListTestNotificationByRoom(conn, userRoomBossIdSession);

        ArrayAdapter adapterNotificationTestList = new ArrayAdapter(this,android.R.layout.simple_list_item_1,notificationTestList);

        TestNotificationListView.setAdapter(adapterNotificationTestList);
    }


}

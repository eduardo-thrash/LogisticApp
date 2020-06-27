package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.businessrules.NotificationBusinessRules;
import com.example.businessrules.RoomBusinessRules;
import com.example.utilitiesdatabase.SQLiteConnectionHelper;

import java.util.ArrayList;

public class NotificationBySiteActivity extends AppCompatActivity {

    SQLiteConnectionHelper conn = new SQLiteConnectionHelper(this,"bd_LogisticApp",null,1);

    NotificationBusinessRules _notificationBusinessRules = new NotificationBusinessRules();
    RoomBusinessRules _roomBusinessRules = new RoomBusinessRules();

    ArrayList<String> notificationTestList;

    EditText SiteNotificationRoomNameDescription;
    ListView SiteNotificationListView;
    TextView SiteNotificationEmptyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_by_site);

        final Intent siteNotificationsDetailsActivityLauncher = new Intent(this,SiteNotificationsDetailsActivity.class);

        String SiteNameForNotificationList = getIntent().getStringExtra("siteNameForNotificationsBySite");

        SiteNotificationRoomNameDescription =  findViewById(R.id.txt_site_notification_name_description);
        SiteNotificationListView = findViewById(R.id.lvw_site_notification_list);
        SiteNotificationEmptyList = findViewById(R.id.lbl_site_notification_empty_list);

        SiteNotificationRoomNameDescription.setText(SiteNameForNotificationList);

        ListNotificationTest(conn, SiteNameForNotificationList);

        SiteNotificationListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String TestCodeSelected = notificationTestList.get(position);

                siteNotificationsDetailsActivityLauncher.putExtra("TestCodeSelected", TestCodeSelected);
                startActivity(siteNotificationsDetailsActivityLauncher);
            }
        });
    }

    private void ListNotificationTest(SQLiteConnectionHelper conn, String siteName) {

        notificationTestList = _notificationBusinessRules.ListTestNotification(conn, siteName);

        if(notificationTestList.size() != 0){
            ArrayAdapter adapterNotificationTestList = new ArrayAdapter(this,android.R.layout.simple_list_item_1,notificationTestList);

            SiteNotificationListView.setAdapter(adapterNotificationTestList);
        }else{
            SiteNotificationListView.setVisibility(View.GONE);

            SiteNotificationEmptyList.setVisibility(View.VISIBLE);
        }
    }
}

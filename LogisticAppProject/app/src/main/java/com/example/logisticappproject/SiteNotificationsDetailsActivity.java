package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.businessrules.NotificationBusinessRules;
import com.example.utilitiesdatabase.SQLiteConnectionHelper;

import java.util.ArrayList;

public class SiteNotificationsDetailsActivity extends AppCompatActivity {

    SQLiteConnectionHelper conn = new SQLiteConnectionHelper(this,"bd_LogisticApp",null,1);

    NotificationBusinessRules _notificationBusinessRules = new NotificationBusinessRules();

    TextView NotificationTestCode;
    TextView NotificationType;
    TextView NotificationDescriptionDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site_notifications_details);

        NotificationTestCode = findViewById(R.id.lbl_notification_test_code);
        NotificationType = findViewById(R.id.lbl_notification_type);
        NotificationDescriptionDetail = findViewById(R.id.lbl_notification_description_detail);

        String TestCodeNotificationDetail = getIntent().getStringExtra("TestCodeSelected");

        NotificationDetail(TestCodeNotificationDetail);

    }

    private void NotificationDetail(String testCodeNotification) {
        NotificationBusinessRules NotificationTest = _notificationBusinessRules.GetNotificationDetail(conn, testCodeNotification);

        NotificationTestCode.setText(NotificationTest.TestCode);
        NotificationType.setText(NotificationTest.NotificationTestTypeName);
        NotificationDescriptionDetail.setText(NotificationTest.NotificationTestTypeDescription);
    }
}

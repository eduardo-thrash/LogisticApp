package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.example.businessrules.RoomBusinessRules;
import com.example.businessrules.SessionBusinessRules;
import com.example.businessrules.TestBusinessRules;
import com.example.businessrules.UserBusinessRules;
import com.example.utilitiesdatabase.SQLiteConnectionHelper;

import java.util.ArrayList;

public class TestSearchActivity extends AppCompatActivity {

    SQLiteConnectionHelper conn = new SQLiteConnectionHelper(this,"bd_LogisticApp",null,1);

    SessionBusinessRules _sessionBusinessRules = new SessionBusinessRules();
    RoomBusinessRules _roomBusinessRules = new RoomBusinessRules();
    UserBusinessRules _userBusinessRules = new UserBusinessRules();
    TestBusinessRules _testBusinessRules = new TestBusinessRules();

    int userRoomBossIdSession = 0;

    EditText RoomsSiteDescription;
    EditText RoomsRoomBossDescription;
    ListView TestListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_search);

        RoomsSiteDescription = findViewById(R.id.txt_rooms_site_description);
        RoomsRoomBossDescription = findViewById(R.id.txt_rooms_room_boss_description);
        TestListView = findViewById(R.id.lvw_test_list);

        userRoomBossIdSession = _sessionBusinessRules.ValidateSessionActive(conn);

        String RoomName = _roomBusinessRules.RoomNameByUser(conn, userRoomBossIdSession);
        String RoomBossName = _userBusinessRules.UserNameByUser(conn, userRoomBossIdSession);

        ListTestByUser(conn, userRoomBossIdSession);

        RoomsSiteDescription.setText(RoomName);
        RoomsRoomBossDescription.setText(RoomBossName);
    }

    private void ListTestByUser(SQLiteConnectionHelper conn, int userRoomBossIdSession) {

        final ArrayList<String> testList = _testBusinessRules.TestListByUser(conn, userRoomBossIdSession);

        ArrayAdapter adapterMaterialList = new ArrayAdapter(this,android.R.layout.simple_list_item_1,testList);

        TestListView.setAdapter(adapterMaterialList);
    }

    public void TestDetailActivity (View view){
        Intent TestDetailActivity = new Intent(this, TestDetailActivity.class);
        startActivity(TestDetailActivity);
    }
}

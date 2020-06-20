package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.businessrules.DepartmentBusinessRules;
import com.example.businessrules.NotificationBusinessRules;
import com.example.businessrules.TestBusinessRules;
import com.example.utilitiesdatabase.SQLiteConnectionHelper;

import java.util.ArrayList;

public class NotificationTestActivity extends AppCompatActivity {

    SQLiteConnectionHelper conn = new SQLiteConnectionHelper(this,"bd_LogisticApp",null,1);

    ArrayList<String> testCodeList = new ArrayList<String>();
    ArrayList<String> testNotificationTypeList = new ArrayList<String>();
    TestBusinessRules _testBusinessRules = new TestBusinessRules();
    NotificationBusinessRules _notificationBusinessRules = new NotificationBusinessRules();

    Spinner MaterialCodeSearch;
    Spinner NotificationTestType;
    EditText TestStatusValue;
    EditText NotificationTestDescription;
    Button NotificationTestAccept;

    String testCode;
    String testNotificationType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_test);

        MaterialCodeSearch = findViewById(R.id.sp_material_code_search);
        NotificationTestType = findViewById(R.id.sp_notification_test_type);
        TestStatusValue = findViewById(R.id.lbl_test_status_value);
        NotificationTestDescription = findViewById(R.id.txt_notification_test_description);
        NotificationTestAccept = findViewById(R.id.btn_notification_test_accept);

        TestCodeListInSpinner();

        TestNotificationTypeListInSpinner();

        MaterialCodeSearch.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                testCode = MaterialCodeSearch.getSelectedItem().toString();

                TestStatusValue.setText(_testBusinessRules.InfoStatusTest(conn, testCode));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        NotificationTestType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                testNotificationType = NotificationTestType.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        NotificationTestAccept.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String TestId = _testBusinessRules.InfoTestId(conn, testCode);
                String TestNotificationType = _notificationBusinessRules.InfoTestNotificationTypeId(conn,testNotificationType);
                String TestDescription = NotificationTestDescription.getText().toString();

                if(TestId == null || TestId.isEmpty()){
                    Toast.makeText(getApplicationContext(),"selección de examen es obligatorio.",Toast.LENGTH_SHORT).show();
                }else if(TestNotificationType == null || TestNotificationType.isEmpty()){
                    Toast.makeText(getApplicationContext(),"selección de tipo de novedad es obligatorio.",Toast.LENGTH_SHORT).show();
                }else if(TestDescription == null || TestDescription.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Descripción es obligatorio.",Toast.LENGTH_SHORT).show();
                }else{
                    if(_notificationBusinessRules.SaveTestNotification(conn,TestId,TestNotificationType,TestDescription)){
                        Toast.makeText(getApplicationContext(),"Novedad para examen "+testCode+" reportada.",Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(getApplicationContext(),"Se presento un error al reportar novedad. Intente nuevamente.",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    private void TestCodeListInSpinner(){
        testCodeList = _testBusinessRules.ListTestCode(conn);

        ArrayAdapter<String> testCodeAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, testCodeList);

        MaterialCodeSearch.setAdapter(testCodeAdapter);
    }

    private void TestNotificationTypeListInSpinner(){
        testNotificationTypeList = _notificationBusinessRules.ListTestNotificationType(conn);

        ArrayAdapter<String> testNotificationTypeAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, testNotificationTypeList);

        NotificationTestType.setAdapter(testNotificationTypeAdapter);
    }
}

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

import com.example.businessrules.MaterialBusinessRules;
import com.example.businessrules.NotificationBusinessRules;
import com.example.businessrules.TestBusinessRules;
import com.example.utilitiesdatabase.SQLiteConnectionHelper;

import java.util.ArrayList;

public class NotificationMaterialActivity extends AppCompatActivity {

    SQLiteConnectionHelper conn = new SQLiteConnectionHelper(this,"bd_LogisticApp",null,1);

    MaterialBusinessRules _materialBusinessRules = new MaterialBusinessRules();
    NotificationBusinessRules _notificationBusinessRules = new NotificationBusinessRules();

    ArrayList<String> materialCodeList = new ArrayList<String>();
    ArrayList<String> materialNotificationTypeList = new ArrayList<String>();
    String materialCode;
    String materialNotificationType;

    Spinner MaterialCodeSearch;
    Spinner MaterialNotificationType;
    EditText MaterialStatusValue;
    EditText MaterialNotificationDescription;
    Button MaterialNotificationAccept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_material);

        final Intent launcherDelegateActivity = new Intent(this, DelegateActivity.class);

        MaterialCodeSearch = findViewById(R.id.sp_material_code_search);
        MaterialNotificationType = findViewById(R.id.sp_notification_material_type);
        MaterialStatusValue = findViewById(R.id.lbl_material_status_value);
        MaterialNotificationDescription = findViewById(R.id.txt_notification_material_description);
        MaterialNotificationAccept = findViewById(R.id.btn_notification_material_accept);

        MaterialCodeListInSpinner();

        MaterialNotificationTypeListInSpinner();

        MaterialCodeSearch.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                materialCode = MaterialCodeSearch.getSelectedItem().toString();

                MaterialStatusValue.setText(_materialBusinessRules.InfoStatusByMaterialCode(conn, materialCode));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        MaterialNotificationType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                materialNotificationType = MaterialNotificationType.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        MaterialNotificationAccept.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String MaterialId = _materialBusinessRules.InfoMaterialIdByMaterialCode(conn, materialCode);
                String MaterialNotificationType = _notificationBusinessRules.InfoMaterialNotificationTypeId(conn,materialNotificationType);
                String MaterialDescription = MaterialNotificationDescription.getText().toString();

                if(MaterialId == null || MaterialId.isEmpty()){
                    Toast.makeText(getApplicationContext(),"selección de material es obligatorio.",Toast.LENGTH_SHORT).show();
                }else if(MaterialNotificationType == null || MaterialNotificationType.isEmpty()){
                    Toast.makeText(getApplicationContext(),"selección de tipo de novedad es obligatorio.",Toast.LENGTH_SHORT).show();
                }else if(MaterialDescription == null || MaterialDescription.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Descripción es obligatorio.",Toast.LENGTH_SHORT).show();
                }else{
                    if(_notificationBusinessRules.SaveMaterialNotification(conn,MaterialId,MaterialNotificationType,MaterialDescription)){
                        Toast.makeText(getApplicationContext(),"Novedad para material "+materialCode+" reportada.",Toast.LENGTH_LONG).show();
                        startActivity(launcherDelegateActivity);
                    }else{
                        Toast.makeText(getApplicationContext(),"Se presentó un error al reportar novedad. Intente nuevamente.",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    private void MaterialNotificationTypeListInSpinner() {
        materialNotificationTypeList = _notificationBusinessRules.MaterialNotificationTypeList(conn);

        ArrayAdapter<String> testNotificationTypeAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, materialNotificationTypeList);

        MaterialNotificationType.setAdapter(testNotificationTypeAdapter);
    }

    private void MaterialCodeListInSpinner() {
        materialCodeList = _materialBusinessRules.MaterialCodeList(conn);

        ArrayAdapter<String> testCodeAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, materialCodeList);

        MaterialCodeSearch.setAdapter(testCodeAdapter);
    }
}

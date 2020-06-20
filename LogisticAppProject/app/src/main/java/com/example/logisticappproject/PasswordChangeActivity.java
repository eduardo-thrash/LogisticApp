package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.businessrules.SessionBusinessRules;
import com.example.businessrules.UserBusinessRules;
import com.example.logisticappproject.R;
import com.example.utilitiesdatabase.SQLiteConnectionHelper;

public class PasswordChangeActivity extends AppCompatActivity {

    SQLiteConnectionHelper conn = new SQLiteConnectionHelper(this,"bd_LogisticApp",null,1);

    SessionBusinessRules _sessionBusinessRules = new SessionBusinessRules();
    UserBusinessRules _userBusinessRules = new UserBusinessRules();

    int userIdSession = 0;
    String UpdateNewPasswordText;
    String ConfirmNewPasswordText;

    EditText UpdateNewPassword;
    EditText ConfirmNewPassword;
    Button SavePasswordChanges;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_change);

        UpdateNewPassword = findViewById(R.id.txt_update_new_password);
        ConfirmNewPassword = findViewById(R.id.txt_confirm_new_password);
        SavePasswordChanges = findViewById(R.id.btn_save_password_changes);

        SavePasswordChanges.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                UpdateNewPasswordText = UpdateNewPassword.getText().toString();
                ConfirmNewPasswordText = ConfirmNewPassword.getText().toString();

                userIdSession = _sessionBusinessRules.ValidateSessionActive(conn);

                if(!ValidatePasswordValues(UpdateNewPasswordText, ConfirmNewPasswordText))
                    Toast.makeText(getApplicationContext(),"Las contraseñas no coinciden",Toast.LENGTH_LONG).show();

                _userBusinessRules.PasswordChange(conn, userIdSession, UpdateNewPasswordText);

                Toast.makeText(getApplicationContext(),"Contraseña actualizada.",Toast.LENGTH_LONG).show();
            }
        });
    }

    private boolean ValidatePasswordValues(String newPassword, String newPasswordConfirm) {

        if(newPassword.equals(newPasswordConfirm)){
            return true;
        }else{
            return false;
        }
    }
}


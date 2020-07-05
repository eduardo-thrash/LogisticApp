package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.businessrules.SessionBusinessRules;
import com.example.businessrules.UserBusinessRules;
import com.example.logisticappproject.R;
import com.example.utilitiesdatabase.SQLiteConnectionHelper;

import java.util.regex.Pattern;

public class PasswordChangeActivity extends AppCompatActivity {

    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^" +
                    "(?=.*[0-9])" +         //at least 1 digit
                    "(?=.*[a-z])" +         //at least 1 lower case letter
                    "(?=.*[A-Z])" +         //at least 1 upper case letter
                    "(?=.*[a-zA-Z])" +      //any letter
                    "(?=.*[@#$%^&+=*])" +    //at least 1 special character
                    "(?=\\S+$)" +           //no white spaces
                    ".{4,}" +               //at least 4 characters
                    "$");

    SQLiteConnectionHelper conn = new SQLiteConnectionHelper(this,"bd_LogisticApp",null,1);

    SessionBusinessRules _sessionBusinessRules = new SessionBusinessRules();
    UserBusinessRules _userBusinessRules = new UserBusinessRules();

    int userIdSession = 0;
    String UpdateNewPasswordText;
    String ConfirmNewPasswordText;

    EditText UpdateNewPassword;
    EditText ConfirmNewPassword;
    Button SavePasswordChanges;
    TextView TextError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_change);

        UpdateNewPassword = findViewById(R.id.txt_update_new_password);
        ConfirmNewPassword = findViewById(R.id.txt_confirm_new_password);
        SavePasswordChanges = findViewById(R.id.btn_save_password_changes);
        TextError = findViewById(R.id.lbl_change_password_error);

        SavePasswordChanges.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                UpdateNewPasswordText = UpdateNewPassword.getText().toString();
                ConfirmNewPasswordText = ConfirmNewPassword.getText().toString();

                userIdSession = _sessionBusinessRules.ValidateSessionActive(conn);

                if(validatePassword(UpdateNewPasswordText, ConfirmNewPasswordText)){
                    _userBusinessRules.PasswordChange(conn, userIdSession, UpdateNewPasswordText);
                    Toast.makeText(getApplicationContext(),"Contraseña actualizada.",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private boolean validatePassword(String newPassword, String newPasswordConfirm) {

        if (UpdateNewPasswordText.isEmpty()){
            Toast.makeText(getApplicationContext(),"El campo no debe esta vacio",Toast.LENGTH_LONG).show();
            return false;

        } else if (!PASSWORD_PATTERN.matcher(UpdateNewPasswordText).matches()) {
            Toast.makeText(getApplicationContext(),"La contraseña no cumple las reglas.",Toast.LENGTH_LONG).show();
            return false;

        } else if (!newPassword.equals(newPasswordConfirm)){
            Toast.makeText(getApplicationContext(),"Las contraseñas no coinciden",Toast.LENGTH_LONG).show();
            return false;

        } else {
            return true;
        }
    }
}


package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.businessrules.SessionBusinessRules;
import com.example.businessrules.UserBusinessRules;
import com.example.utilitiesdatabase.SQLiteConnectionHelper;

public class LoginActivity extends AppCompatActivity {

    SQLiteConnectionHelper conn = new SQLiteConnectionHelper(this,"bd_LogisticApp",null,1);

    UserBusinessRules _userBusinessRules = new UserBusinessRules();
    SessionBusinessRules _sessionBusinessRules = new SessionBusinessRules();

    EditText LoginUsername;
    EditText LoginPassword;
    Button Login;
    String loginUsernameText;
    String loginPasswordText;

    int userIdSession = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        LoginUsername = findViewById(R.id.txt_login_username);
        LoginPassword = findViewById(R.id.txt_login_password);
        Login = findViewById(R.id.btn_login);

        Login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                loginUsernameText = LoginUsername.getText().toString();
                loginPasswordText = LoginPassword.getText().toString();

                if(_userBusinessRules.ValidateSession(conn, loginUsernameText, loginPasswordText)){

                    _sessionBusinessRules.CreateSession(conn,loginUsernameText);

                    userIdSession = _sessionBusinessRules.ValidateSessionActive(conn,loginUsernameText);

                    Toast.makeText(getApplicationContext(),"Acceso exitoso",Toast.LENGTH_LONG).show();

                }else{
                    Toast.makeText(getApplicationContext(),"Usuario o contraseña incorrecto",Toast.LENGTH_LONG).show();
                }
            }
        });
    }


}

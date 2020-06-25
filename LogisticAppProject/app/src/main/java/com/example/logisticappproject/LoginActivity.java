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
import com.example.utilitiesdatabase.SQLiteConnectionHelper;
import com.example.utilitiesdatabase.UtilitiesRoles;

public class LoginActivity extends AppCompatActivity {

    SQLiteConnectionHelper conn = new SQLiteConnectionHelper(this,"bd_LogisticApp",null,1);

    UserBusinessRules _userBusinessRules = new UserBusinessRules();
    SessionBusinessRules _sessionBusinessRules = new SessionBusinessRules();
    UtilitiesRoles _utilitiesRoles = new UtilitiesRoles();

    int userIdSession = 0;

    EditText LoginUsername;
    EditText LoginPassword;
    Button Login;
    String loginUsernameText;
    String loginPasswordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Intent launcherDistributorActivity = new Intent(this, DistributorActivity.class);
        final Intent launcherDelegateActivity = new Intent(this, DelegateActivity.class);
        final Intent launcherRoomBossActivity = new Intent(this, RoomBossActivity.class);
        final Intent launcherCoordinatorActivity = new Intent(this, CordinatorActivity.class);

        LoginUsername = findViewById(R.id.txt_login_username);
        LoginPassword = findViewById(R.id.txt_login_password);
        Login = findViewById(R.id.btn_login);

        userIdSession = _sessionBusinessRules.ValidateSessionActive(conn);

        if(userIdSession != 0){
            String roleName = _utilitiesRoles.GetRole(conn, userIdSession);

            switch (roleName){
                case "distributor":
                    startActivity(launcherDistributorActivity);
                    break;
                case "delegado":
                    startActivity(launcherDelegateActivity);
                    break;
                case "jefe de salón":
                    startActivity(launcherRoomBossActivity);
                    break;
                case "coordinador":
                    startActivity(launcherCoordinatorActivity);
                    break;
                default:
                    Toast.makeText(getApplicationContext(),"Erro no identificado",Toast.LENGTH_LONG).show();
            }
        }

        Login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                loginUsernameText = LoginUsername.getText().toString();
                loginPasswordText = LoginPassword.getText().toString();

                if(_userBusinessRules.ValidateSession(conn, loginUsernameText, loginPasswordText)){

                    _sessionBusinessRules.CreateSession(conn,loginUsernameText);

                    userIdSession = _sessionBusinessRules.ValidateSessionActive(conn,loginUsernameText);

                    Toast.makeText(getApplicationContext(),"Acceso exitoso",Toast.LENGTH_LONG).show();

                    String role = _utilitiesRoles.GetRole(conn,loginUsernameText);

                    switch (role){
                        case "distributor":
                            startActivity(launcherDistributorActivity);
                            break;
                        case "delegado":
                            startActivity(launcherDelegateActivity);
                            break;
                        case "jefe de salón":
                            startActivity(launcherRoomBossActivity);
                            break;
                        case "coordinador":
                            startActivity(launcherCoordinatorActivity);
                            break;
                        default:
                            Toast.makeText(getApplicationContext(),"Erro no identificado",Toast.LENGTH_LONG).show();
                    }

                }else{
                    Toast.makeText(getApplicationContext(),"Usuario o contraseña incorrecto",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

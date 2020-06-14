package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class NotificationTestActivity extends AppCompatActivity {

    Spinner vdsNovedadExamen;

    String[] NovedadExamen = {"--Seleccione Novedad--", "Examen Incompleto", "Examen Incorrecto","Examen Roto"};

    private ListView Lista;
    SimpleAdapter AdapterNovedadExamen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_test);
    }

    public void ReportarNovedad (View view){
        Intent JefeSalon = new Intent(this, RoomBossActivity.class);

        Toast.makeText(NotificationTestActivity.this, "Novedad Registrada", Toast.LENGTH_SHORT).show();

        startActivity(JefeSalon);
    }
}

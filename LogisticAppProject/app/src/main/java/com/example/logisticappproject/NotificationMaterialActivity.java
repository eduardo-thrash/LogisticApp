package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class NotificationMaterialActivity extends AppCompatActivity {

    Spinner vdsNovedad;

    String[] Novedad = {"--Seleccione Novedad--","Caja Rota", "Material incompleto", "Sitio Incorrecto"};

    private ListView Lista;
    SimpleAdapter AdapterNovedad;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_material);

        vdsNovedad=(Spinner)findViewById(R.id.dsTipoNovedad);

        ArrayAdapter<String> AdapterNovedad = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Novedad);
        vdsNovedad.setAdapter(AdapterNovedad);
    }

    public void Reportar (View view){
        Intent Delegado = new Intent(this, DelegateActivity.class);

        Toast.makeText(NotificationMaterialActivity.this, "Novedad Registrada", Toast.LENGTH_SHORT).show();

        startActivity(Delegado);
    }
}

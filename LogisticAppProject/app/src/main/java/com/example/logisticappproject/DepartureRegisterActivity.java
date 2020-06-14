package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

public class DepartureRegisterActivity extends AppCompatActivity {

    Spinner vdsRegion;
    Spinner vdsDepartamento;
    Spinner vdsMunicipio;

    String[] Region = {"--Seleccione Región--","Sur", "Centro", "Norte"};
    String[] Departamento = {"--Seleccione Departamento--","Bogotá", "", "Cundinamarca"};
    String[] Municipio = {"--Seleccione Municipio--","Bogotá", "Chia", "Girardot", "La Mesa", "Soacha"};

    private ListView Lista;
    SimpleAdapter AdapterDespacho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departure_register);

        vdsRegion=(Spinner)findViewById(R.id.dsRegion);
        vdsDepartamento =(Spinner)findViewById(R.id.dsDepartamento);
        vdsMunicipio=(Spinner)findViewById(R.id.dsMunicipio);

        ArrayAdapter<String> AdaptadorRegion = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Region);
        vdsRegion.setAdapter(AdaptadorRegion);

        ArrayAdapter<String> AdaptadorDpto = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Departamento);
        vdsDepartamento.setAdapter(AdaptadorDpto);

        ArrayAdapter<String> AdaptadorMunic = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Municipio);
        vdsMunicipio.setAdapter(AdaptadorMunic);
    }
}


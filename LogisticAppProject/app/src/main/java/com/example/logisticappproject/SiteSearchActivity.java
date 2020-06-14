package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

public class SiteSearchActivity extends AppCompatActivity {

    Spinner vdsRegionSitios;
    String[] RegionSitios = {"--Seleccione Región--", "CENTRO", "SUR", "NORTE"};
    private ListView Lista;
    SimpleAdapter AdapterRegionSitios;

    Spinner vdsDepartamentoSitios;
    String[] DepartamentoSitios = {"--Seleccione Departamento--", "Bogotá", "Cundinamarca"};
    private ListView ListaDepartamento;
    SimpleAdapter AdapterDepartamentoSitios;

    Spinner vdsMunicipioSitios;
    String[] MunicipioSitios = {"--Seleccione Municipio--", "Bogotá", "Chía", "Girardot", "La Vega"};
    private ListView ListaMunicipio;
    SimpleAdapter AdapterMunicipioSitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site_search);

        vdsRegionSitios=(Spinner)findViewById(R.id.dsRegionSitio);
        ArrayAdapter<String> AdapterRegion = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, RegionSitios);
        vdsRegionSitios.setAdapter(AdapterRegion);

        vdsDepartamentoSitios=(Spinner)findViewById(R.id.dsDepartamentoSitio);
        ArrayAdapter<String> AdapterDepartamento = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, DepartamentoSitios);
        vdsDepartamentoSitios.setAdapter(AdapterDepartamento);

        vdsMunicipioSitios=(Spinner)findViewById(R.id.dsMunicipioSitio);
        ArrayAdapter<String> AdapterMunicipio = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, MunicipioSitios);
        vdsMunicipioSitios.setAdapter(AdapterMunicipio);

    }

    public void SiteResumeActivity (View view){
        Intent SiteResumeActivity = new Intent(this, SiteResumeActivity.class);
        startActivity(SiteResumeActivity);

    }
}

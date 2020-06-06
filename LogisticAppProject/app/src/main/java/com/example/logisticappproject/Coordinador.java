package com.example.logisticapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Coordinador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinador);
    }

    public void CambioClave (View view){
        Intent CambioClave = new Intent(this, CambioClave.class);
        startActivity(CambioClave);

    }

    public void Cerrar (View view){
        finish();

    }
    public void Ayuda (View view){
        Intent Ayuda = new Intent(this, AyudaUser.class);
        startActivity(Ayuda);

    }

    public void ConsultarSitios (View view){
        Intent ConsultarSitios = new Intent(this, ConsultarSitios.class);
        startActivity(ConsultarSitios);

    }

    public void NovedadesSitio (View view){
        Intent NovedadesSitio = new Intent(this, NovedadesSitio.class);
        startActivity(NovedadesSitio);

    }
}

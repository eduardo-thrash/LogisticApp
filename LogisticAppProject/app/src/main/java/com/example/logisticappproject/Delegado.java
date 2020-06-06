package com.example.logisticapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Delegado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delegado);

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

    public void ConsultaMaterial (View view){
        Intent ConsultaMaterial = new Intent(this, ConsultaMaterial.class);
        startActivity(ConsultaMaterial);

    }

    public void Escanear (View view){
        Intent Escanear = new Intent(this, Escanear.class);
        startActivity(Escanear);
    }

    public void Novedad (View view){
        Intent Novedad = new Intent(this, NovedadMaterial.class);
        startActivity(Novedad);
    }

    public void ResumenSitio (View view){
        Intent ResumenSitio = new Intent(this, ResumenSitio.class);
        startActivity(ResumenSitio);
    }

}

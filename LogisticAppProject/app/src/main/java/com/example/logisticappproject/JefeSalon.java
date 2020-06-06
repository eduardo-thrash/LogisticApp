package com.example.logisticapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class JefeSalon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jefe_salon);
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

    public void ConsultarExamen (View view){
        Intent ConsultarExamen = new Intent(this, ConsultarExamen.class);
        startActivity(ConsultarExamen);

    }

    public void EscanearExamen (View view){
        Intent EscanearExamen = new Intent(this, EscanearExamen.class);
        startActivity(EscanearExamen);

    }

    public void NovedadExamen (View view){
        Intent NovedadExamen = new Intent(this, NovedadExamen.class);
        startActivity(NovedadExamen);

    }

    public void ConsultarNovedadSalon (View view){
        Intent ConsultarNovedadSalon = new Intent(this, ConsultarNovedadSalon.class);
        startActivity(ConsultarNovedadSalon);

    }

    public void ResumenSalon (View view){
        Intent ResumenSalon = new Intent(this, ResumenSalon.class);
        startActivity(ResumenSalon);

    }
}

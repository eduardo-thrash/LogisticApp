package com.example.logisticappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class HelpActivity extends AppCompatActivity {

    ViewFlipper v_flipper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        int images[]={R.drawable.ayuda_1, R.drawable.ayuda_2,R.drawable.ayuda_3,R.drawable.ayuda_4,R.drawable.ayuda_5,R.drawable.ayuda_6,R.drawable.ayuda_7,R.drawable.ayuda_8,R.drawable.ayuda_9,R.drawable.ayuda_10};

        v_flipper=findViewById(R.id.iContenedor);

        for (int image: images){

            FlipperImages(image);
        }


    }

    public void FlipperImages (int image){

        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(7000);
        v_flipper.setAutoStart(true);
        v_flipper.setInAnimation(this, android.R.anim.slide_out_right);
        v_flipper.setOutAnimation(this, android.R.anim.slide_out_right);

    }
}
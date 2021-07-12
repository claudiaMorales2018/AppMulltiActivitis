package com.example.appmultiplesactivitis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MA_pinturas extends AppCompatActivity {

    private TextView contenido, obras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_pinturas);

        obras = findViewById(R.id.txtObra);
        contenido = findViewById(R.id.txtContenido);
        this.datos();
    }
    private void datos (){

    Bundle bundle = getIntent().getExtras();
    String obras = bundle.getString("obras");
    int contenido = bundle.getInt("contenido");
    this.obras.setText(String.valueOf(obras));

    this.contenido.setText(contenido);


    }
}



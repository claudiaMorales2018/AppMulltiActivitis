package com.example.appmultiplesactivitis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

private ListView lista;
ArrayList<String> obras = new ArrayList<>();
ArrayList<Integer> contenido = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lista = findViewById(R.id.listaPinturas);

        obras.add("Sol");
        obras.add("Tortuga");
        obras.add("Flor");
        obras.add("Obras");

        contenido.add(R.string.SOL);
        contenido.add(R.string.TORTUGA);
        contenido.add(R.string.FLOR);
        contenido.add(R.string.OBRAS);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,obras);
        lista.setAdapter(arrayAdapter);


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext(),MA_pinturas.class);
                intent.putExtra("obras",obras.get(position));
                intent.putExtra("contenido",contenido.get(position));
                startActivity(intent);

            }
        });
    }
}
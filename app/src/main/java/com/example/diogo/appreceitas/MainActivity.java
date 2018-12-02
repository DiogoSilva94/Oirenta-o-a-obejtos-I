package com.example.diogo.appreceitas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Categorias> categorias = new ArrayList<>();

        categorias.add(new Categorias("SALGADOS",
                R.drawable.meat));

        categorias.add(new Categorias("BOLOS",
                R.drawable.cake));

        categorias.add(new Categorias("DOCES",
                R.drawable.pudding));


        final CategoriasAdapter adapter = new CategoriasAdapter(this, categorias);
        ListView lista = (ListView) findViewById(R.id.listaViewMain);
        lista.setAdapter(adapter);

       lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               switch(i) {
                    case 0:
                        final Intent intentSalgados = new Intent(getApplicationContext(), ReceitasSalgadosActivity.class);
                        startActivity(intentSalgados);
                        break;

                  case 1:
                     final Intent intentBolos = new Intent(getApplicationContext(), ReceitasBolosActivity.class);
                       startActivity(intentBolos);
                       break;

                   case 2:
                       final Intent intentDoces = new Intent(getApplicationContext(), ReceitasDocesActivity.class);
                       startActivity(intentDoces);
                       break;



               }
            }
        });
    }
    }


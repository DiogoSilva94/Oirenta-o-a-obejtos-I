package com.example.diogo.appreceitas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ReceitasActivity extends AppCompatActivity {

    TextView Tnome;
    TextView Tingredientes;
    TextView TmodoPreparo;
    ImageView TimagemReceita;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receitas);

        Tnome = findViewById(R.id.nomeReceita);
        Tingredientes =  findViewById(R.id.campoIngredientes);
        TmodoPreparo =  findViewById(R.id.campoPreparo);
        TimagemReceita = findViewById(R.id.imagemReceita);


        Receitas receitas =(Receitas) getIntent().getSerializableExtra("receitas");

        Tnome.setText(receitas.nome);
        Tingredientes.setText(receitas.ingredientes);
        TmodoPreparo.setText(receitas.modoDePreparo);
        TimagemReceita.setImageResource(receitas.imagem);


    }
}

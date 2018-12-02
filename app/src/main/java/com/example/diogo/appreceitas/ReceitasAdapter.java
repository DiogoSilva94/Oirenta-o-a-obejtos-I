package com.example.diogo.appreceitas;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ReceitasAdapter extends ArrayAdapter<Receitas> {

    public ReceitasAdapter(@NonNull Context context, @NonNull List<Receitas> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;



       if (listItemView == null) {
           listItemView = LayoutInflater.from(getContext()).inflate(R.layout.linhamodificada, parent, false);
       }

        Receitas receitas = getItem(position);

        TextView Tnome = (TextView) listItemView.findViewById(R.id.nomeCategoria);
        ImageView TimagemReceita = listItemView.findViewById(R.id.imageCategoria);

        Tnome.setText(receitas.getNome());
        TimagemReceita.setImageResource(receitas.imagem);

        return listItemView;


    }

}

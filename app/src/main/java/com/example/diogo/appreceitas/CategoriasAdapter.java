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

public class CategoriasAdapter extends ArrayAdapter<Categorias> {

    public CategoriasAdapter(@NonNull Context context, @NonNull List<Categorias> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;



        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.linhamodificada, parent, false);
        }

        Categorias categorias = getItem(position);

        TextView txtNome = listItemView.findViewById(R.id.nomeCategoria);
        ImageView imgReceita = listItemView.findViewById(R.id.imageCategoria);

        txtNome.setText(categorias.getNome());
        imgReceita.setImageResource(categorias.imagem);

        return listItemView;

    }
}

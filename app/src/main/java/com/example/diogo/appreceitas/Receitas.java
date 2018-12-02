package com.example.diogo.appreceitas;

import java.io.Serializable;

public class Receitas implements Serializable {

    public  String nome;
    public String ingredientes;
    public String modoDePreparo;
    public int imagem;

    public Receitas (String nome, String ingredientes, String modoDePreparo, int imagem){

        this.nome = nome;
        this.ingredientes= ingredientes;
        this.modoDePreparo = modoDePreparo;
        this.imagem =  imagem;
    }

    public String getNome() {
        return nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public String getModoDePreparo() {
        return modoDePreparo;
    }

    public int getImagem() {
        return imagem;
    }
}

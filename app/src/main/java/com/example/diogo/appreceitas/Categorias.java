package com.example.diogo.appreceitas;

public class Categorias {

    public String nome;
    public int imagem;

    public Categorias(String nome, int imagem) {
        this.nome = nome;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public int getImagem() {
        return imagem;
    }

}

package com.example.demomapper.domain;

public class Pessoa {
    private String nome;
    private int idade;
    private boolean manja;

    public Pessoa(String nome, int idade, boolean manja) {
        this.nome = nome;
        this.idade = idade;
        this.manja = manja;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isManja() {
        return manja;
    }
}

package com.example.demomapper.domain.dto;

public class PessoaDTO {
    private String nome;
    private boolean manja;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isManja() {
        return manja;
    }

    public void setManja(boolean manja) {
        this.manja = manja;
    }
}

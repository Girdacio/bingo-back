package com.girda.bingo.dtos;

public class PessoaDTO {
    private String nome;

    public PessoaDTO() {}

    public PessoaDTO(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    
}
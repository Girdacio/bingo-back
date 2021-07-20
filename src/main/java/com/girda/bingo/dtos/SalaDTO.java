package com.girda.bingo.dtos;

import java.util.List;

public class SalaDTO {
    private String nome;
    private List<PessoaDTO> pessoas;
    private SalaConfiguracaoDTO config;

    public String getNome() {
        return nome;
    }
    
    public SalaConfiguracaoDTO getConfig() {
        return config;
    }

    public void setConfig(SalaConfiguracaoDTO config) {
        this.config = config;
    }

    public List<PessoaDTO> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<PessoaDTO> pessoas) {
        this.pessoas = pessoas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    
}

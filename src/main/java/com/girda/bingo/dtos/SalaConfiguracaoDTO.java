package com.girda.bingo.dtos;

public class SalaConfiguracaoDTO {
    private String organizador;
    private Integer maiorBola;
    
    public String getOrganizador() {
        return organizador;
    }

    public Integer getMaiorBola() {
        return maiorBola;
    }
    
    public void setMaiorBola(Integer maiorBola) {
        this.maiorBola = maiorBola;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }    
}
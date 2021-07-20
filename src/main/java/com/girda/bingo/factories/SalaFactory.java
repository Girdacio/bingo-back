package com.girda.bingo.factories;

import java.util.List;

import com.girda.bingo.dtos.PessoaDTO;
import com.girda.bingo.dtos.SalaConfiguracaoDTO;
import com.girda.bingo.dtos.SalaDTO;

import org.apache.commons.lang3.RandomStringUtils;

public class SalaFactory {

    public static SalaDTO create(SalaConfiguracaoDTO salaConfig) {
        SalaDTO sala = new SalaDTO();
        sala.setNome(RandomStringUtils.randomAlphabetic(6));
        sala.setPessoas(List.of(new PessoaDTO(salaConfig.getOrganizador())));
        sala.setConfig(salaConfig);
        return sala;
    }
    
}

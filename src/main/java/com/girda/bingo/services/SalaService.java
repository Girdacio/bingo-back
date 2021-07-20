package com.girda.bingo.services;

import com.girda.bingo.dtos.SalaConfiguracaoDTO;
import com.girda.bingo.dtos.SalaDTO;
import com.girda.bingo.factories.SalaFactory;

public class SalaService {

    public SalaDTO criarSala(SalaConfiguracaoDTO salaConfig) {
        SalaDTO sala = SalaFactory.create(salaConfig);
        // TODO add sala na lista de salas        
        return sala;
    }
    
}

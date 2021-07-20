package com.girda.bingo.controllers;

import com.girda.bingo.dtos.SalaConfiguracaoDTO;
import com.girda.bingo.dtos.SalaDTO;
import com.girda.bingo.services.SalaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class SalaController {

    @Autowired
    private SalaService service;

    @MessageMapping("/criar-sala")
    @SendTo("/topic/sala-criada")
    public SalaDTO criarSala(SalaConfiguracaoDTO salaConfig) {
        System.out.println(salaConfig);
        return service.criarSala(salaConfig);
    }

}

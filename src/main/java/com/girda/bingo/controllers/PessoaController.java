package com.girda.bingo.controllers;

import com.girda.bingo.dtos.PessoaDTO;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class PessoaController {

    @MessageMapping("/pessoas")
    @SendTo("/topic/pessoas")
    public PessoaDTO adicionarPessoa(PessoaDTO pessoa) throws Exception {
        // TODO add pessoa na lista de pessoas ativas para a sala
        return pessoa;
    }

}

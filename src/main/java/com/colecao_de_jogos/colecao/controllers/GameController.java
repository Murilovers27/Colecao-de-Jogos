package com.colecao_de_jogos.colecao.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colecao_de_jogos.colecao.dto.GameMinDto;
import com.colecao_de_jogos.colecao.services.GameService;

@RestController
@RequestMapping(value = "/games")

public class GameController {

    private GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public List<GameMinDto> findAll() {
        List<GameMinDto> result = gameService.findall();
        return result;
    }
}

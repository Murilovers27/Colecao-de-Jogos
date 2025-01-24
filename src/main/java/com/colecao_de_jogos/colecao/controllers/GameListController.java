package com.colecao_de_jogos.colecao.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colecao_de_jogos.colecao.dto.GameListDto;
import com.colecao_de_jogos.colecao.services.GameListService;


@RestController
@RequestMapping(value = "/lists")

public class GameListController {

    private GameListService gameListService;

    public GameListController(GameListService gameListService) {
        this.gameListService = gameListService;
    }

    @GetMapping
    public List<GameListDto> findAll() {
        List<GameListDto> result = gameListService.findall();
        return result;
    }
}

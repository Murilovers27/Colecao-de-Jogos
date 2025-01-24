package com.colecao_de_jogos.colecao.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colecao_de_jogos.colecao.dto.GameListDto;
import com.colecao_de_jogos.colecao.services.GameListService;

    @RestController
    @RequestMapping(value = "/lists")
    public class GameListControler {
    
        @Autowired
        private GameListService gameListService;
          
        @GetMapping
        public List<GameListDto> findAll() {
            List<GameListDto> result = gameListService.findAll();
            return result;
        }
    }

    
    
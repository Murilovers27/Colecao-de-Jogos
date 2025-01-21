package com.colecao_de_jogos.colecao.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.colecao_de_jogos.colecao.dto.GameMinDto;
import com.colecao_de_jogos.colecao.entities.Game;
import com.colecao_de_jogos.colecao.repositories.GameRepository;

@Service
public class GameService {
    
    private GameRepository gameRepository;

    
    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<GameMinDto> findall(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();
        return dto;
    }
}

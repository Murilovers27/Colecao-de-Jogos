package com.colecao_de_jogos.colecao.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colecao_de_jogos.colecao.dto.GameListDto;
import com.colecao_de_jogos.colecao.entities.GameList;
import com.colecao_de_jogos.colecao.repositories.GameListRepository;
@Service
public class GameListService {
    
    @Autowired
    private GameListRepository gameListRepository;

    public List<GameListDto> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDto(x)).toList();
    }
}

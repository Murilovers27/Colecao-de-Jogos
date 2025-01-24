package com.colecao_de_jogos.colecao.services;

import java.util.List;
import org.springframework.stereotype.Service;

import com.colecao_de_jogos.colecao.dto.GameListDto;
import com.colecao_de_jogos.colecao.entities.GameList;
import com.colecao_de_jogos.colecao.repositories.GameListRepository;


@Service
public class GameListService {
    
    private GameListRepository gameListRepository;

    
    public GameListService(GameListRepository gameListRepository) {
        this.gameListRepository = gameListRepository;
    }

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public List<GameListDto> findall(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDto()).toList();
    }
}

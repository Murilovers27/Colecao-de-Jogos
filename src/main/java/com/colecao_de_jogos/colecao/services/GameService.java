package com.colecao_de_jogos.colecao.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.colecao_de_jogos.colecao.dto.GameDto;
import com.colecao_de_jogos.colecao.dto.GameMinDto;
import com.colecao_de_jogos.colecao.entities.Game;
import com.colecao_de_jogos.colecao.repositories.GameRepository;

@Service
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public GameDto findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDto(result);
    }

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public List<GameMinDto> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDto(x)).toList();
    }
}

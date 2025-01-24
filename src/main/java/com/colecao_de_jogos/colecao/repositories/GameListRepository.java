package com.colecao_de_jogos.colecao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colecao_de_jogos.colecao.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
    
}

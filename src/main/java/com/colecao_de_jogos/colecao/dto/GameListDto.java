package com.colecao_de_jogos.colecao.dto;


import com.colecao_de_jogos.colecao.entities.GameList;

public class GameListDto {

    private String name;
    private Long id;

    public GameListDto(){}

    public GameListDto(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

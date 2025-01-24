package com.colecao_de_jogos.colecao.dto;

import org.springframework.beans.BeanUtils;

import com.colecao_de_jogos.colecao.entities.Game;

public class GameListDto {

    private String name;
    private Long id;

    public GameListDto(){}

    public GameListDto(Game entity) {
        BeanUtils.copyProperties(entity, this);
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

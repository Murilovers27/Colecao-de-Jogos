package com.colecao_de_jogos.colecao.projections;

public interface GameMinProjection {

    Long getId();
	String getTitle();
	Integer getGameYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
} 
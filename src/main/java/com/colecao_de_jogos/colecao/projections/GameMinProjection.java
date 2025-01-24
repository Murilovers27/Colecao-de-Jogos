package com.colecao_de_jogos.colecao.projections;

public interface GameMinProjection {

    Long getId();
	String getTitle();
	Integer getYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
} 
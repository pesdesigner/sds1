package com.graficoeweb.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graficoeweb.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}

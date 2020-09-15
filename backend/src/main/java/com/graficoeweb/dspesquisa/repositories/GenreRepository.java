package com.graficoeweb.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graficoeweb.dspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{
	
}

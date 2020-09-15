package com.graficoeweb.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graficoeweb.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{
	
}

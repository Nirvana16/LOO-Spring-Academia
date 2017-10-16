package com.algaworks.academia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.academia.model.Modalidade;


public interface Modalidades extends JpaRepository<Modalidade, Long> {
	

}

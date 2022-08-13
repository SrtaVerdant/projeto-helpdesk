package com.gabriela.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriela.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {
	
}

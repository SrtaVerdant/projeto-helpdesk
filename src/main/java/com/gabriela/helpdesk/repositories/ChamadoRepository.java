package com.gabriela.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriela.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {
	
}

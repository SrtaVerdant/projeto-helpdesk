package com.gabriela.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriela.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	
}

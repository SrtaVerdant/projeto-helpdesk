package com.gabriela.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriela.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
	
}

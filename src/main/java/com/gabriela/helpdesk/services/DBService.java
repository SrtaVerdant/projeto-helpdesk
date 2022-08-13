package com.gabriela.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriela.helpdesk.domain.Chamado;
import com.gabriela.helpdesk.domain.Cliente;
import com.gabriela.helpdesk.domain.Tecnico;
import com.gabriela.helpdesk.domain.enums.Perfil;
import com.gabriela.helpdesk.domain.enums.Prioridade;
import com.gabriela.helpdesk.domain.enums.Status;
import com.gabriela.helpdesk.repositories.ChamadoRepository;
import com.gabriela.helpdesk.repositories.ClienteRepository;
import com.gabriela.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public void instanciaDB() {
		
		Tecnico tec1 = new Tecnico(null, "Valdir Cezar", "29807072018", "valdir@email.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linus Torvalds", "90007216017", "torvalds@mail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamada 01", "Primeiro chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));

	}
}

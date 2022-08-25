package com.gabriela.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	public void instanciaDB() {
		
		Tecnico tec1 = new Tecnico(null, "Alexander Bardiche", "29807072018", "alexander@email.com", encoder.encode("123"));
		tec1.addPerfil(Perfil.ADMIN);
		Tecnico tec2 = new Tecnico(null, "Clemens Ahlspiess", "99578281005", "clemens@email.com", encoder.encode("123"));
		Tecnico tec3 = new Tecnico(null, "Ehren Bec de Corbin", "80279961049", "rhren@email.com", encoder.encode("123"));
		Tecnico tec4 = new Tecnico(null, "Gerhard Falchion", "23846049026", "gerhard@email.com", encoder.encode("123"));
		Tecnico tec5 = new Tecnico(null, "Heinrich Landlord", "73503295046", "heinrich@email.com", encoder.encode("123"));
		
		Cliente cli1 = new Cliente(null, "Linus Torvalds", "31656823055", "torvalds@mail.com", encoder.encode("123"));
		Cliente cli2 = new Cliente(null, "Arnaut Orange Shortswords", "66521713094", "arnaut@mail.com", encoder.encode("123"));
		Cliente cli3 = new Cliente(null, "Frank Gray Katana", "84159262007", "gray@mail.com", encoder.encode("123"));
		Cliente cli4 = new Cliente(null, "Guido Silver Knife", "18094699027", "guido@mail.com", encoder.encode("123"));
		Cliente cli5 = new Cliente(null, "Günther Dagger", "47080736072", "dggger@mail.com", encoder.encode("123"));
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamada 01", "Primeiro chamado", tec1, cli1);
		Chamado c2 = new Chamado(null, Prioridade.BAIXA, Status.ABERTO, "Chamada 02", "Segundo chamado", tec2, cli3);
		Chamado c3 = new Chamado(null, Prioridade.ALTA, Status.ANDAMENTO, "Chamada 03", "Terceiro chamado", tec5, cli5);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1, tec2, tec3, tec4, tec5));
		clienteRepository.saveAll(Arrays.asList(cli1, cli2, cli3, cli4, cli5));
		chamadoRepository.saveAll(Arrays.asList(c1, c2, c3));

	}
}

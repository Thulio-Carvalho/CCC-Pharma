package com.pharma.PharmaCCC.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharma.PharmaCCC.models.Administrador;
import com.pharma.PharmaCCC.models.Produto;
import com.pharma.PharmaCCC.repositories.AdministradorRepository;

@Service
public class AdministradorService {
	@Autowired
	private AdministradorRepository administradorRepository;

	public List<Administrador> getAllClientes() {
		return this.administradorRepository.findAll();
	}
	public Administrador getClienteById(Integer id) {	
		return this.administradorRepository.findById(id).get();
	}
	
	public void save(Administrador administrador) {
		this.administradorRepository.save(administrador);
	}
	
	public Administrador update(Produto cliente, Integer id) {
		Administrador novoCliente = this.administradorRepository.findById(id).get();
	
		novoCliente.setNome(cliente.getNome());
		
		return novoCliente;
	}
}

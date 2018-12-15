package com.pharma.PharmaCCC.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharma.PharmaCCC.models.Administrador;
import com.pharma.PharmaCCC.repositories.AdministradorRepository;

@Service
public class AdministradorService {
	@Autowired
	private AdministradorRepository administradorRepository;

	public List<Administrador> getAllAdministradores() {
		return this.administradorRepository.findAll();
	}
	public Administrador getAdministradorById(Integer id) {	
		return this.administradorRepository.findById(id).get();
	}
	
	public void save(Administrador administrador) {
		this.administradorRepository.save(administrador);
	}
	
	public Administrador update(Administrador administrador, Integer id) {
		Administrador novoAdministrador = this.administradorRepository.findById(id).get();
	
		novoAdministrador.setNome(administrador.getNome());
		novoAdministrador.setSenha(administrador.getSenha());
		
		return novoAdministrador;
	}
}

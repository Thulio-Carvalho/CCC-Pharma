package com.pharmaccc.phaguemenos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmaccc.phaguemenos.model.Administrador;
import com.pharmaccc.phaguemenos.repository.AdministradorRepository;

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
	
	public Administrador save(Administrador administrador) {
		return this.administradorRepository.save(administrador);
	}
	
	public Administrador update(Administrador administrador, Integer id) {
		Administrador novoAdministrador = this.administradorRepository.findById(id).get();
	
		novoAdministrador.setNome(administrador.getNome());
		novoAdministrador.setSenha(administrador.getSenha());
		
		return novoAdministrador;
	}
}

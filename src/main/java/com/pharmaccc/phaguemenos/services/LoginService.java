package com.pharmaccc.phaguemenos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmaccc.phaguemenos.model.Usuario;
import com.pharmaccc.phaguemenos.repository.UsuarioRepository;

@Service
public class LoginService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario getUsuarioById(Integer id) {
		return this.usuarioRepository.findById(id).get();
	}

}
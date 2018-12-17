package com.pharmaccc.phaguemenos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmaccc.phaguemenos.model.Usuario;
import com.pharmaccc.phaguemenos.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;

	public List<Usuario> getAllUsuarios() {
		return this.usuarioRepository.findAll();
	}
	public Usuario getUsuarioById(Integer id) {
		//Optional<Usuario> usuario = this.usuarioRepository.findById(id);	
		return this.usuarioRepository.findById(id).get();
	}
	
	public Usuario add(Usuario usuario) {
		return this.usuarioRepository.save(usuario);
	}
	
	public Usuario update(Integer id, Usuario usuario) {
		Usuario novoUsuario = this.usuarioRepository.findById(id).get();
		
		novoUsuario.setNome(usuario.getNome());
		novoUsuario.setSenha(usuario.getSenha());
		
		return novoUsuario;
	}
}

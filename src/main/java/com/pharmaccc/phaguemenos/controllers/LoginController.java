package com.pharmaccc.phaguemenos.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pharmaccc.phaguemenos.services.UsuarioService;
import com.pharmaccc.phaguemenos.model.Login;
import com.pharmaccc.phaguemenos.model.Usuario;

@RestController
@CrossOrigin
@RequestMapping("/login")
public class LoginController {

	@Autowired
	UsuarioService usuarioService;

	@PostMapping
	public ResponseEntity<Object> fetchUsuario(@Valid @RequestBody Login loginBody) {
		String nome = loginBody.getNome();
		String senha = loginBody.getSenha();

		List<Usuario> usuarios = this.usuarioService.getUsuarioByNome(nome);

		if (usuarios.isEmpty()) {
			return new ResponseEntity<Object>("Usuario nao encontrado", HttpStatus.NOT_FOUND);
		}

		Usuario usuario = usuarios.get(0);

		if (!usuario.getSenha().equals(senha)) {
			return new ResponseEntity<Object>("Senha invalida", HttpStatus.BAD_REQUEST);
		}
		
		usuarios.clear();

		return ResponseEntity.ok(usuario);
	}
}

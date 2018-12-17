package com.pharmaccc.phaguemenos.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pharmaccc.phaguemenos.services.UsuarioService;
import com.pharmaccc.phaguemenos.model.Usuario;

@RestController
@CrossOrigin
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping
	public List<Usuario> getAll() {
		return this.usuarioService.getAllUsuarios();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> getProdutoById(@PathVariable Integer id){
		Usuario usuario = this.usuarioService.getUsuarioById(id);
		
		if(usuario == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(usuario);
	}
	
	@PostMapping
	public ResponseEntity<Usuario> add(@Valid @RequestBody Usuario usuarioBody){
		Usuario usuario = this.usuarioService.add(usuarioBody);
		return ResponseEntity.ok(usuario);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Usuario> update(@PathVariable Integer id, @Valid @RequestBody Usuario usuarioBody){
		Usuario produto = this.usuarioService.update(id, usuarioBody);
		if(produto == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(produto);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> remover(@PathVariable Integer id) {
		Usuario usuario = usuarioService.getUsuarioById(id);
		
		if (usuario == null) {
			return ResponseEntity.notFound().build();
		}
		
		usuario.delete(usuario);
		
		return ResponseEntity.noContent().build();
	}
}

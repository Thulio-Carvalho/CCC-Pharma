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
@RequestMapping("/cliente")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
//	@RequestMapping(method = RequestMethod.GET)
//	public String clienteController() {
//		return "Controller Cliente ok!";
//	}
	
	@GetMapping
	public List<Usuario> getAll() {
		return this.usuarioService.getAllUsuarios();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> getUsuarioById(@PathVariable Integer id){
		Usuario produto = this.usuarioService.getUsuarioById(id);
		
		if(produto == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(produto);
	}
	
	@PostMapping
	public ResponseEntity<Usuario> add(@Valid @RequestBody Usuario clienteBody){
		Usuario cliente = this.usuarioService.add(clienteBody);
		return ResponseEntity.ok(cliente);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Usuario> update(@PathVariable Integer id, @Valid @RequestBody Usuario clienteBody){
		Usuario produto = this.usuarioService.update(id, clienteBody);
		if(produto == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(produto);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> remover(@PathVariable Integer id) {
		boolean t = this.usuarioService.remover(id);
		
		if (!t) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.noContent().build();
	}
	

}

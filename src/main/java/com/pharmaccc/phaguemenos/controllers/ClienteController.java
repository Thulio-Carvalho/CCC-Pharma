package com.pharmaccc.phaguemenos.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pharmaccc.phaguemenos.services.ClienteService;
import com.pharmaccc.phaguemenos.model.Cliente;

@RestController
@CrossOrigin
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;
	
//	@RequestMapping(method = RequestMethod.GET)
//	public String clienteController() {
//		return "Controller Cliente ok!";
//	}
	
	@GetMapping
	public List<Cliente> getAll() {
		return this.clienteService.getAllClientes();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> getProdutoById(@PathVariable Integer id){
		Cliente produto = this.clienteService.getClienteById(id);
		
		if(produto == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(produto);
	}
	
	@PostMapping
	public ResponseEntity<Cliente> add(@Valid @RequestBody Cliente clienteBody){
		Cliente cliente = this.clienteService.add(clienteBody);
		return ResponseEntity.ok(cliente);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Cliente> update(@PathVariable Integer id, @Valid @RequestBody Cliente clienteBody){
		Cliente produto = this.clienteService.update(id, clienteBody);
		if(produto == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(produto);
	}
	

}

package com.pharmaccc.phaguemenos.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.pharmaccc.phaguemenos.model.Produto;
import com.pharmaccc.phaguemenos.model.Venda;
import com.pharmaccc.phaguemenos.services.vendaService;

public class VendaController {
	@Autowired
	VendaService vendaService;
		
	@GetMapping
	public List<Venda> getAll() {
		return this.vendaService.getAllVendas();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Venda> getVendaById(@PathVariable Integer id){
		Venda venda = this.vendaService.getVendaById(id);
		
		if(venda == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(venda);
	}
	
	@PostMapping
	public ResponseEntity<Venda> add(@Valid @RequestBody Venda vendaBody){
		Venda venda = this.vendaService.save(vendaBody);
		return ResponseEntity.ok(venda);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Venda> update(@PathVariable Integer id, @Valid @RequestBody Venda vendaBody){
		Venda venda = this.vendaService.update(vendaBody, id);
		if(venda == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(venda);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> remover(@PathVariable Integer id) {
		Venda venda = venda.getVendaById(id);
		
		if (venda == null) {
			return ResponseEntity.notFound().build();
		}
		
		venda.delete(venda);
		
		return ResponseEntity.noContent().build();
	}
	
}
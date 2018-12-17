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

import com.pharmaccc.phaguemenos.model.Categoria;
import com.pharmaccc.phaguemenos.services.CategoriaService;

@RestController
@CrossOrigin
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	CategoriaService categoriaService;
	
	
	@GetMapping
	public List<Categoria> getAll() {
		return this.categoriaService.getAllCategorias();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> getProdutoById(@PathVariable Integer id){
		Categoria categoria = this.categoriaService.getCategoriaById(id);
		
		if(categoria == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(categoria);
	}
	
	@PostMapping
	public ResponseEntity<Categoria> add(@Valid @RequestBody Categoria categoriaBody){
		Categoria categoria = this.categoriaService.add(categoriaBody);
		return ResponseEntity.ok(categoria);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Categoria> update(@PathVariable Integer id, @Valid @RequestBody Categoria categoriaBody){
		Categoria categoria = this.categoriaService.update(id, categoriaBody);
		if(categoria == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(categoria);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> remover(@PathVariable Integer id) {
		boolean t = this.categoriaService.remover(id);
		
		if (!t) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.noContent().build();
	}
	
	
}
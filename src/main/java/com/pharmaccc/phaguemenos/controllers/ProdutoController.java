package com.pharmaccc.phaguemenos.controllers;

import java.util.List;

import javax.validation.Valid;

//import java.util.List;

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

import com.pharmaccc.phaguemenos.model.Produto;
import com.pharmaccc.phaguemenos.services.ProdutoService;

@RestController
@CrossOrigin
@RequestMapping("/produto")
public class ProdutoController {
	@Autowired
	ProdutoService produtoService;
	
	@GetMapping
	public List<Produto> getAll() {
		return this.produtoService.getAllProdutos();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> getProdutoById(@PathVariable Integer id){
		Produto produto = this.produtoService.getProdutoById(id);
		
		if(produto == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(produto);
	}
	
	@PostMapping
	public ResponseEntity<Produto> add(@Valid @RequestBody Produto produtoBody){
		Produto produto = this.produtoService.add(produtoBody);
		return ResponseEntity.ok(produto);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Produto> update(@PathVariable Integer id, @Valid @RequestBody Produto produtoBody){
		Produto produto = this.produtoService.update(id, produtoBody);
		if(produto == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(produto);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> remover(@PathVariable Long id) {
		Produto produto = Produto.getOne(id);
		
		if (produto == null) {
			return ResponseEntity.notFound().build();
		}
		
		Produto.delete(produto);
		
		return ResponseEntity.noContent().build();
	}
	
}

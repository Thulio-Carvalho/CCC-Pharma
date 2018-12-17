package com.pharmaccc.phaguemenos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmaccc.phaguemenos.model.Categoria;
import com.pharmaccc.phaguemenos.repository.CategoriaRepository;;


@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository categoriaRepository;

	public List<Categoria> getAllCategorias() {
		return this.categoriaRepository.findAll();
	}
	public Categoria getCategoriaById(Integer id) {	
		return this.categoriaRepository.findById(id).get();
	}
	
	public Categoria add(Categoria categoria) {
		return this.categoriaRepository.save(categoria);
	}
	
	public Categoria update(Integer id, Categoria categoria) {
		Categoria novoCategoria = this.categoriaRepository.findById(id).get();
		
		if(novoCategoria != null) {
			novoCategoria.setNome(categoria.getNome());
			novoCategoria.setDesconto(categoria.getDesconto());
		}
		
		
		return novoCategoria;
	}
	
	public boolean remover(Integer id) {
		Categoria novoProduto = this.categoriaRepository.findById(id).get();
		
		if(novoProduto != null) {
			this.categoriaRepository.deleteById(id);
			return true;
		}
		
		return false;
		
	}
}

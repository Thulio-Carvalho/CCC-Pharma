package com.pharma.PharmaCCC.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharma.PharmaCCC.models.Categoria;
import com.pharma.PharmaCCC.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository categoriaRepository;

	public List<Categoria> getAllCategoria() {
		return this.categoriaRepository.findAll();
	}
	public Categoria getCategoriaById(Integer id) {	
		return this.categoriaRepository.findById(id).get();
	}
	
	public void save(Categoria categoria) {
		this.categoriaRepository.save(categoria);
	}
	
	public Categoria update(Categoria categoria, Integer id) {
		Categoria novaCategoria = this.categoriaRepository.findById(id).get();
	
		novaCategoria.setNome(categoria.getNome());
		novaCategoria.setQuantidade(categoria.getQuantidade());
		
		return novaCategoria;
	}
}

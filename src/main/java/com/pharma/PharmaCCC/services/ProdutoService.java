package com.pharma.PharmaCCC.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharma.PharmaCCC.models.Produto;
import com.pharma.PharmaCCC.repositories.ProdutoRepository;


@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository produtoRepository;

	public List<Produto> getAllClientes() {
		return this.produtoRepository.findAll();
	}
	public Produto getClienteById(Integer id) {	
		return this.produtoRepository.findById(id).get();
	}
	
	public void save(Produto produto) {
		this.produtoRepository.save(produto);
	}
	
	public Produto update(Produto cliente, Integer id) {
		Produto novoCliente = this.produtoRepository.findById(id).get();
	
		novoCliente.setNome(cliente.getNome());
		
		return novoCliente;
	}
}

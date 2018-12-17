package com.pharmaccc.phaguemenos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmaccc.phaguemenos.model.Produto;
import com.pharmaccc.phaguemenos.repository.ProdutoRepository;


@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository produtoRepository;

	public List<Produto> getAllProdutos() {
		return this.produtoRepository.findAll();
	}
	public Produto getProdutoById(Integer id) {	
		return this.produtoRepository.findById(id).get();
	}
	
	public Produto add(Produto produto) {
		return this.produtoRepository.save(produto);
	}
	
	public Produto update(Integer id, Produto produto) {
		Produto novoProduto = this.produtoRepository.findById(id).get();
		if(novoProduto != null) {
			novoProduto.setNome(produto.getNome());
			novoProduto.setCodigo(produto.getCodigo());
			novoProduto.setFabricante(produto.getFabricante());
			novoProduto.setQuantidade(novoProduto.getQuantidade());
			novoProduto.setPreco(produto.getPreco());
		}
		return novoProduto;
	}
	
	public boolean remover(Integer id) {
		Produto novoProduto = this.produtoRepository.findById(id).get();
		
		if(novoProduto != null) {
			this.produtoRepository.deleteById(id);
			return true;
		}
		
		return false;
		
	}
}

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

	public List<Produto> getAllProdutos() {
		return this.produtoRepository.findAll();
	}
	public Produto getProdutoById(Integer id) {	
		return this.produtoRepository.findById(id).get();
	}
	
	public void save(Produto produto) {
		this.produtoRepository.save(produto);
	}
	
	public Produto update(Produto produto, Integer id) {
		Produto novoProduto = this.produtoRepository.findById(id).get();
	
		novoProduto.setNome(produto.getNome());
		novoProduto.setCategoria(produto.getCategoria());
		novoProduto.setCodigo(produto.getCodigo());
		novoProduto.setFabricante(produto.getFabricante());
		novoProduto.setQuantidade(novoProduto.getQuantidade());
		novoProduto.setPreco(produto.getPreco());
		
		return novoProduto;
	}
}

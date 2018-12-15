package com.pharma.PharmaCCC.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pharma.PharmaCCC.services.ProdutoService;
import com.pharma.PharmaCCC.models.Produto;

@RestController
@CrossOrigin
@RequestMapping("/produto")
public class ProdutoController {
	
	@Autowired
	ProdutoService produtoService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String produtoController() {
		return "Controller Produto ok!";
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Produto> getAllProdutos() {
		Produto produto = new Produto();
		produtoService.save(produto);
		List<Produto> produtos = produtoService.getAllProdutos();
		return produtos;
	}
}

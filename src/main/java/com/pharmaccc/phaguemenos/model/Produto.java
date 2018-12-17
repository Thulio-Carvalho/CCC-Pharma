package com.pharmaccc.phaguemenos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


import javax.persistence.Column;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name = "id_produto")
	private Integer id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "quantidade")
	private Integer quantidade;
	
	@ManyToOne
	private Categoria categoria;
	
	@Column(name = "fabricante")
	private String fabricante;
	
	
	@Column(name = "preco")
	private Double preco;
	
	@Column(name = "codigo")
	private String codigo;
	
	public Produto() {}
	
	public Produto(String nome, Integer quantidade, Categoria categoria, String fabricante, Double preco, String codigo) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.categoria = categoria;
		this.fabricante = fabricante;
		this.preco = preco;
		this.codigo = codigo;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public String getFabricante() {
		return fabricante;
	}


	public Double getPreco() {
		return preco;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
		
}

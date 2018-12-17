package com.pharmaccc.phaguemenos.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "tb_categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name = "id_categoria")
	private Integer id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "desconto")
	private Integer desconto;
	
//	//@OneToMany(mappedBy = "categoria")
//	private List<Produto> produtos;
	
	public Categoria() {}

//	public List<Produto> getProdutos() {
//		return produtos;
//	}
//
//	public void setProdutos(List<Produto> produtos) {
//		this.produtos = produtos;
//	}

	public Categoria(String nome, Integer desconto) {
		this.nome = nome;
		this.desconto = desconto;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Integer getDesconto() {
		return desconto;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDesconto(Integer desconto) {
		this.desconto = desconto;
	}
	
}


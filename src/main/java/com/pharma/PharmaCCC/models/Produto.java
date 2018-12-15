package com.pharma.PharmaCCC.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Column;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@Column(name = "id_produto")
	private Integer id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "quantidade")
	private Integer quantidade;
	
	@Column(name = "fabricante")
	private String fabricante;
	
	@ManyToOne()
	@JoinColumn(name = "id_categoria")
	@JsonBackReference
	private Categoria categoria;
	
	@Column(name = "preco")
	private Double preco;
	
	@Column(name = "codigo")
	private String codigo;
	
	public Produto() {}
	
	public Produto(Integer id, String nome, Integer quantidade, String fabricante, Categoria categoria, Double preco, String codigo) {
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.fabricante = fabricante;
		this.categoria = categoria;
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

	public Categoria getCategoria() {
		return categoria;
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

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
		
}

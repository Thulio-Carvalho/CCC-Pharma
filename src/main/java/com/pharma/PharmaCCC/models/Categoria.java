package com.pharma.PharmaCCC.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	
	@Id
	@Column(name = "id_categoria")
	private Integer id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "desconto")
	private Integer quantidade;
	
	public Categoria() {}

	public Categoria(Integer id, String nome, Integer quantidade) {
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
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
	
	
}

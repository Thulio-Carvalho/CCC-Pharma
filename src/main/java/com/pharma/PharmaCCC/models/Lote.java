package com.pharma.PharmaCCC.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import javax.persistence.Column;

@Entity
@Table(name = "tb_lote")
public class Lote {
	
	@Id
	@Column(name = "id_lote")
	private Integer id;
	
	@Column(name = "quantidade")
	private String quantidade;
	
	@Column(name = "id_produto")
	private String produto;
	
	public Lote() {}
	
	public Lote(Integer id, String quantidade, String produto) {
		this.id = id;
		this.quantidade = quantidade;
		this.produto = produto;
	}

	public Integer getId() {
		return id;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public String getProduto() {
		return produto;
	}
}

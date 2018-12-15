package com.pharma.PharmaCCC.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_venda_item")
public class VendaItem {
	
	@Column(name = "id_venda")
	private Integer venda;
	
	@Column(name = "id_produto")
	private Integer produto;
	
	@Column(name = "quantidade")
	private Integer quantidade;
	
	@Column(name = "valor_produto")
	private Double valor;
	
	public VendaItem() {}
	
	public VendaItem(Integer venda, Integer produto, Integer quantidade, Double valor) {
		this.venda = venda;
		this.produto = produto;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public Integer getVenda() {
		return venda;
	}

	public Integer getProduto() {
		return produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public Double getValor() {
		return valor;
	}
}

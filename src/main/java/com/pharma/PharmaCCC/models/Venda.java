package com.pharma.PharmaCCC.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "tb_venda")
public class Venda {
	@Id
	@Column(name = "id_venda")
	private Integer id;
	
	@Column(name = "id_client")
	@JsonBackReference
	private Cliente cliente;
	
	@Column(name = "valor_total")
	private Integer valor;
	
	public Venda() {}
	
	public Venda(Integer id, Cliente cliente, Integer valor) {
		this.id = id;
		this.cliente = cliente;
		this.valor = valor;
	}

	public Integer getId() {
		return id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Integer getValor() {
		return valor;
	}
}

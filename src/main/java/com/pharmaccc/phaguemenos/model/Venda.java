package com.pharmaccc.phaguemenos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tb_venda")
public class Venda {
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name = "id_venda")
	private Integer id;
	
	@ManyToOne
	private Usuario cliente;
	
	@Column(name = "valor_total")
	private Integer valor;
	
	public Venda() {}
	
	public Venda(Usuario cliente, Integer valor) {
		this.cliente = cliente;
		this.valor = valor;
	}

	public Integer getId() {
		return id;
	}

	public Usuario getCliente() {
		return cliente;
	}

	public Integer getValor() {
		return valor;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

}

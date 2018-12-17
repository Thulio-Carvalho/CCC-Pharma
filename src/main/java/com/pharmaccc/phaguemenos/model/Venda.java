package com.pharmaccc.phaguemenos.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
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
	
	 @ManyToMany(fetch = FetchType.LAZY,
	            cascade = CascadeType.ALL)
	 @JoinTable(
		        name = "produto_venda", 
		        joinColumns = { @JoinColumn(name = "id_venda") }, 
		        inverseJoinColumns = { @JoinColumn(name = "id_produto") }
		    )
	private List<Produto> produtos;
	
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

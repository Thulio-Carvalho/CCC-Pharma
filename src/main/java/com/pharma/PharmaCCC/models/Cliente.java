package com.pharma.PharmaCCC.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "tb_cliente")
public class Cliente {
	@Id
	@Column(name = "id_cliente")
	private Integer id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "senha")
	private String senha;
	
	public Cliente() {}
	
	public Cliente(Integer id, String nome, String senha) {
		this.id = id;
		this.nome = nome;
		this.senha = senha;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}
	
}

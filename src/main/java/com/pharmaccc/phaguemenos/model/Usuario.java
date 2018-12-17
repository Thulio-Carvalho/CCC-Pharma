package com.pharmaccc.phaguemenos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;

@Entity
@Table(name = "tb_cliente")
public class Usuario {
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name = "id_cliente")
	private Integer id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "senha")
	private String senha;
	
	@Column(name = "isAdmin")
	private boolean isAdmin;
	
	@Column(name = "email")
	private String email;
	public Usuario() {}
	
	public Usuario(String nome, String senha, boolean isAdmin, String email) {
		this.nome = nome;
		this.senha = senha;
		this.isAdmin = isAdmin;
		this.email = email;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}

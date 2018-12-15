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
	private int id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "senha")
	private String senha;
}

package com.pharma.PharmaCCC.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "tb_administrador")
public class Administrador {
	@Id
	@Column(name = "id_cliente")
	private Integer id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "senha")
	private String senha;
}

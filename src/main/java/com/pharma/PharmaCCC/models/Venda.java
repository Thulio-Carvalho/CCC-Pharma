package com.pharma.PharmaCCC.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_venda")
public class Venda {
	
	@Id
	@Column(name = "id_venda")
	private Integer id;
	
}

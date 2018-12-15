package com.pharma.PharmaCCC.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharma.PharmaCCC.models.Cliente;
import com.pharma.PharmaCCC.models.Produto;
import com.pharma.PharmaCCC.models.Venda;
import com.pharma.PharmaCCC.repositories.VendaRepository;

@Service
public class VendaService {
	private VendaRepository vendaRepository;

	public List<Venda> getAllVendas() {
		return this.vendaRepository.findAll();
	}
	public Venda getVendaById(Integer id) {	
		return this.vendaRepository.findById(id).get();
	}
	
	public void save(Venda venda) {
		this.vendaRepository.save(venda);
	}
	
	public Venda update(Venda venda, Integer id) {
		Venda novaVenda = this.vendaRepository.findById(id).get();
	
		novaVenda.setCliente(venda.getCliente());
		novaVenda.setValor(venda.getValor());
		
		return novaVenda;
	}
}

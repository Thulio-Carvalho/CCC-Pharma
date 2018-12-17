package com.pharmaccc.phaguemenos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pharmaccc.phaguemenos.model.Venda;
import com.pharmaccc.phaguemenos.repository.VendaRepository;


public class VendaService {
	@Autowired
	private VendaRepository vendaRepository;

	public List<Venda> getAllVendas() {
		return this.vendaRepository.findAll();
	}
	public Venda getVendaById(Integer id) {
		//Optional<Usuario> usuario = this.usuarioRepository.findById(id);	
		return this.vendaRepository.findById(id).get();
	}
	
	public Venda add(Venda venda) {
		return this.vendaRepository.save(venda);
	}
	
	public Venda update(Integer id, Venda venda) {
		Venda novaVenda = this.vendaRepository.findById(id).get();
		
		if(novaVenda != null) {
			novaVenda.setValor(venda.getValor());
			novaVenda.setCliente(venda.getCliente());
		}
		
		
		return novaVenda;
	}
	
	public boolean remover(Integer id) {
		Venda novoVenda = this.vendaRepository.findById(id).get();
		
		if(novoVenda != null) {
			this.vendaRepository.deleteById(id);
			return true;
		}
		
		return false;
		
	}
}

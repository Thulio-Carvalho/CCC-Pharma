package com.pharmaccc.phaguemenos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmaccc.phaguemenos.model.Cliente;
import com.pharmaccc.phaguemenos.repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;

	public List<Cliente> getAllClientes() {
		return this.clienteRepository.findAll();
	}
	public Cliente getClienteById(Integer id) {
		//Optional<Cliente> cliente = this.clienteRepository.findById(id);	
		return this.clienteRepository.findById(id).get();
	}
	
	public Cliente add(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	public Cliente update(Integer id, Cliente cliente) {
		Cliente novoCliente = this.clienteRepository.findById(id).get();
		
		novoCliente.setNome(cliente.getNome());
		novoCliente.setSenha(cliente.getSenha());
		
		return novoCliente;
	}
}

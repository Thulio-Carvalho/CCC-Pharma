package com.pharma.PharmaCCC.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharma.PharmaCCC.repositories.ClienteRepository;
import com.pharma.PharmaCCC.models.Cliente;

@Service
public class ClienteService {
	private ClienteRepository clienteRepository;

	public List<Cliente> getAllClientes() {
		return this.clienteRepository.findAll();
	}
	public Cliente getClienteById(Integer id) {
		//Optional<Cliente> cliente = this.clienteRepository.findById(id);	
		return this.clienteRepository.findById(id).get();
	}
	
	public void save(Cliente cliente) {
		this.clienteRepository.save(cliente);
	}
	
	public Cliente update(Cliente cliente, Integer id) {
		Cliente novoCliente = this.clienteRepository.findById(id).get();
	
		novoCliente.setNome(cliente.getNome());
		novoCliente.setSenha(cliente.getSenha());
		
		return novoCliente;
	}
}

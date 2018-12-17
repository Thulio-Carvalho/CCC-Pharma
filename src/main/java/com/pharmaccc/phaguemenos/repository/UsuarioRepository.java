package com.pharmaccc.phaguemenos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pharmaccc.phaguemenos.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	List<Usuario> findAllByNome(String nome);
}

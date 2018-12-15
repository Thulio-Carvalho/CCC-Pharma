package com.pharma.PharmaCCC.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pharma.PharmaCCC.models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
	
}

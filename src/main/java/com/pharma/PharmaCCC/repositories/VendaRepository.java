package com.pharma.PharmaCCC.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pharma.PharmaCCC.models.Cliente;

public interface VendaRepository extends JpaRepository<Cliente, Integer>{

}

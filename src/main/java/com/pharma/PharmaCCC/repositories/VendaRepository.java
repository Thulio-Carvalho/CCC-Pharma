package com.pharma.PharmaCCC.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pharma.PharmaCCC.models.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Integer>{

}

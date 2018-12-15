package com.pharma.PharmaCCC.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pharma.PharmaCCC.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}

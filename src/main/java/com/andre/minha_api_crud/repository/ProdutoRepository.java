package com.andre.minha_api_crud.repository;

import com.andre.minha_api_crud.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
   
}

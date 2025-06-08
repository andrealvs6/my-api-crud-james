package com.andre.minha_api_crud.repository;

import com.andre.minha_api_crud.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Marca esta interface como um "caderninho"
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // O Spring Boot já sabe como fazer o CRUD aqui, você não precisa escrever nada!
}

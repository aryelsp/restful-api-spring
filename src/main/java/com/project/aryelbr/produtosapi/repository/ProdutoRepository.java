package com.project.aryelbr.produtosapi.repository;

import com.project.aryelbr.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}

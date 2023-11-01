package com.zpx.bakery.repository;

import com.zpx.bakery.dto.ListarProduto;
import com.zpx.bakery.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProdutoRepository extends JpaRepository <Produto,Long> {

}

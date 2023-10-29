package com.zpx.bakery.controll;

import com.zpx.bakery.dto.MeuProduto;
import com.zpx.bakery.models.Produto;
import com.zpx.bakery.repository.ProdutoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/produto")
@RestController
public class ProdutoControl {

    @Autowired
    ProdutoRepository repository;

    @PostMapping
    @Transactional
    public void salvar (@RequestBody MeuProduto meuProduto) {
        repository.save(new Produto(meuProduto));
    }

    @GetMapping
    public String ola(){
        return "Boa noite";
    }

}

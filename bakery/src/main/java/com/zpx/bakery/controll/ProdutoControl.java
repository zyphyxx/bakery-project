package com.zpx.bakery.controll;

import com.zpx.bakery.dto.ListarProduto;
import com.zpx.bakery.dto.MeuProduto;
import com.zpx.bakery.models.Produto;
import com.zpx.bakery.repository.ProdutoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/produto")
@RestController
public class ProdutoControl {

    @Autowired
    ProdutoRepository repository;

    @PostMapping
    @Transactional
    public void salvar(@RequestBody MeuProduto meuProduto) {
        Produto produto = new Produto(meuProduto);
        repository.save(produto);
    }

    @GetMapping
    public List<ListarProduto> listar() {
        return repository.findAll().stream().map(ListarProduto::new).toList(); // preciso entender
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PutMapping
    public void atualizar(@RequestBody Produto produto) {
        Long x = produto.getId();
        if (produto.getId().equals(x)) {
            repository.save(produto);
        }

    }


}

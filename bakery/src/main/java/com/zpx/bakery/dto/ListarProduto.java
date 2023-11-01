package com.zpx.bakery.dto;

import com.zpx.bakery.enums.Tipo;
import com.zpx.bakery.models.Produto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class ListarProduto {


    private Long id;
    private String nome;
    private Double preco;
    private Integer quantidade;
    private LocalDate validade;


    public ListarProduto(Produto produto){
        this.id = produto.getId();
        this.nome = produto.getNome();
        this.preco = produto.getPreco();
        this.quantidade = produto.getQuantidade();
        this.validade = produto.getValidade();

    }

}

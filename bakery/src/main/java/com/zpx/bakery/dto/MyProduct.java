package com.zpx.bakery.dto;

import com.zpx.bakery.models.Produto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyProduct {

    private Long id;
    private String name;
    private Integer quantity;

    public MyProduct(Produto produto){
        this.id = produto.getId();
        this.name = produto.getNome();
        this.quantity = produto.getQuantidade();
    }
}

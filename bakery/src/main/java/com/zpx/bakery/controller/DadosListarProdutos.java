package com.zpx.bakery.controller;

public record DadosListarProdutos(String name,String type) {
    public DadosListarProdutos(String name, String type) {
        this.name = name;
        this.type = type;
    }
}

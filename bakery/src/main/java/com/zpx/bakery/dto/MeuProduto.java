package com.zpx.bakery.dto;

import com.zpx.bakery.enums.Tipo;
import com.zpx.bakery.models.Produto;

import java.time.LocalDate;

public class MeuProduto {

    private Long id;
    private String nome;
    private Double preco;
    private Integer quantidade;
    private LocalDate validade;
    private Tipo tipo;

   /* public MeuProduto(Produto produto) {
      this.id = produto.getId();
      this.nome = produto.getNome();
      this.preco = produto.getPreco();
      this.quantidade = produto.getQuantidade();
      this.validade = produto.getValidade();
      this.tipo = produto.getTipo();
      }

    */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}

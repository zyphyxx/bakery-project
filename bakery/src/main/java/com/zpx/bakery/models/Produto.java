package com.zpx.bakery.models;

import com.zpx.bakery.dto.ListarProduto;
import com.zpx.bakery.dto.MeuProduto;
import com.zpx.bakery.enums.Tipo;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity(name = "produto")
@Table(name = "tb_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "preco")
    private Double preco;

    @Column(name = "quantidade")
    private Integer quantidade;

    @Column(name = "validade")
    private LocalDate validade;

    @Column(name = "tipo")
    @Enumerated(EnumType.STRING)
    private Tipo tipo;

    public Produto(){}

    public Produto(Long id, String nome, Double preco, Integer quantidade, LocalDate validade, Tipo tipo) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.validade = validade;
        this.tipo = tipo;
    }

    public Produto(MeuProduto meuProduto) {

    }


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return Objects.equals(getId(), produto.getId()) && Objects.equals(getNome(), produto.getNome()) && Objects.equals(getPreco(), produto.getPreco()) && Objects.equals(getQuantidade(), produto.getQuantidade()) && Objects.equals(getValidade(), produto.getValidade()) && getTipo() == produto.getTipo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getPreco(), getQuantidade(), getValidade(), getTipo());
    }
}





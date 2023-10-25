package com.zpx.bakery.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_movimentacao")
public class Movimentation {

    @Id
    @Column(name = "id_produto_mov")
    private Integer id_productMov;

    @Column(name = "quantidade")
    private Integer quantity;

    @Column(name = "valor")
    private Double value;

    @ManyToOne
    @JoinColumn(name = "id_produto_mov,", referencedColumnName = "id")
    private Product product;

    // constructor
    public Movimentation() {
    }

    // getters and setters

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

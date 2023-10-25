package com.zpx.bakery.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_estoque")
public class Stock {

    @Id
    @Column(name = "id_produto_est")
    private Integer id_productStc;

    @Column(name = "qnt_estoque")
    private Integer qnt_stock;

    @ManyToOne
    @JoinColumn(name = "id_produto_est", referencedColumnName = "id", insertable = false, updatable = false)
    private Product product;

    // constructor
    public Stock() {
    }

    // getters and setters

    public Integer getId_productStc() {
        return id_productStc;
    }

    public void setId_productStc(Integer id_productStc) {
        this.id_productStc = id_productStc;
    }

    public Integer getQnt_stock() {
        return qnt_stock;
    }

    public void setQnt_stock(Integer qnt_stock) {
        this.qnt_stock = qnt_stock;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    // equals and hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stock stock)) return false;
        return Objects.equals(getId_productStc(), stock.getId_productStc()) && Objects.equals(getQnt_stock(), stock.getQnt_stock()) && Objects.equals(getProduct(), stock.getProduct());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId_productStc(), getQnt_stock(), getProduct());
    }
}

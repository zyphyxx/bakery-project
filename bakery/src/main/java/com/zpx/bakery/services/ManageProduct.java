package com.zpx.bakery.services;

import com.zpx.bakery.entities.Product;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ManageProduct {

    private List<Product> products = new ArrayList<>();

    private EntityManager entityManager;


    public void addProduct(Product product){
        entityManager.persist(new Product("Lapis",2.00,10));
    }

    public void removeProduct (Product product){
        products.remove(product);
    }

    public List<Product> listProducts(){
        return products;
    }
}

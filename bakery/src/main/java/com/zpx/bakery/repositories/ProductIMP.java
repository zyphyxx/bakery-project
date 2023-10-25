package com.zpx.bakery.repositories;

import com.zpx.bakery.entities.Product;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductIMP implements ProductDAO {

    EntityManager entityManager;

    @Autowired
    public ProductIMP(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void addProduct(Product product) {
        entityManager.persist(product);
    }
}

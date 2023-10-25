package com.zpx.bakery.repositories;

import com.zpx.bakery.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product,Integer> {




}

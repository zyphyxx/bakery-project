package com.zpx.bakery.controller;

import com.zpx.bakery.entities.Product;
import com.zpx.bakery.repositories.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/bakery")
public class ProductController {

    ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public String ola(){
        return "<h1>Bakery</><br/>";
    }


    @PostMapping
    @Transactional
    public Product createProduct(@RequestBody Product product) {

        return productRepository.save(product);
    }
    




}

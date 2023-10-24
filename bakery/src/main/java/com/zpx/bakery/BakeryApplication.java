package com.zpx.bakery;

import com.zpx.bakery.entities.Product;
import com.zpx.bakery.services.ManageProduct;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BakeryApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BakeryApplication.class, args);


    }
        ManageProduct manageProduct = new ManageProduct();
    @Override
    public void run(String... args) throws Exception {
        manageProduct.addProduct(new Product("Lapis",2.00,10));
    }
}

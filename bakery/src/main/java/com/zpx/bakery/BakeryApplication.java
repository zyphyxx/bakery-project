package com.zpx.bakery;

import com.zpx.bakery.controller.ProductController;
import com.zpx.bakery.entities.Product;
import com.zpx.bakery.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BakeryApplication {

    public static void main(String[] args) {
        SpringApplication.run(BakeryApplication.class, args);


    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository) {
        return runner -> {

            Product p2 = new Product();
            p2.setName("Caderno");
            p2.setType("Material Escolar");

        };
    }


}

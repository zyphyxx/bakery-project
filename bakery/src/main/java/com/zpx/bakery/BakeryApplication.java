package com.zpx.bakery;

import com.zpx.bakery.entities.Product;
import com.zpx.bakery.repositories.ProductDAO;
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
    CommandLineRunner commandLineRunner(ProductDAO productDAO) {
        return runner -> {

            Product p1 = new Product();
            p1.setName("Lapis");
            p1.setType("Material Escolar");

            productDAO.addProduct(p1);

            System.out.println("salvo com sucesso");

        };
    }


}

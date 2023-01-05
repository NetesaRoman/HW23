package com.example.hw23.configurations;

import com.example.hw23.models.Product;
import com.example.hw23.models.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 *
 * @author Roman Netesa
 *
 */
@Configuration
public class ProductConfiguration {

    @Bean
    public Product product1(){
        return new Product(1, "Apples", 25.5);
    }

    @Bean
    public Product product2(){
        return new Product(2, "Banana", 25.5);
    }

    @Bean
    public Product product3(){
        return new Product(3, "HIMARS", 308000000.0);
    }

    @Bean
    public Product product4(){
        return new Product(4, "Happiness", 9000.0);
    }

    @Bean
    public ProductRepository productRepository(){
        return new ProductRepository();
    }
}

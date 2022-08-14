package com.gabrlaur.springreactive.services;

import com.gabrlaur.springreactive.models.Product;
import com.gabrlaur.springreactive.repositories.ProductRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Flux<Product> getProducts() {
        return productRepository.findAll()
                .delayElements(Duration.ofSeconds(5)); //for any element add a delay
    }
}

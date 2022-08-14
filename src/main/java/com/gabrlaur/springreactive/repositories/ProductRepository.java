package com.gabrlaur.springreactive.repositories;

import com.gabrlaur.springreactive.models.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductRepository extends ReactiveCrudRepository<Product, Integer> {
}

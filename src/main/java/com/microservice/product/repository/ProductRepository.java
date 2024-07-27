package com.microservice.product.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservice.product.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}

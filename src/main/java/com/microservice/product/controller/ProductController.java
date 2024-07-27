package com.microservice.product.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.product.model.Product;
import com.microservice.product.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/v1/products")
	public Iterable<Product> getProducts() {
		return productService.getProducts();
	}
	
	@GetMapping("/v1/products/{id}")
	public Product getEmployee(@PathVariable("id") Long id) {
		Optional<Product> product = productService.getProduct(id);
		if(product.isPresent()) {
			return product.get();
		}else {
			return null;
		}
	}

}

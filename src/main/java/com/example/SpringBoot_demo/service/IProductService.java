package com.example.SpringBoot_demo.service;

import com.example.SpringBoot_demo.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {

    Product addProduct (Product product);
    void deleteProduct(Long ProductId);
    Product updateProduct(Product product, Long productId);
    Optional<Product> getProductById(Long productId);
    List<Product> getProductList();
}

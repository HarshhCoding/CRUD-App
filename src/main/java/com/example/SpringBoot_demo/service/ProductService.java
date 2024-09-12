package com.example.SpringBoot_demo.service;
import com.example.SpringBoot_demo.model.Product;
import com.example.SpringBoot_demo.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ProductService implements IProductService {
    private final ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long productId){
        if(productRepository.findById(productId).isPresent()) {
            productRepository.deleteById(productId);
        }
    }

    @Override
    public Product updateProduct(Product product, Long productId) {
        if(productRepository.findById(productId).isPresent()){
            return productRepository.save(product);
        }
        return null;
    }

    @Override
    public Optional<Product> getProductById(Long productId) {
            return productRepository.findById(productId);
    }

    @Override
    public List<Product> getProductList() {
        return productRepository.findAll();
    }

}

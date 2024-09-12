package com.example.SpringBoot_demo.controller;
import com.example.SpringBoot_demo.model.Product;
import com.example.SpringBoot_demo.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final IProductService productService;

    @GetMapping("/all")
    public List<Product> getAllProducts(){
        return productService.getProductList();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable ("id") Long id){
        return productService.getProductById(id);
    }

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product){
         return productService.addProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable ("id") Long id){
        productService.deleteProduct(id);
    }

    @PutMapping("/update/{id}")
    public Product updateProduct(@RequestBody Product product, @PathVariable("id") Long id){
        return productService.updateProduct(product, id);
    }

}

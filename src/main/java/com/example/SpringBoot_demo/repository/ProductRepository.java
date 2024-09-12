package com.example.SpringBoot_demo.repository;

import com.example.SpringBoot_demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product,Long> {
}

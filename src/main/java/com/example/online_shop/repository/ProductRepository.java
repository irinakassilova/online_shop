package com.example.online_shop.repository;

import com.example.online_shop.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findAllByName(String name);
    Page<Product> findAllByCategoryId(int id, Pageable pageable);
    Page<Product> findAll(Pageable pageable);
    List<Product> findByNameStartingWithIgnoreCase(String name);
    List<Product> findByDescriptionContainingIgnoreCase(String description);
    List<Product> findByNameContainingIgnoreCase(String name);
    List<Product> findAll();
}

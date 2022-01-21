package com.example.online_shop.repository;

import com.example.online_shop.model.Basket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasketRepository extends JpaRepository<Basket, String> {
    void deleteById(int id);

    Basket findById(int id);

    Basket getById(int id);
}




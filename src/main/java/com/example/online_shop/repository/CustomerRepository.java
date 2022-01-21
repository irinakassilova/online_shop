package com.example.online_shop.repository;

import com.example.online_shop.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    boolean existsByEmail(String email);

    Optional<Customer> findByEmail(String email);
}

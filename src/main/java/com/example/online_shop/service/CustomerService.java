package com.example.online_shop.service;

import com.example.online_shop.dto.CustomerDTO;
import com.example.online_shop.model.Customer;
import com.example.online_shop.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public void createCustomer(CustomerDTO customerDTO) {
       Customer customer = new Customer(customerDTO.getEmail(), customerDTO.getPassword());
       customerRepository.save(customer);
    }
}

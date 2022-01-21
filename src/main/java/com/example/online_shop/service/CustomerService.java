package com.example.online_shop.service;

import com.example.online_shop.dto.CustomerDTO;
import com.example.online_shop.exception.CustomerAlreadyRegisterException;
import com.example.online_shop.exception.CustomerNotFoundException;
import com.example.online_shop.model.Customer;
import com.example.online_shop.model.CustomerRegisterForm;
import com.example.online_shop.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository repository;
    private final PasswordEncoder encoder;

    public CustomerDTO register(CustomerRegisterForm customer){
        if (repository.existsByEmail(customer.getEmail())){
            throw new CustomerAlreadyRegisterException();
        }

        var user = Customer.builder()
                .email(customer.getEmail())
                .fullname(customer.getName())
                .password(encoder.encode(customer.getPassword()))
                .build();

        repository.save(user);

        return CustomerDTO.from(user);

    }

    public CustomerDTO getByEmail(String email) {
        var user = repository.findByEmail(email)
                .orElseThrow(CustomerNotFoundException::new);

        return CustomerDTO.from(user);
    }
}

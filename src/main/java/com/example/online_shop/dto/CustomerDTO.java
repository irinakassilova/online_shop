package com.example.online_shop.dto;

import com.example.online_shop.model.Customer;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(access = AccessLevel.PACKAGE)
public class CustomerDTO {
        private int id;
        private String fullname;
        private String email;

        static public  CustomerDTO from(Customer customer){
                return builder()
                        .id(customer.getId())
                        .fullname(customer.getFullname())
                        .email(customer.getEmail())
                        .build();
        }
}


package com.example.online_shop.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

//    @Email
//    @NotBlank
//    @Size(min=1, max=128)
    @Column(length = 128)
    private String email;

//    @NotBlank
//    @Size(min=5, max=15)
    @Column(length = 15)
    private String password;

    public Customer(String email, String password) {
        this.email=email;
        this.password=password;
    }
}

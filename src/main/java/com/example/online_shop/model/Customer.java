package com.example.online_shop.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 128)
    private String email;

    @Column(length = 15)
    private String password;

    @Column
    private boolean enabled;

    public Customer(String email, String password) {
        this.email=email;
        this.password=password;
        this.enabled=true;
    }
}

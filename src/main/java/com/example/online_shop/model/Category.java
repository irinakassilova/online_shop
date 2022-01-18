package com.example.online_shop.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 45)
    private String name;

    @Column(length = 128)
    private String description;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
    @OrderBy("name ASC")
    List<Product> products;
}

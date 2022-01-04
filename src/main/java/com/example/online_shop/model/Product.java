package com.example.online_shop.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Size(min=1, max=128)
//    @Column(length = 128)
    private String name;

    @NotBlank
    @Size(min = 1, max = 450)
//    @Column(length = 450)
    private String image;

    @NotBlank
    @Size(min = 1, max = 280)
//    @Column(length = 280)
    private String description;

    @PositiveOrZero
//    @Column
    private int count;

    @Positive
//    @Column
    private float price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;
}



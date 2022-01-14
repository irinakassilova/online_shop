package com.example.online_shop.dto;

import com.example.online_shop.model.Category;
import com.example.online_shop.model.Product;
import lombok.*;

@Getter
@Setter
@ToString
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductDTO {

    private int id;
    private String name;
    private String image;
    private String description;
    private int count;
    private float price;
    private CategoryDTO category;

    public static ProductDTO from(Product product) {
        return builder()
                .id(product.getId())
                .name(product.getName())
                .category(CategoryDTO.from(product.getCategory()))
                .image(product.getImage())
                .price(product.getPrice())
                .description(product.getDescription())
                .count(product.getCount())
                .build();
    }
}


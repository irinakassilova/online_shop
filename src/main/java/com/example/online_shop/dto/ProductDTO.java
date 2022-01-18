package com.example.online_shop.dto;

import com.example.online_shop.model.Product;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductDTO {

    private int id;
    @Size(min = 2, max = 128)
    @NotBlank
    private String name;

    @Size(min=2, max= 450)
    @NotBlank
    private String image;

    @Size(min=2, max=280)
    @NotBlank
    private String description;

    @PositiveOrZero
    private int count;

    @Positive
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


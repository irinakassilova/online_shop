package com.example.online_shop.dto;

import com.example.online_shop.model.Category;
import lombok.*;

@Getter
@Setter
@ToString
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CategoryDTO {
    private int id;
    private String name;
    private String description;

    public static CategoryDTO from(Category category) {
        return builder()
                .id(category.getId())
                .name(category.getName())
                .description(category.getDescription())
                .build();
    }
}

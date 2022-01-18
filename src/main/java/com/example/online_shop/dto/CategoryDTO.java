package com.example.online_shop.dto;

import com.example.online_shop.model.Category;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CategoryDTO {

    @Size(min=2, max=45)
    @NotBlank
    private String name;

    @Size(min=2, max=128)
    @NotBlank
    private String description;

    public static CategoryDTO from(Category category) {
        return builder()
                .name(category.getName())
                .description(category.getDescription())
                .build();
    }
}

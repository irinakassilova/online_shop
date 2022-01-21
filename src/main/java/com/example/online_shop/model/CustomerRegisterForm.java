package com.example.online_shop.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
public class CustomerRegisterForm {
    @NotBlank
    @Email
    private String email= "";

    @Size(min=4, max=24, message = "Длина должна быть>= 4 и <= 24")
    @Pattern(regexp = "^[^\\d\\s]+$", message = "Должен содеожать только буквы")
    private String name = "";

    @NotBlank
    private String password = "";
}

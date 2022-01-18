package com.example.online_shop.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
public class CustomerDTO {
        @Email
        @Size(min=3, max=128)
        @NotBlank
        private String email;

        @Size(min =3, max=15)
        @NotBlank
        private String password;
}


package com.example.online_shop.controller;

import com.example.online_shop.service.ProductService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@RequestMapping
public class Controller {
    private final ProductService productService;

    @GetMapping
    public String roots() {
        return "main_page";
    }
}

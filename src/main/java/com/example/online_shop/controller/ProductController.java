package com.example.online_shop.controller;

import com.example.online_shop.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public String roots() {
        return "main_page";
    }


}

package com.example.online_shop.controller;

import com.example.online_shop.exception.ResourceNotFoundException;
import com.example.online_shop.service.ProductService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public String getProducts(Model model) {
        model.addAttribute("products", productService.findAll());
        return "products";
    }

    @GetMapping("/{id}")
    public String getProductById(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "product";
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    private String handleRNF(ResourceNotFoundException ex, Model model) {
        model.addAttribute("product", ex.getResource());
        model.addAttribute("id", ex.getId());
        return "not_found";
    }

}

package com.example.online_shop.controller;

import com.example.online_shop.exception.ResourceNotFoundException;
import com.example.online_shop.service.ProductService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
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
        model.addAttribute("products", productService.findById(id));
        return "product" + id;
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    private String handleRNF(ResourceNotFoundException ex, Model model) {
        model.addAttribute("products", ex.getResource());
        model.addAttribute("id", ex.getId());
        return "not_found";
    }

    @PostMapping("/filter/name")
    public String findByName(@RequestParam String name, Model model) {
        model.addAttribute("products", productService.findByNameIgnoreCase(name));
        return "products";
    }

    @PostMapping("/filter/description")
    public String findByDescription(@RequestParam String description, Model model) {
        model.addAttribute("products", productService.findByDescriptionIgnoreCase(description));
        return "products";
    }
}

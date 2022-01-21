package com.example.online_shop.controller;

import com.example.online_shop.service.CategoryService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@RequestMapping("/categories")
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping()
    public String getCategories(Model model) {
        model.addAttribute("categories", categoryService.findAll());
        return "category";
    }
}

package com.example.online_shop.controller;

import com.example.online_shop.service.ProductService;
import com.example.online_shop.service.PropertiesService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@Validated
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@RequestMapping
public class Controller {

    @GetMapping
    public String roots() {
        return "main_page";
    }

    @GetMapping("/contacts")
    public String getContacts() {
        return "contacts";
    }
}

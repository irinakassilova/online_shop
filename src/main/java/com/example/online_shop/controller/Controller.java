package com.example.online_shop.controller;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@Validated
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@RequestMapping
public class Controller {

    @GetMapping
    public String roots(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        model.addAttribute("name", authentication.getName());
        return "main_page";
    }

    @GetMapping("/contacts")
    public String getContacts() {
        return "contacts";
    }
}

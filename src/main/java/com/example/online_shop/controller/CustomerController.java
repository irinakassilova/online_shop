package com.example.online_shop.controller;

import com.example.online_shop.dto.CustomerDTO;
import com.example.online_shop.service.CustomerService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Validated
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@RequestMapping
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping(path = "/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String getCustomerLogin(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        model.addAttribute("name", authentication.getName());
        return "redirect:/";
    }

    @GetMapping("/login-error")
    public String viewLoginError(Model model) {
        model.addAttribute("hasError", "true");
        return "login";
    }


    @GetMapping("/register")
    public String register() {
        return "register";

    }
    @PostMapping("/register")
    public String addRegister(CustomerDTO customerDTO) {
        customerService.createCustomer(customerDTO);
        return "redirect:/";
    }
}


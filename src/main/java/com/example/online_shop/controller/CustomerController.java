package com.example.online_shop.controller;

import com.example.online_shop.model.CustomerRegisterForm;
import com.example.online_shop.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.security.Principal;

@Controller
@AllArgsConstructor
public class CustomerController {
    private final CustomerService service;

    @GetMapping("/register")
    public String register(Model model){
        if (!model.containsAttribute("customer")) {
            model.addAttribute("customer", new CustomerRegisterForm());
        }

        return "register";
    }

    @PostMapping("/register")
    public String registerPage(@Valid CustomerRegisterForm customerRequestDto,
                               BindingResult validationResult,
                               RedirectAttributes attributes) {
        attributes.addFlashAttribute("customer", customerRequestDto);

        if (validationResult.hasFieldErrors()) {
            attributes.addFlashAttribute("errors", validationResult.getFieldErrors());
            return "redirect: /register";
        }

        service.register(customerRequestDto);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String loginPage(@RequestParam(required = false, defaultValue = "false") Boolean error, Model model) {
        model.addAttribute("error", error);
        return "login";
    }

    @GetMapping("/profile")
    public String profile(Model model, Principal principal){
        var user = service.getByEmail(principal.getName());
        model.addAttribute("customer", user);
        return "profile";
    }
}

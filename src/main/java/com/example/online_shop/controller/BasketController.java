package com.example.online_shop.controller;

import com.example.online_shop.model.Basket;
import com.example.online_shop.service.BasketService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.nio.file.AccessDeniedException;

@Controller
@AllArgsConstructor
public class BasketController {
    private final BasketService basketService;

    @GetMapping("/basket")
    public String getBasket(Model model) {
        model.addAttribute("baskets", basketService.getAll());
        return "basket";
    }

    @PostMapping("/basket/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addProductToBasket(@RequestParam(value = "id",required = false) int id, int count, Authentication authentication, HttpSession session) throws AccessDeniedException {
        if (authentication != null) {
            basketService.createBasket(id, count);
            basketService.addProductToSession(session,id);
        } else {
            throw new AccessDeniedException("error.ftlh");
        }
    }

    @GetMapping("/basket/{id}")
    public String getBasketById(@PathVariable int id, Model model) {
        Basket basket = basketService.getById(id);
        model.addAttribute("basket", basket);
        return "basket";
    }

    @PostMapping("/basket/delete")
    public String deleteBasket(@RequestParam int id) {
        basketService.delete(id);
        return "redirect:/basket";
    }
}


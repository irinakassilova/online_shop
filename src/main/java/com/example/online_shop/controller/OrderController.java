package com.example.online_shop.controller;

import com.example.online_shop.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
@AllArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @GetMapping("/order")
    public String getOrders(Model model) {
        model.addAttribute("orders", orderService.getAll());
        return "order";
    }

    @PostMapping("/order")
    public String addProductToOrder(@RequestParam @Valid int id, String address, String phone){
        orderService.createOrder(address, phone, id);
        return  "redirect:/";
    }
}


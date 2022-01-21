package com.example.online_shop.service;

import com.example.online_shop.model.Basket;
import com.example.online_shop.model.Order;
import com.example.online_shop.repository.BasketRepository;
import com.example.online_shop.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderService {
    private  final OrderRepository orderRepository;
    private final BasketRepository basketRepository;

    public void createOrder(String address, String phone, int id) {
        Basket basket = basketRepository.getById(id);
        Order order = new Order();
        order.setAddress(address);
        order.setPhone(phone);
        order.setBasket(basket);
        orderRepository.save(order);
    }
    public Iterable<Basket> getAll() {
        return basketRepository.findAll();
    }

}


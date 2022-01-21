package com.example.online_shop.service;

import com.example.online_shop.model.Basket;
import com.example.online_shop.model.Product;
import com.example.online_shop.repository.BasketRepository;
import com.example.online_shop.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class BasketService {
    private  final BasketRepository basketRepository;
    private final ProductRepository productRepository;


    public void createBasket(int count, int id) {
        Product product = productRepository.getById(id);
        Basket basket = new Basket();
        basket.setCount(count);
        basket.setProduct(product);
        basketRepository.save(basket);
    }
    public List<Basket> getAll() {
        return basketRepository.findAll();
    }

    public  void delete(int id){
        basketRepository.deleteById(id);
    }

    public  Basket getById(int id) {
        return basketRepository.findById(id);
    }

    public void addProductToSession(HttpSession session, int id) {
        List<Product> products  =new ArrayList<>();
        session.setAttribute("", products);

    }


//    public void addProduct(int id, String name) {
//    }
}

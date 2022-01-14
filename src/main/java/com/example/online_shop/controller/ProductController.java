package com.example.online_shop.controller;

import com.example.online_shop.exception.ResourceNotFoundException;
import com.example.online_shop.repository.ProductRepository;
import com.example.online_shop.service.ProductService;
import com.example.online_shop.service.PropertiesService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@Validated
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    private final PropertiesService propertiesService;
    private  final ProductRepository productRepository;

    private static <T> void constructPageable(Page<T> list, int pageSize, Model model, String uri) {
        if (list.hasNext()) {
            model.addAttribute("nextPageLink", constructPageUri(uri, list.nextPageable().getPageNumber(), list.nextPageable().getPageSize()));
        }
        if (list.hasPrevious()) {
            model.addAttribute("prevPageLink", constructPageUri(uri, list.previousPageable().getPageNumber(), list.previousPageable().getPageSize()));
        }
        model.addAttribute("hasNext", list.hasNext());
        model.addAttribute("hasPrev", list.hasPrevious());
        model.addAttribute("products", list.getContent());
        model.addAttribute("defaultPageSize", pageSize);
    }

    private static String constructPageUri(String uri, int page, int size) {
        return String.format("%s?page=%s&size=%s", uri, page, size);
    }

    @GetMapping
    public String getProducts(Model model, Pageable pageable, HttpServletRequest request) {
        var products = productService.findAll(pageable);
        var uri= request.getRequestURI();
        model.addAttribute("products", productRepository.findAll());
        constructPageable(products, propertiesService.getDefaultPageSize(), model, uri);
        return "products";
    }

    @GetMapping("/{id}")
    public String getProductById(@PathVariable int id, Model model) {
        model.addAttribute("products", productService.findById(id));
        return "product";
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

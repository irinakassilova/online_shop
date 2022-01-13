package com.example.online_shop.service;

import com.example.online_shop.dto.ProductDTO;
import com.example.online_shop.exception.ResourceNotFoundException;
import com.example.online_shop.model.Category;
import com.example.online_shop.model.Product;
import com.example.online_shop.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Page<ProductDTO> getProducts(int id, Pageable pageable) {
        return productRepository.findAllByCategoryId(id, pageable)
                .map(ProductDTO::from);
    }

    public Product findById(int id){
        return productRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("product",id));
    }

    public List<Product> findAllByName(String name){
        return productRepository.findAllByName(name);
    }

    public void createProduct(Category category) {
        Product product = new Product();
        product.setName(product.getName());
        product.setImage(product.getImage());
        product.setCount(product.getCount());
        product.setDescription(product.getDescription());
        product.setCategory(category);
        product.setPrice(product.getPrice());
        productRepository.save(product);
    }
    public Iterable<Product> findByNameIgnoreCase(String name) {
        return productRepository.findByNameContainingIgnoreCase(name);
    }

    public Iterable<Product> findByDescriptionIgnoreCase(String description) {
        return productRepository.findByDescriptionContainingIgnoreCase(description);
    }
}

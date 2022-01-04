package com.example.online_shop.service;

import com.example.online_shop.exception.ResourceNotFoundException;
import com.example.online_shop.model.Category;
import com.example.online_shop.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(int id){
        return categoryRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("category",id));
    }

    public List<Category> findAllByName(String name){
        return categoryRepository.findAllByName(name);
    }

    public void createCategory(){
        Category category = new Category();
        category.setName(category.getName());
        category.setDescription(category.getDescription());
        categoryRepository.save(category);
    }
}

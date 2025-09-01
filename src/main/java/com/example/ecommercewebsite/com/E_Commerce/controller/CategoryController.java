package com.example.ecommercewebsite.com.E_Commerce.controller;

import com.example.ecommercewebsite.com.E_Commerce.entity.Category;
import com.example.ecommercewebsite.com.E_Commerce.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Category")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @PostMapping
    public Category createCategory(@RequestBody Category category){
        return categocd ryService.saveCategory(category);

    }
    @GetMapping("/{id}")
    public  Category getCategoryById(@PathVariable int id){
        return categoryService.getCategoryById(id);

    }
    @GetMapping("/category")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

}

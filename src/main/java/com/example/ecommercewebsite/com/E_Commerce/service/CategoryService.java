package com.example.ecommercewebsite.com.E_Commerce.service;

import com.example.ecommercewebsite.com.E_Commerce.entity.Category;

import java.util.List;

public interface CategoryService {
    Category saveCategory(Category category);
    Category getCategoryById(Integer id);
    List<Category>getAllCategories();
    void deleteCategoryById(Integer id);
    void deleteCategoryByName(String Name);


}

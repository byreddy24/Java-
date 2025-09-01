package com.example.ecommercewebsite.com.E_Commerce.ServiceImpl;


import com.example.ecommercewebsite.com.E_Commerce.entity.Category;
import com.example.ecommercewebsite.com.E_Commerce.repository.CategoryRepository;
import com.example.ecommercewebsite.com.E_Commerce.service.CategoryService;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;
import com.example.ecommercewebsite.com.E_Commerce.entity.Customer;



import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    @Override
    public Category saveCategory(Category category){
        return categoryRepository.save(category);

    }
    @Override
    public Category getCategoryById(Integer id){
        return categoryRepository.findById(id).orElse(null);

    }
    @Override
    public List<Category> getAllCategories(){
        return categoryRepository.findAll();

    }
    @Override
    public void deleteCategoryById(Integer id){
        categoryRepository.deleteById(id);
    }

    @Override
    public void deleteCategoryByName(String name) {
        categoryRepository.deleteByName(name); //
    }
}


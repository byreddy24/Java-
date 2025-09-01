package com.example.ecommercewebsite.com.E_Commerce.repository;

import com.example.ecommercewebsite.com.E_Commerce.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer>{
    void deleteByName(String name);

}

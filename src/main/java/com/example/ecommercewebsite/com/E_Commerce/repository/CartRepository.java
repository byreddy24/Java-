package com.example.ecommercewebsite.com.E_Commerce.repository;

import com.example.ecommercewebsite.com.E_Commerce.entity.Cart;
import com.example.ecommercewebsite.com.E_Commerce.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart,Integer > {
    List<Cart> findByPayment(Payment payment);

}



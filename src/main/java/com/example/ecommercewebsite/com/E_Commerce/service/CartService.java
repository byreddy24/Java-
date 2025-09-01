package com.example.ecommercewebsite.com.E_Commerce.service;

import com.example.ecommercewebsite.com.E_Commerce.entity.Cart;
import com.example.ecommercewebsite.com.E_Commerce.entity.Payment;

import java.util.List;

public interface CartService {
    Cart createcart(Cart cart);
    Cart getCartById(Integer cartId);
    List<Cart> getAllCarts();
    Cart updateCartPayment(Integer cartId, Payment payment);
    void deleteCartById(Integer cartId);
    List<Cart> getCartsByPayment(Payment payment);
    Cart saveCart(Cart cart);


}

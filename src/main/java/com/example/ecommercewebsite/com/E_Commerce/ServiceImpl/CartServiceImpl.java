package com.example.ecommercewebsite.com.E_Commerce.ServiceImpl;

import com.example.ecommercewebsite.com.E_Commerce.entity.Cart;
import com.example.ecommercewebsite.com.E_Commerce.entity.Payment;
import com.example.ecommercewebsite.com.E_Commerce.repository.CartRepository;
import com.example.ecommercewebsite.com.E_Commerce.service.CartService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class CartServiceImpl implements CartService {
    private final CartRepository cartRepository;

    public CartServiceImpl(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }
    @Override
    public Cart createcart(Cart cart){
        return  cartRepository.save(cart);

    }
    @Override
    public Cart getCartById(Integer cartId){
        return cartRepository.findById(cartId).orElse(null);

    }
    @Override
    public List<Cart> getAllCarts(){
        return cartRepository.findAll();
    }
    @Override
    public Cart updateCartPayment(Integer cartId, Payment payment){
        Cart cart = cartRepository.findById(cartId).orElseThrow(() -> new RuntimeException("Cart not found"));
        cart.setPayment(payment);
        return cartRepository.save(cart);
    }
    @Override
    public void deleteCartById(Integer cartId){
        cartRepository.deleteById(cartId);
    }
    @Override
    public List<Cart> getCartsByPayment(Payment payment) {
        return cartRepository.findByPayment(payment);
    }
    @Override
    public Cart saveCart(Cart cart){
        return cartRepository.save(cart);
    }

    }




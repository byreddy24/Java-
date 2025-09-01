package com.example.ecommercewebsite.com.E_Commerce.controller;


import com.example.ecommercewebsite.com.E_Commerce.entity.Cart;
import com.example.ecommercewebsite.com.E_Commerce.service.CartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carts")
public class CartController {
    private CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    //Create a new cart
    @PostMapping
    public Cart createCart(@RequestBody Cart cart) {
        return cartService.saveCart(cart);
    }

    @GetMapping("/{id}")
    public Cart getCartById(@PathVariable int id) {
        return cartService.getCartById(id);
    }

    @GetMapping
    public List<Cart> getAllCarts() {
        return cartService.getAllCarts();
    }
//    @DeleteMapping("{id"})
//        public void deleteCart(@PathVariable int id){
//        cartService.deleteCartById(id);
}

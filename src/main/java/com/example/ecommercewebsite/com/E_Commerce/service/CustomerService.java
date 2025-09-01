package com.example.ecommercewebsite.com.E_Commerce.service;

import com.example.ecommercewebsite.com.E_Commerce.entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer saveCustomer(Customer customer);
    Customer getCustomerById(Long id);
    List<Customer> getAllCustomers();
    void deleteCustomer(Long id);
}

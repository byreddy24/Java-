package com.example.ecommercewebsite.com.E_Commerce.service;

import com.example.ecommercewebsite.com.E_Commerce.entity.Payment;

import java.util.List;

public interface PaymentService {
    Payment savePayment(Payment payment);
    Payment getPaymentById(Long id);
    List<Payment> getAllPayments();
    void deletePayment(Long id);
//    // new methods
//    List<Payment> getPaymentsByType(String type);
//    List<Payment> getPaymentsAboveAmount(Long amount);
//    List<Payment> getPaymentsByTypeAndAmount(String type, Long minAmount);

}

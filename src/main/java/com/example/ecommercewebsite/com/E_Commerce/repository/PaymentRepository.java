package com.example.ecommercewebsite.com.E_Commerce.repository;

import com.example.ecommercewebsite.com.E_Commerce.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment,Long> {

//    List<Payment> findByType(String type);
//
//    List<Payment> findByAmountGreaterThan(Long amount);
//
//    List<Payment> findByTypeAndAmountGreaterThan(String type, Long amount);
}

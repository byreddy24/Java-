package com.example.ecommercewebsite.com.E_Commerce.ServiceImpl;

import com.example.ecommercewebsite.com.E_Commerce.entity.Payment;
import com.example.ecommercewebsite.com.E_Commerce.repository.PaymentRepository;
import com.example.ecommercewebsite.com.E_Commerce.service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {
    private final PaymentRepository paymentRepository;

    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }
    @Override
    public Payment savePayment(Payment payment){
        return paymentRepository.save(payment);
    }
    @Override
    public Payment getPaymentById(Long id){
        return paymentRepository.findById(id).orElse(null);

    }
    @Override
    public List<Payment> getAllPayments(){
        return paymentRepository.findAll();
    }
    @Override
    public  void deletePayment(Long id){
        paymentRepository.deleteById(id);
    }

}

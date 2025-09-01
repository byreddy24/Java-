package com.example.ecommercewebsite.com.E_Commerce.ServiceImpl;

import com.example.ecommercewebsite.com.E_Commerce.entity.Customer;
import com.example.ecommercewebsite.com.E_Commerce.repository.CustomerRepository;
import com.example.ecommercewebsite.com.E_Commerce.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    @Override
    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }
    @Override
    public Customer getCustomerById(Long id){
        return customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found with id " + id));
    }
    @Override
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }
    @Override
    public void deleteCustomer(Long id){
       customerRepository.deleteById(id);

    }


}

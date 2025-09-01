package com.example.ecommercewebsite.com.E_Commerce.entity;


import jakarta.persistence.*;


@Entity
@Table(name="cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Cart belongs to one Customer
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Customer customer;

    //cart has one Payment
    @OneToOne

    @JoinColumn(name = "payment_id", referencedColumnName = "payment_id")
    private Payment payment;


    //Constructors
    public Cart() {
    }

    public Cart(Long id, Customer customer, Payment payment) {
        this.id = id;
        this.customer = customer;
        this.payment = payment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}


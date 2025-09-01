package com.example.ecommercewebsite.com.E_Commerce.entity;


import jakarta.persistence.*;

@Entity
@Table(name ="payment" )
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private Long id;
    @Column(name = "Amount_paid")
    private Long amount;
    @Column(name = "payment_type")
    private String type;

    public Payment(Long id, Long amount, String type) {
        this.id = id;
        this.amount = amount;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Payment(){}

}

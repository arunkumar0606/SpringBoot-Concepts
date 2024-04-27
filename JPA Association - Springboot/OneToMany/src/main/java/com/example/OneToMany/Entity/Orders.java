package com.example.OneToMany.Entity;

import jakarta.persistence.*;

@Entity
public class Orders {

    @Id
    private int ordersId;

    private String product;


    /*
    @ManyToOne
     */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private Customer customer;


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /*
    @ManyToOne ends
     */

    public int getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(int ordersId) {
        this.ordersId = ordersId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}

package com.example.OneToMany.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Customer {

    @Id
    private int customerId;

    private String name;

    private String location;

    /*
    @OneToMany
     */
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "customer_id")
//    private List<Orders> orders;
//
//
//    public List<Orders> getOrders() {
//        return orders;
//    }
//
//    public void setOrders(List<Orders> orders) {
//        this.orders = orders;
//    }

    /*
    @OneToMany ends
     */



    /*
    @OneToMany Bidirectional
     */

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "customer")
    private List<Orders> orders;

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    /*
    @OneToMany Bidirectional ends
     */

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

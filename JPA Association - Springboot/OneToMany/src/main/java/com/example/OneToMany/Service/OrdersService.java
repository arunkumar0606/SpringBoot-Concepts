package com.example.OneToMany.Service;


import com.example.OneToMany.Entity.Orders;
import com.example.OneToMany.Repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {

    @Autowired
    OrdersRepository ordersRepository;
    public List<Orders> addOrders(List<Orders> orders) {
        return ordersRepository.saveAll(orders);
    }
}

package com.example.OneToMany.Controller;

import com.example.OneToMany.Entity.Orders;
import com.example.OneToMany.Service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrdersController {
    @Autowired
    OrdersService ordersService;

    @PostMapping("/addOrders")
    public List<Orders> addOrder(@RequestBody List<Orders> orders){
        return ordersService.addOrders(orders);
    }

}

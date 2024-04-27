package com.example.OneToMany.Controller;

import com.example.OneToMany.Entity.Customer;
import com.example.OneToMany.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/addCustomer")
    public List<Customer> addCustomer(@RequestBody List<Customer> customer){
        return customerService.addCustomer(customer);
    }
}

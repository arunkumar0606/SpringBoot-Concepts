package com.example.OneToMany.Service;


import com.example.OneToMany.Entity.Customer;
import com.example.OneToMany.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;
    public List<Customer> addCustomer(List<Customer> customer) {
        return customerRepository.saveAll(customer);
    }
}

package com.example.OneToOne.Controller;

import com.example.OneToOne.Entity.Address;
import com.example.OneToOne.Entity.Employee;
import com.example.OneToOne.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;
    @PostMapping("/addAddress")
    public List<Address> addAddress(@RequestBody List<Address> address){
        return addressService.addAddress(address);
    }
}

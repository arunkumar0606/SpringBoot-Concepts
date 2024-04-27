package com.example.OneToOne.Service;

import com.example.OneToOne.Entity.Address;
import com.example.OneToOne.Entity.Employee;
import com.example.OneToOne.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    AddressRepository addressRepository;
    public List<Address> addAddress(List<Address> address) {
        return addressRepository.saveAll(address);
    }
}

package com.example.OneToOne.Service;

import com.example.OneToOne.Entity.Employee;
import com.example.OneToOne.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> addEmployee(List<Employee> employee) {
        return employeeRepository.saveAll(employee);
    }
}

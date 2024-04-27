package com.example.OneToOne.Controller;


import com.example.OneToOne.Entity.Employee;
import com.example.OneToOne.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addEmployees")
    public List<Employee> addEmployee(@RequestBody List<Employee> employee){
        return employeeService.addEmployee(employee);
    }
}

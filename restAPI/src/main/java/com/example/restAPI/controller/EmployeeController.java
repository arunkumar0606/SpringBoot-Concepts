package com.example.restAPI.controller;

import com.example.restAPI.model.Employee;
import com.example.restAPI.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    /*
    GET
     */

    @GetMapping("/getEmployees")
    public ResponseEntity<Object> getEmployee() {
        return employeeService.getEmployees();

    }

    @GetMapping("/getEmployeesByQuery/{val}")
    public ResponseEntity<Object> getEmployeeByQuery(@PathVariable("val") int val) {
        return employeeService.getEmployeesByQuery(val);

    }


    @GetMapping("/getEmployeeSample/{id}")
    @ResponseStatus(HttpStatus.CONFLICT)
    public Employee getEmployeeSample(@PathVariable("id") int id) {
        return employeeService.getEmployeeSample(id);
    }


    @GetMapping("/getEmployee/{id}")
    // @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Object> getEmployeeByID(@PathVariable("id") int id) {
        return employeeService.getEmployeeById(id);
    }

    /*
    POST
     */

    @PostMapping("/addEmployees")
    public ResponseEntity<Object> addEmployees(@RequestBody List<Employee> employees) {
        return employeeService.addEmpoyees(employees);
    }

    @PostMapping("/addEmployeesByQuery/{age}")
    public ResponseEntity<Object> addEmployeesByQuery(@PathVariable("age") int age) {
        return employeeService.addEmployeesByQuery(age);
    }

    /*
    PUT
     */

    @PutMapping("/updateEmployee/{id}")
    public ResponseEntity<Object> updateEmployee(@RequestBody Employee employee, @PathVariable("id") int id) {
        return employeeService.updateEmployee(id, employee);
    }

    @PutMapping("/updateEmployeeByQuery/{id}/{email}")
    public ResponseEntity<Object> updateEmployeeByQuery(@PathVariable("id") int id,@PathVariable("email") String email) {
        return employeeService.updateEmployeeByQuery(id, email);
    }

    /*
    DELETE
     */

    @DeleteMapping("/deleteEmployeeById")
    public ResponseEntity<Object> deleteEmployee(@RequestParam("id") int id) {
        return employeeService.deleteEmployeeById(id);
    }

    @DeleteMapping("/deleteEmployeeByQuery")
    public ResponseEntity<Object> deleteEmployeeByQuery() {
        return employeeService.deleteEmployeeByQuery();
    }


}

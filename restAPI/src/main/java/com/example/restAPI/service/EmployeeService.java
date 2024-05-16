package com.example.restAPI.service;


import com.example.restAPI.model.Employee;
import com.example.restAPI.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    /*
    GET
     */
    public ResponseEntity<Object> getEmployees(){
        return ResponseEntity.status(HttpStatus.OK).body(employeeRepository.findAll());
    }

    public ResponseEntity<Object> getEmployeeById(int id) {
        if(employeeRepository.existsById(id)){
            return ResponseEntity.status(HttpStatus.OK).body(employeeRepository.findById(id));
        }
        else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    public Employee getEmployeeSample(int id) {

        return employeeRepository.findById(id).get();
    }

    public ResponseEntity<Object> getEmployeesByQuery(int val) {
        return ResponseEntity.status(HttpStatus.OK).body(employeeRepository.findAll());
    }

    /*
    POST
     */

    public ResponseEntity<Object> addEmpoyees(List<Employee> employees) {
        employeeRepository.saveAll(employees);
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeRepository.findAll());
    }

    public ResponseEntity<Object> addEmployeesByQuery(int age) {
        employeeRepository.addEmployeeByQuery(age);
        return ResponseEntity.status(HttpStatus.OK).body(employeeRepository.findAll());
    }

    /*
    UPDATE
     */

    public ResponseEntity<Object> updateEmployee(int id, Employee newEmployee) {
        if(employeeRepository.existsById(id)){
            Employee currentEmployee=employeeRepository.findById(id).get();
            currentEmployee.setEmpName(newEmployee.getEmpName());
            currentEmployee.setEmpAge(newEmployee.getEmpAge());
            currentEmployee.setEmpEmail(newEmployee.getEmpEmail());

            return ResponseEntity.status(HttpStatus.OK).body(employeeRepository.save(currentEmployee));
        }
        else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }


    public ResponseEntity<Object> updateEmployeeByQuery(int id, String email) {
        employeeRepository.updateEmployeeByQuery(id,email);
       return  ResponseEntity.status(HttpStatus.OK).body(employeeRepository.findAll());
    }


    /*
    DELETE
     */

    public ResponseEntity<Object> deleteEmployeeById(int id) {
        if(employeeRepository.existsById(id)){
            employeeRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(id +" - Employee Deleted");
        }
        else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    public ResponseEntity<Object> deleteEmployeeByQuery() {
        employeeRepository.deleteEmployeeByQuery();
        return  ResponseEntity.status(HttpStatus.NO_CONTENT).body(employeeRepository.findAll());
    }


}

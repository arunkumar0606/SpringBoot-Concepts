package com.example.restAPI.repository;

import com.example.restAPI.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    /*
    GET
     */
    @Query("select e from Employee e where e.empAge> ?1")
    List<Employee> getByQuery(int val);

    /*
    POST
     */

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO Employee (emp_No, emp_Name,emp_Email,emp_Age) VALUES ('7','Dhoni','dhoni@gmail.com',?1)", nativeQuery = true)
    void addEmployeeByQuery(int val);

    /*
    PUT
     */

    @Modifying
    @Transactional
    @Query(value = "UPDATE Employee SET emp_Email=?2 WHERE emp_No=?1", nativeQuery = true)
    void updateEmployeeByQuery(int id,String email);


    /*
    DELETE
     */

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM Employee WHERE emp_Age>50",nativeQuery = true)
    void deleteEmployeeByQuery();
}

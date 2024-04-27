package com.example.OneToOne.Repository;

import com.example.OneToOne.Entity.Employee;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // TODO implement required functions

}

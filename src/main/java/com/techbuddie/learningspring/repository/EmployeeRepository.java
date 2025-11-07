package com.techbuddie.learningspring.repository;

import com.techbuddie.learningspring.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    public Employee getEmployeeName() {
        return new Employee("Buddie", 123, "IT");
    }
}

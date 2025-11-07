package com.techbuddie.learningspring.service;

import com.techbuddie.learningspring.entity.Employee;
import com.techbuddie.learningspring.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee getEmployee() {
        return employeeRepository.getEmployeeName();
    }
}

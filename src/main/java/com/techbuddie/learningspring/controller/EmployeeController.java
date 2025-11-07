package com.techbuddie.learningspring.controller;

import com.techbuddie.learningspring.entity.Employee;
import com.techbuddie.learningspring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // @ResponseBody denotes that the return value will be the response body but not any view name
//    @RequestMapping(path = "/getEmployee", method = RequestMethod.GET)
    @GetMapping("/getEmployee") // @RequestMapping(path = "/getEmployee", method = RequestMethod.GET)
    public Employee getEmployee() {
        return employeeService.getEmployee();
    }

    @GetMapping("/getEmployeeById/{id}")
    public String getEmployeeById(@PathVariable int id) {
        return "Employee Details for ID: " + id;
    }

    @GetMapping("/getEmployeeByName")
    public String getEmployeeByName(@RequestParam(name = "empName") String name) {
        return "Employee Details by Name: " + name;
    }

    @PutMapping("/updateEmployee")
    public String updateEmployee() {
        return "Employee Updated";
    }

    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee employee) {
        return "Employee Added: " + employee;
    }

    @DeleteMapping("/deleteEmployee")
    public String deleteEmployee() {
        return "Employee Deleted";
    }
}

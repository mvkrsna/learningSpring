package com.techbuddie.learningspring.entity;

public class Employee {

    String name;
    Integer empId;
    String department;

    public Employee(String buddie, int i, String it) {
        this.name = buddie;
        this.empId = i;
        this.department = it;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Integer getEmpId() {
        return empId;
    }

    public String getDepartment() {
        return department;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", department='" + department + '\'' +
                '}';
    }
}

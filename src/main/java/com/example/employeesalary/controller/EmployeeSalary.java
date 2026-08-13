

package com.example.employeesalary.controller;

import com.example.employeesalary.entity.Salary;
import com.example.employeesalary.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/employeesalary")
public class EmployeeSalary {
     @Autowired
    private final RestTemplate restTemplate;

    public EmployeeSalary(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/employee/{employeeId}/salary/{salaryId}")
    public String getDetails(@PathVariable int employeeId,
                             @PathVariable int salaryId) {

        Employee employee = restTemplate.getForObject(
                "http://localhost:8081/api/employee/" + employeeId,
                Employee.class
        );

        Salary salary = restTemplate.getForObject(
                "http://localhost:8083/api/salary/" + salaryId,
                Salary.class
        );

        return "EMPLOYEE: " + employee.getName()
                + " | STATUS: " + employee.getStatus()
                + " | SALARY: " + salary.getSalary()
                + " | INCREMENT: " +salary.getIncrement();
    }
}
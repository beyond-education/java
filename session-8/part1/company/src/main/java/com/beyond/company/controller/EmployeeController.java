package com.beyond.company.controller;


import com.beyond.company.data.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("employees")
public class EmployeeController {
    private final List<Employee> employees = new ArrayList<>();

    @GetMapping
    List<Employee> getAll() {
        return employees;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Employee save(@RequestBody Employee employee) {
        String id = UUID.randomUUID().toString();
        Employee created = new Employee(id, employee.name(), employee.position());
        employees.add(created);
        return created;
    }

    @PutMapping
    Employee update(@RequestBody Employee employee) {
        employees.removeIf(element -> element.id().equals(employee.id()));
        employees.add(employee);
        return employee;
    }

    @DeleteMapping
    void deleteAll() {
        employees.clear();
    }
}

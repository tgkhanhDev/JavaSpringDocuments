package com.PracticeProject116.FiveDaysFullJava.service;

import com.PracticeProject116.FiveDaysFullJava.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(Integer id);

    void add(Employee theEmployee);
    Employee save(Employee theEmployee);

    void update(Employee theEmployee);

    void deleteById(Integer id);
}

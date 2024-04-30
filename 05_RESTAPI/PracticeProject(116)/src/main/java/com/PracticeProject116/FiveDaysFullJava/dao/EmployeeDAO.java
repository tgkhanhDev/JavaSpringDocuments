package com.PracticeProject116.FiveDaysFullJava.dao;

import com.PracticeProject116.FiveDaysFullJava.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findById(Integer id);

    void add(Employee theEmployee);

    void update(Employee theEmployee);

    Employee save(Employee theEmployee);

    void deleteById(Integer id);




}

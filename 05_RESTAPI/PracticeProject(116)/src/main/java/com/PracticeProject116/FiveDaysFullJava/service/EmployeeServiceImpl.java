package com.PracticeProject116.FiveDaysFullJava.service;

import com.PracticeProject116.FiveDaysFullJava.dao.EmployeeDAO;
import com.PracticeProject116.FiveDaysFullJava.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(Integer id) {
        return employeeDAO.findById(id);
    }

    @Override
    public void add(Employee theEmployee) {
        employeeDAO.add(theEmployee);
    }

    @Override
    @Transactional
    public Employee save(Employee theEmployee) {
        return employeeDAO.save(theEmployee);
    }

    @Override
    @Transactional
    public void update(Employee theEmployee) {
//        Employee empl = findById(theEmployee.getId());
//        if empl
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        employeeDAO.deleteById(id);
    }

}

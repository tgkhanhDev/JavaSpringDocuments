package com.DemoSpringDataJPA.DemoSpringDataJPA.service;

import com.DemoSpringDataJPA.DemoSpringDataJPA.dao.EmployeeRepository;
import com.DemoSpringDataJPA.DemoSpringDataJPA.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }



    @Override
    public List<Employee> findAll() {

        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(Integer id) {
        Optional<Employee> result = employeeRepository.findById(id);
        Employee theEmployee = null;

        if(result.isPresent()){
            theEmployee = result.get();
        }else{
            throw new RuntimeException("Did not");
        }
        return theEmployee;
    }

    @Override
    public void add(Employee theEmployee) {
//        employeeRepository.add(theEmployee);
    }

    @Override
    @Transactional
    public Employee save(Employee theEmployee) {
        return employeeRepository.save(theEmployee);
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
        employeeRepository.deleteById(id);
    }

}

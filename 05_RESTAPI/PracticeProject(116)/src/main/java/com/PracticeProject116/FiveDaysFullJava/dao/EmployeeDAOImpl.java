package com.PracticeProject116.FiveDaysFullJava.dao;

import com.PracticeProject116.FiveDaysFullJava.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    private EntityManager entityManager;

    public EmployeeDAOImpl() {
    }

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> theQuery = entityManager.createQuery("FROM Employee", Employee.class);
        // Return query results
        return theQuery.getResultList();
    }

    @Override
    public Employee findById(Integer id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public void add(Employee theEmployee) {
        entityManager.persist(theEmployee);
    }

    @Override
    public void update(Employee theEmployee) {
        entityManager.merge(theEmployee);
    }

    @Override
    public Employee save(Employee theEmployee) {
        Employee emplDB = entityManager.merge(theEmployee); //id= 0 => Add, != 0  => update

        return emplDB;
    }

    @Override
    public void deleteById(Integer id) {
        Employee empl = entityManager.find(Employee.class,id);
        entityManager.remove(empl);
    }

}

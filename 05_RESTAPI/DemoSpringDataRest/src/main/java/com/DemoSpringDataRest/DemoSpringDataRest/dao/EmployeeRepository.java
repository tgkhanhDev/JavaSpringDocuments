package com.DemoSpringDataRest.DemoSpringDataRest.dao;

import com.DemoSpringDataRest.DemoSpringDataRest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
//    Employee findByName(String name);
}

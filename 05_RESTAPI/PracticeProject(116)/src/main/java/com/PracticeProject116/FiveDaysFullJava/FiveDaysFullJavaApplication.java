package com.PracticeProject116.FiveDaysFullJava;

import com.PracticeProject116.FiveDaysFullJava.entity.Employee;
import com.PracticeProject116.FiveDaysFullJava.dao.EmployeeDAOImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class FiveDaysFullJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FiveDaysFullJavaApplication.class, args);
	}

	private void updateEmploy(EmployeeDAOImpl employeedao, int id) {
		//FIND id:
		Employee tempEm = employeedao.findById(id);
		System.out.println("Employee found: "+ tempEm);

		tempEm.setFirstName("cccc");
		System.out.println("Set First name to cccc...");

		employeedao.update(tempEm);

	}

	private void readEmployeeById(EmployeeDAOImpl employeedao, int i) {
		Employee employeeRs=employeedao.findById(i);
		System.out.println("...Found: "+ employeeRs);
	}

	private void deleteEmployee(EmployeeDAOImpl employeedao, int id) {
		employeedao.deleteById(id);
		System.out.println("Deleted Success!!!");
	}

	private void addEmployee(EmployeeDAOImpl employeedao, Employee tempEmployee) {
		System.out.println("Save the student: ");
		employeedao.add(tempEmployee);
		System.out.println("Saved...");
	}

	private void readEmployee(EmployeeDAOImpl employeedao) {
		List<Employee> list = employeedao.findAll();
		for (Employee p : list){
			System.out.println(p);
		}
	}

}

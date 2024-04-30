package com.DemoSpringDataJPA.DemoSpringDataJPA.rest;

import com.DemoSpringDataJPA.DemoSpringDataJPA.entity.Employee;
import com.DemoSpringDataJPA.DemoSpringDataJPA.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/listEmployee")
    public List<Employee> getAllEmployee(){
        return employeeService.findAll();
    }

    @GetMapping("/getEmployee/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        Employee theEmpl = employeeService.findById(id);

        if(theEmpl == null){
            throw  new RuntimeException("Employee id not found - "+id);
        }
        return  theEmpl;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee){
        theEmployee.setId(0);
        Employee dbEmployee = employeeService.save(theEmployee);
        return dbEmployee;
    }

    @PutMapping("/employees")
    public Employee putEmployee(@RequestBody Employee theEmployee){
        Employee dbEmployee = employeeService.save(theEmployee);
        return dbEmployee;
    }


    @DeleteMapping("/employees/{id}")
    public String delEmployee(@PathVariable int id){
        Employee dbEmployee = employeeService.findById(id);
        if(dbEmployee == null){
            throw new RuntimeException("Employee id not found - "+ id);
        }
        employeeService.deleteById(id);
        return "Deleted";
    }


//    @GetMapping("/Employee/{id}")
//    public Employee getEmployeeById(@PathVariable int id){
//        return employeeService.findById(id);
//    }

}

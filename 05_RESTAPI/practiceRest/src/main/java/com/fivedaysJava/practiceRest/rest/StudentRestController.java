package com.fivedaysJava.practiceRest.rest;

import com.fivedaysJava.practiceRest.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    //define endpoint for "/students" - return a list of students
    private List<Student> theStudents;

    // define @PostConstuct to load the student data ... only once!
    @PostConstruct
    public void loadData(){
        theStudents = new ArrayList<>();
        theStudents.add(new Student("Poornima","Patel"));
        theStudents.add(new Student("Mario","Rossi"));
        theStudents.add(new Student("Mary","Smith"));
    }

    @GetMapping("/students")
    public List<Student> getStudents(){

        return theStudents;
    }

    // define endpoint of "/students/{studentID}" - return student at index
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        //just index into the list ...

        //cjeck the studentId again list size

        if( (studentId >= theStudents.size()  || (studentId < 0 )) ){
            throw new StudentNotFoundException("Student id not found - "+ studentId);
        }


        return theStudents.get(studentId);
    }


}

package com.DaysOfJava.Hibernate;

import com.DaysOfJava.Hibernate.dao.StudentDAO;
import com.DaysOfJava.Hibernate.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class HibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
//			createStudent(studentDAO);
			createMultipleStudents(studentDAO);

//			readStudent(studentDAO);
//			queryForStudents(studentDAO);
//			queryForStudentsByLastName(studentDAO);
//			updateStudent(studentDAO);
//			deleteStudent(studentDAO);
//			deleteAllStudents(studentDAO);
		};

	}

	private void deleteAllStudents(StudentDAO studentDAO) {
		System.out.println("Deleting all students");
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println("Deleted row count: "+ numRowsDeleted);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 3;
		System.out.println("Deleted student id: "+ studentId);
		studentDAO.delete(studentId);
	}

	private void updateStudent(StudentDAO studentDAO) {

		//retrieve student based on the id: primary key
		int studentID= 1;
		System.out.println("Getting student with id: "+ studentID);
		Student myStudent = studentDAO.findById(studentID);
		// change first name to "Scooby"
		System.out.println("Updating student...");
		myStudent.setFirstName("Scooby");
		//update the student
		studentDAO.update(myStudent);
		//display the updated student
		System.out.println("Update student: "+ myStudent);
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		//get a list of students
		List<Student> theStudents = studentDAO.findByLastName("Doe");

		//display list of students
		for (Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}

	}

	private void queryForStudents(StudentDAO studentDAO) {
		//get a list of students
		List<Student> theStudents = studentDAO.findAll();

		//display list of students
		for (Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}

	}

	private void readStudent(StudentDAO studentDAO) {
		//Create a student object
		System.out.println("Creating new Student obj...");
		Student tempStu = new Student("Daffy","Duck","abc@gmadsada.com");

		//save the student
		System.out.println("Save the student: ");
		studentDAO.save(tempStu);
		//display id of the saved student
		int theId = tempStu.getId();
		System.out.println("Saved..., Generated id: "+ theId);

		//retrieve students based on the id: primary key
		System.out.println("Retrieve student with id: "+ theId);
		Student myStudent = studentDAO.findById(theId);

		//display stu
		System.out.println("Found the student: "+ myStudent );
	}

	private void createStudent(StudentDAO studentDAO) {
		//create the student object
		System.out.println("Creating new Student obj");
		Student tempStudent = new Student("Paul","Doe", "abc@gmail.com");
		//save the student object
		System.out.println("Save the student: ");
		studentDAO.save(tempStudent);

		//display id of the saved student
		System.out.println("Saved..., Generated id: "+ tempStudent.getId());

	}


	private void createMultipleStudents(StudentDAO studentDAO) {
		// create multiple students
		System.out.println("Creating new Student obj...");
		Student tempStudent1 = new Student("Paul1","Doe1", "abc1@gmail.com");
		Student tempStudent2 = new Student("Paul2","Doe2", "abc2@gmail.com");
		Student tempStudent3 = new Student("Paul3","Doe3", "abc3@gmail.com");

		//save the student objects
		System.out.println("Save these students...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);


		//display id of the saved student
		System.out.println("Saved..., Generated id... ");

	}
}

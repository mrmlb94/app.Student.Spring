package com.mrmlb.app;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.mrmlb.app.model.Student;
import com.mrmlb.app.service.StudentService;

@SpringBootApplication
public class SpringJdbcExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringJdbcExampleApplication.class, args);
		
		Student s = context.getBean(Student.class);
		s.setRollNo(001);
		s.setName("Reza");
		s.setMarks(29);
		
		
		
		StudentService service = context.getBean(StudentService.class);

		service.addStudent(s);
		
		List<Student> students = service.getStudents();
		System.out.println(students);

		
		
		
		
		System.out.println("_____________________");
		System.out.println("_____________________");
		System.out.println("_____________________");
		System.out.println("");
		System.out.println("Everything is okay !!");
		System.out.println("_____________________");
		System.out.println("_____________________");
		System.out.println("_____________________");		
		System.out.println("");


		
	}

}

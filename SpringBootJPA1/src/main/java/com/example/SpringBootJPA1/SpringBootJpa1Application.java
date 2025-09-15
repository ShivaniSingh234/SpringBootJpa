package com.example.SpringBootJPA1;
import org.springframework.context.ApplicationContext;

import com.example.SpringBootJPA1.entity.Student;
import com.example.SpringBootJPA1.services.StudentService;
import com.example.SpringBootJPA1.services.StudentServiceImp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJpa1Application {

	public static void main(String[] args) {
	ApplicationContext context	 = SpringApplication.run(SpringBootJpa1Application.class, args);
	StudentService stdService= context.getBean(StudentServiceImp.class);
	
	Student std= new Student();
	std.setName("shloka");
	std.setRollno(106);
	std.setMarks(94.4f);
	
	boolean status =  stdService.addStudentDetails(std);
	if(status)
	{
		System.out.println("Student inserted successfully");
	}
	else
	{
		System.out.println("Student not inserted due to some error");
	}
	
	
	
	}

}

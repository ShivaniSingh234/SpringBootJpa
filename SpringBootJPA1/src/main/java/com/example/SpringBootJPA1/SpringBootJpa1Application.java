package com.example.SpringBootJPA1;
import org.springframework.context.ApplicationContext;

import com.example.SpringBootJPA1.entity.Student;
import com.example.SpringBootJPA1.services.StudentService;
import com.example.SpringBootJPA1.services.StudentServiceImp;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJpa1Application {

	public static void main(String[] args) {
	ApplicationContext context	 = SpringApplication.run(SpringBootJpa1Application.class, args);
	StudentService stdService= context.getBean(StudentServiceImp.class);
	
	
	
	
	// ----------for insertion-----
//	Student std= new Student();
//	std.setName("shloka");
//	std.setRollno(106);
//	std.setMarks(94.4f);
//	
//	boolean status =  stdService.addStudentDetails(std);
//	if(status)
//	{
//		System.out.println("Student inserted successfully");
//	}
//	else
//	{
//		System.out.println("Student not inserted due to some error");
//	}
//	
	
	//---------select operation----------------
//	
//	List<Student> stdList = stdService.getAllStdDetails();
//	for(Student std : stdList)
//	{
//		System.out.println("Id: " + std.getId());
//		System.out.println("Name: " + std.getName());
//		System.out.println("RollNo: " + std.getRollno());
//		System.out.println("Marks: " + std.getMarks());
//		
//		System.out.println("------------------------------------");
//	}
//	
	//-----------select operation 2---------------
	Student std = stdService.getStdDetails(3L);
	if(std !=null) {
		
		System.out.println("Id: " + std.getId());
		System.out.println("Name: " + std.getName());
		System.out.println("RollNo: " + std.getRollno());
		System.out.println("Marks: " + std.getMarks());
		
	}
	else
	{
		System.out.println("Student not found");
	}

	
	}

}

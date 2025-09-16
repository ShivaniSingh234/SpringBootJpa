package com.example.SpringBootJPA1.services;

import java.util.List;

import com.example.SpringBootJPA1.entity.Student;

public interface StudentService {
	
	public boolean addStudentDetails(Student std);
	public List<Student> getAllStdDetails();
	public Student getStdDetails(long id);
}

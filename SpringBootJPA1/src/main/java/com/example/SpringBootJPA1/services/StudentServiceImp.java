package com.example.SpringBootJPA1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootJPA1.entity.Student;
import com.example.SpringBootJPA1.repo.StudentRepository;


@Service
public class StudentServiceImp implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public boolean addStudentDetails(Student std) {
		boolean status =false;
		try
		{
			studentRepository.save(std);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			status =false;
		}
		return status;
	}
	
}

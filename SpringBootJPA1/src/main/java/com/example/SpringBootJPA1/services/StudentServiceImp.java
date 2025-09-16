package com.example.SpringBootJPA1.services;

import java.util.List;
import java.util.Optional;

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
			status = true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			status =false;
		}
		return status;
	}

	@Override
	public List<Student> getAllStdDetails() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student getStdDetails(long id) {
		
		Optional<Student> optional = studentRepository.findById(id);
		if(optional.isPresent())
		{
			return optional.get();
		}
		else
		{
			return null;
		}
		
	}
	
}

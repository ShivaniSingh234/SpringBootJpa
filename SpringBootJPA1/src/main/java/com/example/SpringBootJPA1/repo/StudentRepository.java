package com.example.SpringBootJPA1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootJPA1.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	
}

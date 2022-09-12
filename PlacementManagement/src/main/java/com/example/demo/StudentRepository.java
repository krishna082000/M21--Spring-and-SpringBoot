package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

/*
  Jpa repository is exist in spring data Jpa dependencies 
 while creating the project added it 
 
 */

public interface StudentRepository extends JpaRepository<Student, Integer>
{
	

}

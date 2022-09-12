package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentService
{
	@Autowired //to inject body dependency
	private StudentRepository rapo;
	
	//create or insert
	public void create (Student s)
	{
		rapo.save(s);
	}
	
	//retrieve
	public Student retrieve(Integer id)
	{
		return rapo.findById(id).get();
		
	}
	
	//retrieve all the data
	public List<Student>retrieveall()
	{
		return rapo.findAll();
	}
	
	//delete
	public void delete(Integer id)
	{
		rapo.deleteById(id);
	}

}

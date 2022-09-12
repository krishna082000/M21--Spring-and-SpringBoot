package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
{
	@Autowired
	private StudentService service;
	
	//restful API method to create operation
	@PostMapping("student")
	public void add(@RequestBody Student s)
	{
		service.create(s);
	}
	
	//restful API method for delete operation 
	public void remove(@PathVariable Integer id)
	{
		service.delete(id);
	}
	
	//restful API method for update operation 
	@PutMapping("student")
	
	public ResponseEntity<?> update(@RequestBody Student s, @PathVariable Integer id)
	{
		try 
		{
			@SuppressWarnings("unused")
			Student exitobject=service.retrieve(id);
			service.create(s);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e) 
		{
			return new  ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	//restful API method for retrieve operation 
	@GetMapping("/student/{id}")
	public ResponseEntity<Student> update(@PathVariable Integer id)
	{
		try 
		{
			Student s=service.retrieve(id);
			return new ResponseEntity<Student>(s,HttpStatus.OK);
		}
		catch(NoSuchElementException e) 
		{
			return new  ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	//restful API method for retrieve All operation
	@GetMapping("/student")
	public List<Student>listAll()
	{
		return service.retrieveall();
	}
}


package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStarterProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStarterProjectApplication.class, args);
		String str="Welcome to Spring Boot";
		System.out.println(str);
		Employee e=new Employee();
		e.print();
	}

}

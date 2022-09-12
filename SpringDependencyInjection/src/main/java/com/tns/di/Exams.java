package com.tns.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exams {
	public static void main(String[] args) {


	System.out.println("Welcome to Spring:::");
	
	ApplicationContext a= new ClassPathXmlApplicationContext("Config.xml");
	Student  st=(Student)a.getBean("student2");
	System.out.println(st);

}
}

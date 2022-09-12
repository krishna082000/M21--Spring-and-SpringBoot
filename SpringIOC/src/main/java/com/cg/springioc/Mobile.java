package com.cg.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
	/*	Agenda
	 * 1.This application should be configurable
	 * 2.We Should not touch the source code
	 * 
	 * //for vi class method
		VI a=new VI();
		a.calling();
		a.data();	
		//for jio class method
		Jio b=new Jio();
		b.calling();
		b.data(); */
		
		ApplicationContext a = new  ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Configuration Loaded");
		/*//For VI
		VI x= (VI)a.getBean("VI");
        x.calling();
		x.data();
		
		//for Jio
		Jio y = (Jio)b.getBean("Jio");
        y.calling();
		y.data();
		*/
		Sim s=a.getBean("sim",Sim.class);
		s.calling();
		s.data();
		
	}

}

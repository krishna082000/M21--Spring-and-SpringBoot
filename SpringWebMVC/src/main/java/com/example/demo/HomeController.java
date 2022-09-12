package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
@Controller //request and response from web

public class HomeController 
{
		public  String home()
		{
			System.out.println("Hey Guys! Welcome to Java Full Stack Program ");
			return "home.txt";
		}
}

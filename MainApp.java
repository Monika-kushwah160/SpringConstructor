package com.springProject.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) 
	{
		System.out.println("start program");
		 System.out.println();
		 ApplicationContext context= new ClassPathXmlApplicationContext("com/springProject/constructor/cIConfig.xml");
		 
		 Student1 s = (Student1) context.getBean("std");
		 s.run();
		 
		 
		 Product p = (Product) context.getBean("pdt");
		 p.print();

	}

}

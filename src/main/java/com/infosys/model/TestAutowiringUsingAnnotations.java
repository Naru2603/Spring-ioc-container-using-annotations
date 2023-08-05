package com.infosys.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowiringUsingAnnotations {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("AutowiringSpringBeans.xml");
		
		Car car = context.getBean("car",Car.class);
		System.out.println(car);

		Student student1 =context.getBean("std1", Student.class);
		System.out.println(student1);
		
	}

}

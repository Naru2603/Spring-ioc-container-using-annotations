package com.infosys.javabasedconfig.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestQualifier {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		

		Student std1 = context.getBean(Student.class);
		System.out.println(std1);
	}

}

package com.infosys.SpringAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudentUsingAnnotations {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("StudentAnnotationSpringBeans.xml");
		
		Student student1 = context.getBean("std1",Student.class);
		System.out.println(student1);
		
		Student student2 = context.getBean("std2",Student.class);
		System.out.println(student2);
	}

}

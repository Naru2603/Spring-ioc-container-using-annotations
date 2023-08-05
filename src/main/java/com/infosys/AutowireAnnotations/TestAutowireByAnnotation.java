package com.infosys.AutowireAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowireByAnnotation {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("AutowiringByAnnotationSpringBeans.xml");
		
		Employee emp = context.getBean("employee",Employee.class);
		System.out.println(emp);
		
		Employee emp1 = context.getBean("emp",Employee.class);
		System.out.println(emp1);
		
		Manager m1 = context.getBean(Manager.class);
		System.out.println(m1);

	}

}

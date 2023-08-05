package com.infosys.dependson;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDependsOn {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		
		A a= context.getBean(A.class);
		B b= context.getBean(B.class);
		C c= context.getBean(C.class);
		
	}

}

package com.infosys.propertySource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPropertySourceAnnotation {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DbConfig.class);
		
		MyDatabaseDetails db = context.getBean(MyDatabaseDetails.class);
		
		System.out.println(db);

	}

}

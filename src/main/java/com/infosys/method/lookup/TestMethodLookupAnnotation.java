package com.infosys.method.lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMethodLookupAnnotation {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MethodLookupConfig.class);
	
		FourWheeler fw = context.getBean(FourWheeler.class);
		System.out.println(fw);
		
		FourWheeler fw2 = context.getBean(FourWheeler.class);
		System.out.println(fw2);
		
		System.out.println(fw == fw2);
		
		System.out.println(fw.getEngine() ==  fw2.getEngine());

	}

}

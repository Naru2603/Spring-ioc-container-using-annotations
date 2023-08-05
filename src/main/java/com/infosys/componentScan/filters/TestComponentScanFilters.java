package com.infosys.componentScan.filters;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestComponentScanFilters {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
		
		System.out.println("bean count is :- "+ context.getBeanDefinitionCount());
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

	}

}

package com.infosys.dependson;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn({"BeanB","BeanC"})
public class A {

	public A() {
		super();
		System.out.println("No-arg constructor of A class is invoked");
	}

	
}

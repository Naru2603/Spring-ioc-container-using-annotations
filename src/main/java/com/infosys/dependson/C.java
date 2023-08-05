package com.infosys.dependson;

import org.springframework.stereotype.Component;

@Component("BeanC")
public class C {

	public C() {
		super();
		System.out.println("No-arg constructor of C class is invoked");
	}

}

package com.infosys.dependson;

import org.springframework.stereotype.Component;

@Component("BeanB")
public class B {

	public B() {
		super();
		System.out.println("No-arg constructor of B class is invoked");
	}

}

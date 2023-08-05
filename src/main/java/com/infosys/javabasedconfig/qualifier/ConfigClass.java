package com.infosys.javabasedconfig.qualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.infosys.javabasedconfig.qualifier")
public class ConfigClass {

	@Bean
	public Address address1() {
		return new Address (123, "Kolhapur");
	}
	
	@Bean
	public Address address2() {
		return new Address (842, "Hupari");
	}
}

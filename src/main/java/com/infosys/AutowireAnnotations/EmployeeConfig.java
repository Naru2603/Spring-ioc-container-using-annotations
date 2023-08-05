package com.infosys.AutowireAnnotations;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {
	
	@Bean(name ="emp", autowire=Autowire.BY_NAME)
	public Employee getEmployee1() {
		 
		
		Employee e1 = new Employee();
		e1.setId(10);
		e1.setName("Shravani");
		
		return e1;
		
	}
}

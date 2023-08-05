package com.infosys.SpringAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class StudentConfig {

	@Bean(value ="std1")
	public Student getStudent() {
		
		Student s = new Student();
		s.setRoll(95);
		s.setName("Narendra");
		s.setAddress("Kolhapur");
		return s;
	}
		@Bean(value ="std2")
		public Student getStudent1() {
			
			Student s2 = new Student();
			s2.setRoll(101);
			s2.setName("Bashya");
			s2.setAddress("Bangalore");
			return s2;
			
	}

}

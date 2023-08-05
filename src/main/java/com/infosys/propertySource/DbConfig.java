package com.infosys.propertySource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("classpath:db.properties")
//@ComponentScan("com.infosys.propertySource")
public class DbConfig {

	@Autowired
	Environment env;

	@Bean
	public MyDatabaseDetails dbDetails() {
		
		MyDatabaseDetails dbdetails = new MyDatabaseDetails();
		dbdetails.setUrl(env.getProperty("dburl"));
		dbdetails.setUserName(env.getProperty("dbusername"));
		dbdetails.setPassword(env.getProperty("dbpassword"));
		
		return dbdetails;
	}
}

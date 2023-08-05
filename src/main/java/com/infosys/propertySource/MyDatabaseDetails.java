package com.infosys.propertySource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//@Component
//@PropertySource("classpath:db.properties")
public class MyDatabaseDetails {

//	@Value("${dburl}")
	String userName;
	
//	@Value("${dbusername}")
	String url;
	
//	@Value("${dbpassword}")
	String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "MyDatabaseDetails [userName=" + userName + ", url=" + url + ", password=" + password + "]";
	}

}

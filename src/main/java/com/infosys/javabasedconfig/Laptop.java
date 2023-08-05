package com.infosys.javabasedconfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Laptop extends Device{

	private boolean touchScreen;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(String name, double price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	public boolean isTouchScreen() {
		return touchScreen;
	}

	public void setTouchScreen(boolean touchScreen) {
		this.touchScreen = touchScreen;
	}

	@PostConstruct
	public void init() {
		System.out.println("Laptop bean is created ");
	}
	
	@PreDestroy
	public void Destroy() {
		System.out.println("Laptop bean is destroyed");
	}
}

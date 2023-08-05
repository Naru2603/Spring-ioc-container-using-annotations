package com.infosys.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Car {

	int model;
	String company;
	Engine engine;

	public Car() {
		super();
		System.out.println("setting engine by Setter method");
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public Car(Engine engine) {
		super();
		this.engine = engine;
		System.out.println("Setting engine by constructor");
	}


	public Car(int model, String company, Engine engine) {
		super();
		this.model = model;
		this.company = company;
		this.engine = engine;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public Engine getEngine() {
		return engine;
	}
	@Autowired
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", company=" + company + ", engine=" + engine + "]";
	}

}

package com.infosys.javabasedconfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Mobile extends Device {

	private int batteryCapacity;

	public Mobile() {
		super();
	}

	public Mobile(String name, double price) {
		super(name, price);
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	@PostConstruct
	public void init() {
		System.out.println("Mobile bean is created ");
	}
	
	@PreDestroy
	public void Destroy() {
		System.out.println("Mobile bean is destroyed");
	}
}

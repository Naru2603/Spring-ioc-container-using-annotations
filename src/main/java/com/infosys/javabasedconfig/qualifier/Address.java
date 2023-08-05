package com.infosys.javabasedconfig.qualifier;

public class Address {

	private int pin;
	private String city;

	public Address() {
		super();
//		System.out.println("Address No-arg constructor is Invoked..!!");
	}

	public Address(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
		System.out.println("Address All-arg constructor is Invoked..!!");
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "]";
	}

}

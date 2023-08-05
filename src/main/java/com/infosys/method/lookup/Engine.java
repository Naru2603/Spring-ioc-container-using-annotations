package com.infosys.method.lookup;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Engine {

	@Value("2")
	int capacity;
	
	@Value("V12")
	String type;
	
	@Value("3000")
	int powerHp;
	
	

	public Engine(int capacity, String type, int powerHp) {
		super();
		this.capacity = capacity;
		this.type = type;
		this.powerHp = powerHp;
	}

	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPowerHp() {
		return powerHp;
	}

	public void setPowerHp(int powerHp) {
		this.powerHp = powerHp;
	}

	@Override
	public String toString() {
		return "Engine [capacity=" + capacity + ", type=" + type + ", powerHp=" + powerHp + "]";
	}

}

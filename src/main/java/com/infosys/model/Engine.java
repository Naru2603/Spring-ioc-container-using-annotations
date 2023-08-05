package com.infosys.model;

public class Engine {

	int capacity;
	String type;

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

	@Override
	public String toString() {
		return "Engine [capacity=" + capacity + ", type=" + type + "]";
	}

}

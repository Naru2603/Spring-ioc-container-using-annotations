package com.infosys.javabasedconfig;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Lazy
@Component
@Scope("prototype")
public class shoppingList {

	List<Device> items = new ArrayList<Device>();

	public List<Device> getItems() {
		return items;
	}

	public void addItem(Device device) {
		items.add(device);
	}

	@PostConstruct
	public void init() {
		System.out.println("shoppingList bean is created ");
	}
	
	@PreDestroy
	public void Destroy() {
		System.out.println("shoppingList bean is destroyed");
	}
}

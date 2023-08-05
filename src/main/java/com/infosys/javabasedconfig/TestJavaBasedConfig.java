package com.infosys.javabasedconfig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestJavaBasedConfig {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ShoppingListConfig.class);

		System.out.println("Total beans : " + context.getBeanDefinitionCount());

		System.out.println("Bean Names : " + Arrays.toString(context.getBeanDefinitionNames()));

		Device lenovoLaptop = context.getBean("lenovo", Device.class);
		Device hpLaptop = context.getBean("hp", Device.class);

//		Device iphone1 = context.getBean( Mobile.class);
//		Device vivo1 = context.getBean(Mobile.class);

		Device iphone = context.getBean("iphone", Mobile.class);
		Device vivo = context.getBean("vivo", Mobile.class);

		System.out.println(lenovoLaptop);
		System.out.println(hpLaptop);
		System.out.println(iphone);
		System.out.println(vivo);

		shoppingList list = context.getBean(shoppingList.class);
		list.addItem(iphone);
		list.addItem(lenovoLaptop);

		System.out.println("ShoppingListt : " + list.getItems());

		shoppingList list2 = context.getBean(shoppingList.class);

		list2.addItem(vivo);
		list2.addItem(hpLaptop);

		System.out.println("ShoppingListt : " + list2.getItems());

		System.out.println(list == list2);

		System.out.println("Total beans : " + context.getBeanDefinitionCount());

		System.out.println("Bean Names : " + Arrays.toString(context.getBeanDefinitionNames()));

	}

}

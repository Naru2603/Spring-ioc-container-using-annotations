package com.infosys.javabasedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;

//@Lazy
@Configuration
@ComponentScan("com.infosys.javabasedconfig")
public class ShoppingListConfig {

	@Bean(name = "lenovo")
//	@Lazy
	public Device getLenovo() {
		Laptop lenovo = new Laptop();
		lenovo.setName("Lenovo thinkPad");
		lenovo.setPrice(70000);
		lenovo.setTouchScreen(true);

		return lenovo;
	}

//	@Lazy
	@Bean(name = "hp")
	public Device getHpLaptop() {
		Laptop hp = new Laptop();
		hp.setName("Probook");
		hp.setPrice(45000);
		hp.setTouchScreen(false);

		return hp;
	}

	@Bean(name = "iphone")
	@Primary
	public Device getIphone() {
		Mobile iphone = new Mobile();
		iphone.setName("iphone 12 Pro max");
		iphone.setPrice(45000);
		iphone.setBatteryCapacity(3500);

		return iphone;
	}

	@Bean(name = "vivo")
	public Device getVivo() {
		Mobile vivo = new Mobile();
		vivo.setName("Vivo V3");
		vivo.setPrice(17900);
		vivo.setBatteryCapacity(5000);

		return vivo;
	}
}

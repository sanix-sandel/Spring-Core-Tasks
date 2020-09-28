package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);

		ApplicationContext context=
				new AnnotationConfigApplicationContext(ShopConfiguration.class);
		Product aaa=context.getBean("aaa", Product.class);
		Product cdrw=context.getBean("cdrw", Product.class);
		Product dvdrw =context.getBean("dvdrw", Product.class);

		ShoppingCart cart1=context.getBean("shoppingCart", ShoppingCart.class);
		cart1.addItem(aaa);
		cart1.addItem(cdrw);
		System.out.println("Shopping Cart 1 contains "+cart1.getItems());

		ShoppingCart cart2=context.getBean("shoppingCart", ShoppingCart.class);
		cart2.addItem(dvdrw);
		System.out.println("Shopping cart 2 contains "+cart2.getItems());

		//the two customer will get the same shopping cart instance
		//Because Spring's default bean scope is singleton which
		//means Spring creates exactly one Shopping Cart instance
		//per IoC container
		//to get different instances the scope of ShoppingCart bean needs
		//to be set to prototype
	}

}

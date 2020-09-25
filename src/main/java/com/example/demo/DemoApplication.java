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
		System.out.println(aaa);
		System.out.println(cdrw);
	}

}

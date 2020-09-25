package com.example.demo;

import com.example.demo.config.SequenceGeneratorConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		ApplicationContext context=new AnnotationConfigApplicationContext(
				SequenceGeneratorConfiguration.class
		);

		SequenceGenerator generator =
				(SequenceGenerator) context.getBean("sequenceGenerator", SequenceGenerator.class);
		//If there is only a single bean, you can omit the bean name.
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
	}

}

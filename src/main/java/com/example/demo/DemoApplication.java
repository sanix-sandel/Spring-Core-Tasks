package com.example.demo;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

//the following component scan includes all classes
// in com.apress.springrecipes.sequence
//whose name contains the word Dao or Service and
// excludes the classes with the @Controller annotation:
@SpringBootApplication
@ComponentScan(
		includeFilters = {
				@ComponentScan.Filter(
						type = FilterType.REGEX,
						pattern = {"com.apress.springrecipes.sequence.*Dao",
						"com.apress.springrecipes.sequence.*Service"})
		},
		excludeFilters = {
				@ComponentScan.Filter(
						type = FilterType.ANNOTATION,
						classes = {org.springframework.stereotype.Controller.class}) }
)
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);

	}

}
//When applying include filters to detect all classes
// whose name contains the word Dao or Service, even
//classes that don’t have annotations are autodetected.
package com.nishant.spring.basics.springbasics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.nishant.spring.basics.springbasics.properties.SomeExternalProperty;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringBasicsPropertiesApplication {

	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBasicsPropertiesApplication.class)) {
			SomeExternalProperty service = applicationContext.getBean(SomeExternalProperty.class);
			System.out.println(service.returnPropertyValue());
		}
	}
}

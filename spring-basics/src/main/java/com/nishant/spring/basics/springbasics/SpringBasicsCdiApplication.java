package com.nishant.spring.basics.springbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nishant.spring.basics.springbasics.cdi.SomeCdiBusiness;

@Configuration
@ComponentScan
public class SpringBasicsCdiApplication { 
	
	private static Logger LOG = LoggerFactory.getLogger(SpringBasicsCdiApplication.class);
			
	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBasicsCdiApplication.class)) {
			SomeCdiBusiness someCdiBusiness = applicationContext.getBean(SomeCdiBusiness.class);
			
			LOG.info("{}", someCdiBusiness);
			LOG.info("{}", someCdiBusiness.getSomeCdiDao());
		}
	}
}

package com.nishant.spring.basics.springbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nishant.spring.basics.componentscan.ComponentDAO;

@Configuration
@ComponentScan("com.nishant.spring.basics.componentscan")
public class SpringBasicsComponentScanApplication { 
	
	private static Logger LOG = LoggerFactory.getLogger(SpringBasicsComponentScanApplication.class);
			
	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBasicsComponentScanApplication.class)) {
			ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);
			LOG.info("{}", componentDao);
		}
	}
}

package com.nishant.spring.basics.springbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nishant.spring.basics.springbasics.scope.PersonDAO;

@Configuration
@ComponentScan
public class SpringBasicsScopeApplication { 
	
	private static Logger LOG = LoggerFactory.getLogger(SpringBasicsScopeApplication.class);
			
	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBasicsScopeApplication.class)) {
			PersonDAO personDao1 = applicationContext.getBean(PersonDAO.class);
			PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);
			
			LOG.info("{}", personDao1);
			LOG.info("{}", personDao1.getJdbcConnection());
			LOG.info("{}", personDao2);
			LOG.info("{}", personDao2.getJdbcConnection());
		}
	}
}

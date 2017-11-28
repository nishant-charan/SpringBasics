package com.nishant.spring.basics.springbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nishant.spring.basics.springbasics.xml.XmlPersonService;

@Configuration
@ComponentScan
public class SpringBasicsXMLApplication { 
	
	private static Logger LOG = LoggerFactory.getLogger(SpringBasicsXMLApplication.class);
			
	public static void main(String[] args) {
		
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			XmlPersonService xmlPersonService = applicationContext.getBean(XmlPersonService.class);
			
			LOG.info("Beans Loaded -> {}", (Object)applicationContext.getBeanDefinitionNames());
			
			LOG.info("XmlPersonService :: {}", xmlPersonService);
			LOG.info("XmlPersonDAO :: {}", xmlPersonService.getXmlPersonDAO());
			LOG.info("XmlClassDAO :: {}", xmlPersonService.getXmlClassDAO());
			LOG.info("XmlPersonJDBCConnection :: {}", xmlPersonService.getXmlPersonDAO().getXmlJdbcConnection());
			LOG.info("XmlClassJDBCConnection :: {}", xmlPersonService.getXmlClassDAO().getXmlJdbcConnection());
		}
	}
}

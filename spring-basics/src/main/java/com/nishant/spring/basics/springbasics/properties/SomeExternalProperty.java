package com.nishant.spring.basics.springbasics.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SomeExternalProperty {
	
	@Value("${some.external.url}")
	public String url;
	
	public String returnPropertyValue() {
		return url;
	}

}

package com.nishant.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {
	
	@Autowired
	private ComponentJDBCConnection componentJdbcConnection;

	public ComponentJDBCConnection getComponentJdbcConnection() {
		return componentJdbcConnection;
	}

	public void setComponentJdbcConnection(ComponentJDBCConnection componentJdbcConnection) {
		this.componentJdbcConnection = componentJdbcConnection;
	}

	

}
